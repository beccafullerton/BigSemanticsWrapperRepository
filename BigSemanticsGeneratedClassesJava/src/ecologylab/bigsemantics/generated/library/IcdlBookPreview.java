package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *ICDL About This Book Page
 */ 
@simpl_inherit
public class IcdlBookPreview extends RichDocument
{
	@simpl_composite
	@mm_name("author")
	private Author author;

	@simpl_composite
	@mm_name("illustrator")
	private Author illustrator;

	@simpl_scalar
	private MetadataString summary;

	@simpl_scalar
	private MetadataString year;

	@simpl_scalar
	private MetadataString languages;

	@simpl_scalar
	private MetadataString publisher;

	@simpl_scalar
	private MetadataString isbn;

	@simpl_scalar
	private MetadataString awards;

	public IcdlBookPreview()
	{ super(); }

	public IcdlBookPreview(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Author getAuthor()
	{
		return author;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public Author getIllustrator()
	{
		return illustrator;
	}

	public void setIllustrator(Author illustrator)
	{
		this.illustrator = illustrator;
	}

	public MetadataString	summary()
	{
		MetadataString	result = this.summary;
		if (result == null)
		{
			result = new MetadataString();
			this.summary = result;
		}
		return result;
	}

	public String getSummary()
	{
		return this.summary == null ? null : summary().getValue();
	}

	public MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(MetadataString summary)
	{
		this.summary = summary;
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

	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages == null ? null : languages().getValue();
	}

	public MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(String languages)
	{
		if (languages != null)
			this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(MetadataString languages)
	{
		this.languages = languages;
	}

	public MetadataString	publisher()
	{
		MetadataString	result = this.publisher;
		if (result == null)
		{
			result = new MetadataString();
			this.publisher = result;
		}
		return result;
	}

	public String getPublisher()
	{
		return this.publisher == null ? null : publisher().getValue();
	}

	public MetadataString getPublisherMetadata()
	{
		return publisher;
	}

	public void setPublisher(String publisher)
	{
		if (publisher != null)
			this.publisher().setValue(publisher);
	}

	public void setPublisherMetadata(MetadataString publisher)
	{
		this.publisher = publisher;
	}

	public MetadataString	isbn()
	{
		MetadataString	result = this.isbn;
		if (result == null)
		{
			result = new MetadataString();
			this.isbn = result;
		}
		return result;
	}

	public String getIsbn()
	{
		return this.isbn == null ? null : isbn().getValue();
	}

	public MetadataString getIsbnMetadata()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		if (isbn != null)
			this.isbn().setValue(isbn);
	}

	public void setIsbnMetadata(MetadataString isbn)
	{
		this.isbn = isbn;
	}

	public MetadataString	awards()
	{
		MetadataString	result = this.awards;
		if (result == null)
		{
			result = new MetadataString();
			this.awards = result;
		}
		return result;
	}

	public String getAwards()
	{
		return this.awards == null ? null : awards().getValue();
	}

	public MetadataString getAwardsMetadata()
	{
		return awards;
	}

	public void setAwards(String awards)
	{
		if (awards != null)
			this.awards().setValue(awards);
	}

	public void setAwardsMetadata(MetadataString awards)
	{
		this.awards = awards;
	}
}
