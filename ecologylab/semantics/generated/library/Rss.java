package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.Document;


/**
	The RSS Class.
**/ 

@xml_inherit
@xml_tag("rss")
public class  Rss
extends  Document
{


/**
	Constructor
**/ 

public Rss()
{
 super();
}

/**
	Constructor
**/ 

public Rss(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("subject") @xml_nested private MetadataString	subject;

/**
	Lazy Evaluation for subject
**/ 

public MetadataString	subject()
{
MetadataString	result	=this.subject;
if(result == null)
{
result = new MetadataString();
this.subject	=	 result;
}
return result;
}

/**
	Gets the value of the field subject
**/ 

public String getSubject(){
return subject().getValue();
}

/**
	Sets the value of the field subject
**/ 

public void setSubject( String subject )
{
this.subject().setValue(subject);
}

/**
	The heavy weight setter method for field subject
**/ 

public void hwSetSubject( String subject )
{
this.subject().setValue(subject);
rebuildCompositeTermVector();
 }
/**
	 Sets the subject directly
**/ 

public void setSubjectMetadata(MetadataString subject)
{	this.subject = subject;
}
/**
	Heavy Weight Direct setter method for subject
**/ 

public void hwSetSubjectMetadata(MetadataString subject)
{	 if(this.subject!=null && this.subject.getValue()!=null && hasTermVector())
		 termVector().remove(this.subject.termVector());
	 this.subject = subject;
	rebuildCompositeTermVector();
}
}

