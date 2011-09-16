package ecologylab.semantics.generated.library.scholarlyPublication;

import ecologylab.serialization.annotations.simpl_composite;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.Tag;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.creativeWork.CreativeWork;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;
import ecologylab.semantics.generated.library.creativeWork.Periodical;

/**
*  ScholarlyArticle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class ScholarlyArticle extends CreativeWork
{
	/** 
	 * Metadata related to where this article was published.
	 */ 
	@simpl_composite	@mm_name("source")
	private Periodical source;

	/** 
	 * citation.cfm
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL metadataPage;

	/** 
	 * Papers cited by this paper.
	 */ 
	@simpl_collection("reference")	@mm_name("references")
	private List<ScholarlyArticle> references;

	/** 
	 * Papers that cite this paper.
	 */ 
	@simpl_collection("citation")	@mm_name("citations")
	private List<ScholarlyArticle> citations;

	/** 
	 * The Classifications of this paper.
	 */ 
	@simpl_collection("tag")	@mm_name("classifications")
	private List<Tag> classifications;

	/** 
	 * Key Terms of the paper.
	 */ 
	@simpl_collection("tag")	@mm_name("keywords")
	private List<Tag> keywords;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString pages;

	public ScholarlyArticle()
	{ }

	public ScholarlyArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Periodical getSource()
	{
		return source;
	}

	public void setSource(Periodical source)
	{
		this.source = source;
	}

	public MetadataParsedURL	metadataPage()
	{
		MetadataParsedURL	result = this.metadataPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.metadataPage = result;
		}
		return result;
	}

	public ParsedURL getMetadataPage()
	{
		return this.metadataPage == null ? null : metadataPage().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getMetadataPageMetadata()
	{
		return metadataPage;
	}

	public void setMetadataPage(ParsedURL metadataPage)
	{
		if (metadataPage != null)
			this.metadataPage().setValue(metadataPage);
	}

	public void setMetadataPageMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL metadataPage)
	{
		this.metadataPage = metadataPage;
	}

	public List<ScholarlyArticle> getReferences()
	{
		return references;
	}

	public void setReferences(List<ScholarlyArticle> references)
	{
		this.references = references;
	}

	public List<ScholarlyArticle> getCitations()
	{
		return citations;
	}

	public void setCitations(List<ScholarlyArticle> citations)
	{
		this.citations = citations;
	}

	public List<Tag> getClassifications()
	{
		return classifications;
	}

	public void setClassifications(List<Tag> classifications)
	{
		this.classifications = classifications;
	}

	public List<Tag> getKeywords()
	{
		return keywords;
	}

	public void setKeywords(List<Tag> keywords)
	{
		this.keywords = keywords;
	}

	public MetadataString	pages()
	{
		MetadataString	result = this.pages;
		if (result == null)
		{
			result = new MetadataString();
			this.pages = result;
		}
		return result;
	}

	public String getPages()
	{
		return this.pages == null ? null : pages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString pages)
	{
		this.pages = pages;
	}
}
