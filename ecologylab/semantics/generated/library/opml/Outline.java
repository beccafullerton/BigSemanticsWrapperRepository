package ecologylab.semantics.generated.library.opml;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/12/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.opml.Outline;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

@simpl_inherit
public class Outline extends Metadata
{
	@simpl_scalar
	private MetadataString text;

	@simpl_scalar
	private MetadataString title;

	@simpl_scalar
	@simpl_tag("htmlUrl")
	private MetadataParsedURL htmlUrl;

	@simpl_collection("outline")
	@simpl_nowrap
	@mm_name("outlines")
	private List<Outline> outlines;

	@simpl_scalar
	@simpl_tag("xmlUrl")
	private MetadataParsedURL xmlUrl;

	@simpl_scalar
	private MetadataString type;

	public Outline()
	{ }

	public Outline(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	text()
	{
		MetadataString	result = this.text;
		if (result == null)
		{
			result = new MetadataString();
			this.text = result;
		}
		return result;
	}

	public String getText()
	{
		return this.text == null ? null : text().getValue();
	}

	public MetadataString getTextMetadata()
	{
		return text;
	}

	public void setText(String text)
	{
		if (text != null)
			this.text().setValue(text);
	}

	public void setTextMetadata(MetadataString text)
	{
		this.text = text;
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}

	public MetadataParsedURL	htmlUrl()
	{
		MetadataParsedURL	result = this.htmlUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.htmlUrl = result;
		}
		return result;
	}

	public ParsedURL getHtmlUrl()
	{
		return this.htmlUrl == null ? null : htmlUrl().getValue();
	}

	public MetadataParsedURL getHtmlUrlMetadata()
	{
		return htmlUrl;
	}

	public void setHtmlUrl(ParsedURL htmlUrl)
	{
		if (htmlUrl != null)
			this.htmlUrl().setValue(htmlUrl);
	}

	public void setHtmlUrlMetadata(MetadataParsedURL htmlUrl)
	{
		this.htmlUrl = htmlUrl;
	}

	public List<Outline> getOutlines()
	{
		return outlines;
	}

	public void setOutlines(List<Outline> outlines)
	{
		this.outlines = outlines;
	}

	public MetadataParsedURL	xmlUrl()
	{
		MetadataParsedURL	result = this.xmlUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.xmlUrl = result;
		}
		return result;
	}

	public ParsedURL getXmlUrl()
	{
		return this.xmlUrl == null ? null : xmlUrl().getValue();
	}

	public MetadataParsedURL getXmlUrlMetadata()
	{
		return xmlUrl;
	}

	public void setXmlUrl(ParsedURL xmlUrl)
	{
		if (xmlUrl != null)
			this.xmlUrl().setValue(xmlUrl);
	}

	public void setXmlUrlMetadata(MetadataParsedURL xmlUrl)
	{
		this.xmlUrl = xmlUrl;
	}

	public MetadataString	type()
	{
		MetadataString	result = this.type;
		if (result == null)
		{
			result = new MetadataString();
			this.type = result;
		}
		return result;
	}

	public String getType()
	{
		return this.type == null ? null : type().getValue();
	}

	public MetadataString getTypeMetadata()
	{
		return type;
	}

	public void setType(String type)
	{
		if (type != null)
			this.type().setValue(type);
	}

	public void setTypeMetadata(MetadataString type)
	{
		this.type = type;
	}
}
