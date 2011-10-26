package ecologylab.semantics.generated.library.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creativeWork.BasicPublication;
import ecologylab.semantics.generated.library.publication.Subject;
import ecologylab.semantics.generated.library.publication.TermType;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/** 
 *A publication.
 */ 
@simpl_inherit
public class Publication extends BasicPublication
{
	@simpl_scalar
	private MetadataString pages;

	@simpl_collection("subject")
	@mm_name("subjects")
	private List<Subject> subjects;

	@simpl_scalar
	private MetadataString aboutTheAuthors;

	@simpl_collection("term_type")
	@mm_name("common_terms")
	private List<TermType> commonTerms;

	public Publication()
	{ }

	public Publication(MetaMetadataCompositeField mmd) {
		super(mmd);
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

	public MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(MetadataString pages)
	{
		this.pages = pages;
	}

	public List<Subject> getSubjects()
	{
		return subjects;
	}

	public void setSubjects(List<Subject> subjects)
	{
		this.subjects = subjects;
	}

	public MetadataString	aboutTheAuthors()
	{
		MetadataString	result = this.aboutTheAuthors;
		if (result == null)
		{
			result = new MetadataString();
			this.aboutTheAuthors = result;
		}
		return result;
	}

	public String getAboutTheAuthors()
	{
		return this.aboutTheAuthors == null ? null : aboutTheAuthors().getValue();
	}

	public MetadataString getAboutTheAuthorsMetadata()
	{
		return aboutTheAuthors;
	}

	public void setAboutTheAuthors(String aboutTheAuthors)
	{
		if (aboutTheAuthors != null)
			this.aboutTheAuthors().setValue(aboutTheAuthors);
	}

	public void setAboutTheAuthorsMetadata(MetadataString aboutTheAuthors)
	{
		this.aboutTheAuthors = aboutTheAuthors;
	}

	public List<TermType> getCommonTerms()
	{
		return commonTerms;
	}

	public void setCommonTerms(List<TermType> commonTerms)
	{
		this.commonTerms = commonTerms;
	}
}
