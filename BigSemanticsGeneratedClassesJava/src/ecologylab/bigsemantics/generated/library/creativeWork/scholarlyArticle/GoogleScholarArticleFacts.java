package ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.GoogleScholarArticle;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GoogleScholarArticleFacts extends RichDocument
{
	@simpl_composite
	@mm_name("article")
	private GoogleScholarArticle article;

	@simpl_composite
	@mm_name("citations")
	private RichDocument citations;

	@simpl_scalar
	private MetadataString year;

	@simpl_collection("author")
	@mm_name("authors")
	private List<Author> authors;

	@simpl_scalar
	private MetadataString citationCount;

	public GoogleScholarArticleFacts()
	{ super(); }

	public GoogleScholarArticleFacts(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public GoogleScholarArticle getArticle()
	{
		return article;
	}

	public void setArticle(GoogleScholarArticle article)
	{
		this.article = article;
	}

	public RichDocument getCitations()
	{
		return citations;
	}

	public void setCitations(RichDocument citations)
	{
		this.citations = citations;
	}

	public MetadataString	year()
	{
		MetadataString	result = this.year;
		if (result == null)
		{
			result = new MetadataString();
			this.year = result;
		}
		return result;
	}

	public String getYear()
	{
		return this.year == null ? null : year().getValue();
	}

	public MetadataString getYearMetadata()
	{
		return year;
	}

	public void setYear(String year)
	{
		if (year != null)
			this.year().setValue(year);
	}

	public void setYearMetadata(MetadataString year)
	{
		this.year = year;
	}

	public List<Author> getAuthors()
	{
		return authors;
	}

  // lazy evaluation:
  public List<Author> authors()
  {
    if (authors == null)
      authors = new ArrayList<Author>();
    return authors;
  }

  // addTo:
  public void addToAuthors(Author element)
  {
    authors().add(element);
  }

  // size:
  public int authorsSize()
  {
    return authors == null ? 0 : authors.size();
  }

	public void setAuthors(List<Author> authors)
	{
		this.authors = authors;
	}

	public MetadataString	citationCount()
	{
		MetadataString	result = this.citationCount;
		if (result == null)
		{
			result = new MetadataString();
			this.citationCount = result;
		}
		return result;
	}

	public String getCitationCount()
	{
		return this.citationCount == null ? null : citationCount().getValue();
	}

	public MetadataString getCitationCountMetadata()
	{
		return citationCount;
	}

	public void setCitationCount(String citationCount)
	{
		if (citationCount != null)
			this.citationCount().setValue(citationCount);
	}

	public void setCitationCountMetadata(MetadataString citationCount)
	{
		this.citationCount = citationCount;
	}
}
