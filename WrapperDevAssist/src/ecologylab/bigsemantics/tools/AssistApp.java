package ecologylab.bigsemantics.tools;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URI;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author quyin
 */
public class AssistApp extends WindowAdapter
{

  static Logger logger        = LoggerFactory.getLogger(AssistApp.class);

  static int    LOW_MEM_IN_MB = 128;

  private File  bsWrappersDir;

  private File  bsServiceDir;

  private File  bsJsDir;

  JButton       btnUpdate;

  JTextArea     textArea;

  JFrame        frame;

  AntRunner     antRunner;

  BSService     service;

  public AssistApp(Configuration configs)
  {
    createAndDisplayGUI();
    info("Initializing...");

    while (bsWrappersDir == null)
    {
      bsWrappersDir = PathUtil.checkAndChooseDir(frame,
                                                 configs.getString("bigsemantics_wrappers_dir"),
                                                 "BigSemanticsWrappers directory");
    }

    while (bsServiceDir == null)
    {
      bsServiceDir = PathUtil.checkAndChooseDir(frame,
                                                configs.getString("bigsemantics_service_dir"),
                                                "BigSemanticsService project directory");
    }

    while (bsJsDir == null)
    {
      bsJsDir = PathUtil.checkAndChooseDir(frame,
                                           configs.getString("bigsemantics_javascript_dir"),
                                           "BigSemanticsJavaScript project directory");
    }

    antRunner = new AntRunner();
    service = new BSService(configs);

    btnUpdate.setEnabled(false);
    info("Beginning service startup.");
    Thread thread = new Thread(new Runnable()
    {
      @Override
      public void run()
      {
        updateBackend();
        SwingUtilities.invokeLater(new Runnable()
        {
          @Override
          public void run()
          {
            btnUpdate.setEnabled(true);
          }
        });

        while (true)
        {
          if (MemoryUsageMonitor.get().getEffectiveFreeMem() <= AssistApp.LOW_MEM_IN_MB)
          {
            Object[] options = { "Close now", "Keep running" };
            Integer n = JOptionPane.showOptionDialog(frame,
                                                     "Low memory, close AssistApp before recompiling wrappers",
                                                     "Memory Warning",
                                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                                     JOptionPane.QUESTION_MESSAGE,
                                                     null,
                                                     options,
                                                     options[1]);
            if (n == 0)
            {
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              try
              {
                stopService();
              }
              catch (Exception e)
              {
                error("Error stopping BS service.", null, e);
              }
              System.exit(0);
            }
            else
            {
              break;
            }
          }
        }

      }
    });
    thread.run();

    btnUpdate.setEnabled(true);
  }

  public void createAndDisplayGUI()
  {
    JPanel contentPanel = new JPanel(new GridBagLayout());
    contentPanel.setOpaque(true);

    btnUpdate = new JButton("Update Backend with New Wrappers");
    btnUpdate.setEnabled(false);
    btnUpdate.setVerticalTextPosition(AbstractButton.CENTER);
    btnUpdate.setHorizontalTextPosition(AbstractButton.CENTER);
    btnUpdate.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent event)
      {
        btnUpdate.setEnabled(false);

        MemoryUsageMonitor.get().log("after running for a bit");
        if (MemoryUsageMonitor.get().getEffectiveFreeMem() <= AssistApp.LOW_MEM_IN_MB)
        {
          JOptionPane.showMessageDialog(frame,
                                        "Not enough memory. Closing down.",
                                        "Memory Warning",
                                        JOptionPane.ERROR_MESSAGE);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          try
          {
            stopService();
          }
          catch (Exception e)
          {
            error("Error stopping BS service.", null, e);
          }
          System.exit(0);

        }

        Thread thread = new Thread(new Runnable()
        {
          @Override
          public void run()
          {
            updateBackend();
            SwingUtilities.invokeLater(new Runnable()
            {
              @Override
              public void run()
              {
                btnUpdate.setEnabled(true);
              }
            });
          }
        });
        thread.run();
      }
    });

    GridBagConstraints c =
        new GridBagConstraints(0, // gridx
                               0, // gridy
                               1, // gridwidth
                               1, // gridheight
                               0, // weightx
                               0, // weighty
                               GridBagConstraints.CENTER, // anchor
                               GridBagConstraints.NONE, // fill
                               new Insets(8, 8, 8, 8), // insets
                               8, // ipadx
                               8); // ipady
    contentPanel.add(btnUpdate, c);

    textArea = new JTextArea(40, 100);
    textArea.setEditable(false);
    textArea.setBorder(BorderFactory.createLoweredBevelBorder());
    textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 10));
    JScrollPane scroll = new JScrollPane(textArea);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    c.gridx = 0;
    c.gridy = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.fill = GridBagConstraints.BOTH;
    contentPanel.add(scroll, c);

    frame = new JFrame("BS Wrapper Dev Assist");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addWindowListener(new WindowAdapter()
    {
      @Override
      public void windowClosing(WindowEvent event)
      {
        info("Window is closing, cleaning up ...");
        try
        {
          stopService();
        }
        catch (Exception e)
        {
          error("Error stopping BS service.", null, e);
        }
      }

    });
    frame.setContentPane(contentPanel);

    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        frame.pack();
        frame.setVisible(true);
      }
    });
  }

  private void updateBackend()
  {
    try
    {
      MemoryUsageMonitor.get().log("before updating backend");

      stopService();

      info("Recompiling wrappers and rebuilding service jar...");
      File wrappersBuildFile = PathUtil.subPath(bsWrappersDir, "build.xml");
      antRunner.runAntTarget(wrappersBuildFile, "clean");
      File serviceBuildFile = PathUtil.subPath(bsServiceDir, "BigSemanticsService", "build.xml");
      antRunner.runAntTarget(serviceBuildFile, "clean");
      antRunner.runAntTarget(serviceBuildFile, "main");

      MemoryUsageMonitor.get().log("after compiling wrappers and building bs-service");

      startService();
      MemoryUsageMonitor.get().log("after bs-service started");
    }
    catch (Exception e)
    {
      error("Error relaunching BS service.", null, e);
      return;
    }

    // Opens string URL in the browser
    String url = "http://localhost:8080/static/MICE/index.html?uselocal=true";
    info("Service running. Opening MICE in your default browser.");
    if (Desktop.isDesktopSupported())
    {
      Desktop desktop = Desktop.getDesktop();
      try
      {
        desktop.browse(new URI(url));
      }
      catch (Exception e)
      {
        logger.error("Exception opening MICE in browser.", e);
      }
    }
    else
    {
      Runtime runtime = Runtime.getRuntime();
      try
      {
        runtime.exec("xdg-open " + url);
      }
      catch (Exception e)
      {
        logger.error("Exception opening MICE in browser through xdg-open.", e);
      }
    }
  }

  private void stopService() throws Exception
  {
    info("Stopping service...");
    service.stop();
  }

  private void startService() throws Exception
  {
    info("Starting service...");
    service.start();
  }

  private void infoHelper(String msg)
  {
    logger.info(msg);
    textArea.append(msg + "\n");
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }

  private void info(String msg)
  {
    infoHelper(msg);
    SwingUtilities.invokeLater(new Runnable()
    {
      @Override
      public void run()
      {
        frame.invalidate();
      }
    });
  }

  private void error(String msg, String info, Throwable t)
  {
    if (t != null)
    {
      logger.error(msg, t);
    }
    if (info != null)
    {
      String[] lines = info.split("\n");
      for (String line : lines)
      {
        infoHelper("    >> " + line);
      }
    }
    info("ERROR: " + msg);
    info("Check for the log file for more details.");
  }

  public static void main(String[] args) throws ConfigurationException
  {
    Configuration configs = new PropertiesConfiguration("wrapper-dev-assist.conf");
    new AssistApp(configs);
  }

}
