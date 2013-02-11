package ecologylab.bigsemantics.generated.library.wikipedia;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.wikipedia.Paragraph;
import ecologylab.bigsemantics.generated.library.wikipedia.Section;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Section extends Document
{
	@simpl_scalar
	private MetadataString sectionId;

	@simpl_scalar
	private MetadataParsedURL sectionUrl;

	@simpl_collection("paragraph")
	@mm_name("paragraphs")
	private List<Paragraph> paragraphs;

	@simpl_collection("section")
	@mm_name("subsections")
	private List<Section> subsections;

	public Section()
	{ super(); }

	public Section(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	sectionId()
	{
		MetadataString	result = this.sectionId;
		if (result == null)
		{
			result = new MetadataString();
			this.sectionId = result;
		}
		return result;
	}

	public String getSectionId()
	{
		return this.sectionId == null ? null : sectionId().getValue();
	}

	public MetadataString getSectionIdMetadata()
	{
		return sectionId;
	}

	public void setSectionId(String sectionId)
	{
		if (sectionId != null)
			this.sectionId().setValue(sectionId);
	}

	public void setSectionIdMetadata(MetadataString sectionId)
	{
		this.sectionId = sectionId;
	}

	public MetadataParsedURL	sectionUrl()
	{
		MetadataParsedURL	result = this.sectionUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.sectionUrl = result;
		}
		return result;
	}

	public ParsedURL getSectionUrl()
	{
		return this.sectionUrl == null ? null : sectionUrl().getValue();
	}

	public MetadataParsedURL getSectionUrlMetadata()
	{
		return sectionUrl;
	}

	public void setSectionUrl(ParsedURL sectionUrl)
	{
		if (sectionUrl != null)
			this.sectionUrl().setValue(sectionUrl);
	}

	public void setSectionUrlMetadata(MetadataParsedURL sectionUrl)
	{
		this.sectionUrl = sectionUrl;
	}

	public List<Paragraph> getParagraphs()
	{
		return paragraphs;
	}

  // lazy evaluation:
  public List<Paragraph> paragraphs()
  {
    if (paragraphs == null)
      paragraphs = new ArrayList<Paragraph>();
    return paragraphs;
  }

  // addTo:
  public void addToParagraphs(Paragraph element)
  {
    paragraphs().add(element);
  }

  // size:
  public int paragraphsSize()
  {
    return paragraphs == null ? 0 : paragraphs.size();
  }

	public void setParagraphs(List<Paragraph> paragraphs)
	{
		this.paragraphs = paragraphs;
	}

	public List<Section> getSubsections()
	{
		return subsections;
	}

  // lazy evaluation:
  public List<Section> subsections()
  {
    if (subsections == null)
      subsections = new ArrayList<Section>();
    return subsections;
  }

  // addTo:
  public void addToSubsections(Section element)
  {
    subsections().add(element);
  }

  // size:
  public int subsectionsSize()
  {
    return subsections == null ? 0 : subsections.size();
  }

	public void setSubsections(List<Section> subsections)
	{
		this.subsections = subsections;
	}
}
