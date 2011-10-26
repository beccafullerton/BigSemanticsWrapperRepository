package ecologylab.semantics.generated.library.wikipedia;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.wikipedia.Category;
import ecologylab.semantics.generated.library.wikipedia.Paragraph;
import ecologylab.semantics.generated.library.wikipedia.Thumbinner;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;

/** 
 *An article on wikipedia
 */ 
@simpl_inherit
public class WikipediaPageType extends CompoundDocument
{
	/** 
	 *Paragraphs in the article.
	 */ 
	@simpl_collection("paragraph")
	@mm_name("paragraphs")
	private List<Paragraph> paragraphs;

	/** 
	 *Wikipedia Categories
	 */ 
	@simpl_collection("category")
	@mm_name("categories")
	private List<Category> categories;

	@simpl_collection("thumbinner")
	@mm_name("thumbinners")
	private List<Thumbinner> thumbinners;

	public WikipediaPageType()
	{ }

	public WikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Paragraph> getParagraphs()
	{
		return paragraphs;
	}

	public void setParagraphs(List<Paragraph> paragraphs)
	{
		this.paragraphs = paragraphs;
	}

	public List<Category> getCategories()
	{
		return categories;
	}

	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}

	public List<Thumbinner> getThumbinners()
	{
		return thumbinners;
	}

	public void setThumbinners(List<Thumbinner> thumbinners)
	{
		this.thumbinners = thumbinners;
	}
}
