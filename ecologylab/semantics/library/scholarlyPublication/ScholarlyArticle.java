package ecologylab.semantics.library.scholarlyPublication;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;

  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;


/**
	
**/ 

@xml_inherit
@xml_tag("scholarly_article")
public class  ScholarlyArticle
extends  Pdf
{


/**
	Constructor
**/ 

public ScholarlyArticle()
{
 super();
}

/**
	Constructor
**/ 

public ScholarlyArticle(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	Link used for citation chaining
**/ 

	@xml_tag("link") @xml_nested private MetadataParsedURL	link;

/**
	Lazy Evaluation for link
**/ 

public MetadataParsedURL	link()
{
MetadataParsedURL	result	=this.link;
if(result == null)
{
result = new MetadataParsedURL();
this.link	=	 result;
}
return result;
}

/**
	Gets the value of the field link
**/ 

public ParsedURL getLink(){
return link().getValue();
}

/**
	Sets the value of the field link
**/ 

public void setLink( ParsedURL link )
{
this.link().setValue(link);
}

/**
	The heavy weight setter method for field link
**/ 

public void hwSetLink( ParsedURL link )
{
this.link().setValue(link);
rebuildCompositeTermVector();
 }
/**
	 Sets the link directly
**/ 

public void setLinkMetadata(MetadataParsedURL link)
{	this.link = link;
}
/**
	Heavy Weight Direct setter method for link
**/ 

public void hwSetLinkMetadata(MetadataParsedURL link)
{	 if(this.link!=null && this.link.getValue()!=null && hasTermVector())
		 termVector().remove(this.link.termVector());
	 this.link = link;
	rebuildCompositeTermVector();
}
/**
	The Linked PDF
**/ 

	@xml_tag("full_text") @xml_nested private MetadataParsedURL	fullText;

/**
	Lazy Evaluation for fullText
**/ 

public MetadataParsedURL	fullText()
{
MetadataParsedURL	result	=this.fullText;
if(result == null)
{
result = new MetadataParsedURL();
this.fullText	=	 result;
}
return result;
}

/**
	Gets the value of the field fullText
**/ 

public ParsedURL getFullText(){
return fullText().getValue();
}

/**
	Sets the value of the field fullText
**/ 

public void setFullText( ParsedURL fullText )
{
this.fullText().setValue(fullText);
}

/**
	The heavy weight setter method for field fullText
**/ 

public void hwSetFullText( ParsedURL fullText )
{
this.fullText().setValue(fullText);
rebuildCompositeTermVector();
 }
/**
	 Sets the fullText directly
**/ 

public void setFullTextMetadata(MetadataParsedURL fullText)
{	this.fullText = fullText;
}
/**
	Heavy Weight Direct setter method for fullText
**/ 

public void hwSetFullTextMetadata(MetadataParsedURL fullText)
{	 if(this.fullText!=null && this.fullText.getValue()!=null && hasTermVector())
		 termVector().remove(this.fullText.termVector());
	 this.fullText = fullText;
	rebuildCompositeTermVector();
}
/**
	ALT TEXT FOR THE IMAGE
**/ 

	@xml_tag("alt") @xml_nested private MetadataString	alt;

/**
	Lazy Evaluation for alt
**/ 

public MetadataString	alt()
{
MetadataString	result	=this.alt;
if(result == null)
{
result = new MetadataString();
this.alt	=	 result;
}
return result;
}

/**
	Gets the value of the field alt
**/ 

public String getAlt(){
return alt().getValue();
}

/**
	Sets the value of the field alt
**/ 

public void setAlt( String alt )
{
this.alt().setValue(alt);
}

/**
	The heavy weight setter method for field alt
**/ 

public void hwSetAlt( String alt )
{
this.alt().setValue(alt);
rebuildCompositeTermVector();
 }
/**
	 Sets the alt directly
**/ 

public void setAltMetadata(MetadataString alt)
{	this.alt = alt;
}
/**
	Heavy Weight Direct setter method for alt
**/ 

public void hwSetAltMetadata(MetadataString alt)
{	 if(this.alt!=null && this.alt.getValue()!=null && hasTermVector())
		 termVector().remove(this.alt.termVector());
	 this.alt = alt;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("abstract") @xml_nested private MetadataString	abstractField;

/**
	Lazy Evaluation for abstractField
**/ 

public MetadataString	abstractField()
{
MetadataString	result	=this.abstractField;
if(result == null)
{
result = new MetadataString();
this.abstractField	=	 result;
}
return result;
}

/**
	Gets the value of the field abstractField
**/ 

public String getAbstractField(){
return abstractField().getValue();
}

/**
	Sets the value of the field abstractField
**/ 

public void setAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
}

/**
	The heavy weight setter method for field abstractField
**/ 

public void hwSetAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
rebuildCompositeTermVector();
 }
/**
	 Sets the abstractField directly
**/ 

public void setAbstractFieldMetadata(MetadataString abstractField)
{	this.abstractField = abstractField;
}
/**
	Heavy Weight Direct setter method for abstractField
**/ 

public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{	 if(this.abstractField!=null && this.abstractField.getValue()!=null && hasTermVector())
		 termVector().remove(this.abstractField.termVector());
	 this.abstractField = abstractField;
	rebuildCompositeTermVector();
}
private @xml_nested Source	source;
/**
	Lazy Evaluation for source
**/ 

public Source	source()
{
Source	result	=this.source;
if(result == null)
{
result = new Source();
this.source	=	 result;
}
return result;
}

/**
	Set the value of field source
**/ 

public void setSource( Source source )
{
this.source = source ;
}

/**
	Get the value of field source
**/ 

public Source getSource(){
return this.source;
}
	@xml_collection("authors") private ArrayList<Author>	authors;

/**
	Lazy Evaluation for authors
**/ 

public ArrayList<Author>	authors()
{
ArrayList<Author>	result	=this.authors;
if(result == null)
{
result = new ArrayList<Author>();
this.authors	=	 result;
}
return result;
}

/**
	Set the value of field authors
**/ 

public void setAuthors( ArrayList<Author> authors )
{
this.authors = authors ;
}

/**
	Get the value of field authors
**/ 

public ArrayList<Author> getAuthors(){
return this.authors;
}
	@xml_collection("references") private ArrayList<ScholarlyArticle>	references;

/**
	Lazy Evaluation for references
**/ 

public ArrayList<ScholarlyArticle>	references()
{
ArrayList<ScholarlyArticle>	result	=this.references;
if(result == null)
{
result = new ArrayList<ScholarlyArticle>();
this.references	=	 result;
}
return result;
}

/**
	Set the value of field references
**/ 

public void setReferences( ArrayList<ScholarlyArticle> references )
{
this.references = references ;
}

/**
	Get the value of field references
**/ 

public ArrayList<ScholarlyArticle> getReferences(){
return this.references;
}
	@xml_collection("citations") private ArrayList<ScholarlyArticle>	citations;

/**
	Lazy Evaluation for citations
**/ 

public ArrayList<ScholarlyArticle>	citations()
{
ArrayList<ScholarlyArticle>	result	=this.citations;
if(result == null)
{
result = new ArrayList<ScholarlyArticle>();
this.citations	=	 result;
}
return result;
}

/**
	Set the value of field citations
**/ 

public void setCitations( ArrayList<ScholarlyArticle> citations )
{
this.citations = citations ;
}

/**
	Get the value of field citations
**/ 

public ArrayList<ScholarlyArticle> getCitations(){
return this.citations;
}

}

