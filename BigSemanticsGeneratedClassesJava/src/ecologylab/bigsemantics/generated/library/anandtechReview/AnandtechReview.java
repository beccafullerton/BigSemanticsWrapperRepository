package ecologylab.bigsemantics.generated.library.anandtechReview;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.techReview.TechReview;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *anandtech.com review
 */ 
@simpl_inherit
public class AnandtechReview extends TechReview
{
	@simpl_scalar
	private MetadataString author;

	@simpl_collection("rich_document")
	@mm_name("sections")
	private List<RichDocument> sections;

	@simpl_collection("rich_document")
	@mm_name("specifications")
	private List<RichDocument> specifications;

	public AnandtechReview()
	{ super(); }

	public AnandtechReview(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	author()
	{
		MetadataString	result = this.author;
		if (result == null)
		{
			result = new MetadataString();
			this.author = result;
		}
		return result;
	}

	public String getAuthor()
	{
		return this.author == null ? null : author().getValue();
	}

	public MetadataString getAuthorMetadata()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		if (author != null)
			this.author().setValue(author);
	}

	public void setAuthorMetadata(MetadataString author)
	{
		this.author = author;
	}

	public List<RichDocument> getSections()
	{
		return sections;
	}

  // lazy evaluation:
  public List<RichDocument> sections()
  {
    if (sections == null)
      sections = new ArrayList<RichDocument>();
    return sections;
  }

  // addTo:
  public void addToSections(RichDocument element)
  {
    sections().add(element);
  }

  // size:
  public int sectionsSize()
  {
    return sections == null ? 0 : sections.size();
  }

	public void setSections(List<RichDocument> sections)
	{
		this.sections = sections;
	}

	public List<RichDocument> getSpecifications()
	{
		return specifications;
	}

  // lazy evaluation:
  public List<RichDocument> specifications()
  {
    if (specifications == null)
      specifications = new ArrayList<RichDocument>();
    return specifications;
  }

  // addTo:
  public void addToSpecifications(RichDocument element)
  {
    specifications().add(element);
  }

  // size:
  public int specificationsSize()
  {
    return specifications == null ? 0 : specifications.size();
  }

	public void setSpecifications(List<RichDocument> specifications)
	{
		this.specifications = specifications;
	}
}
