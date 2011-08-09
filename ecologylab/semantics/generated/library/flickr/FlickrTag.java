package ecologylab.semantics.generated.library.flickr;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  FlickrTag.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class FlickrTag extends Metadata
{
	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private ecologylab.semantics.metadata.scalar.MetadataString tagName;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL tagLink;

	public FlickrTag()
	{ }

	public FlickrTag(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	tagName()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.tagName;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.tagName = result;
		}
		return result;
	}

	public java.lang.String getTagName()
	{
		return this.tagName == null ? null : tagName().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTagNameMetadata()
	{
		return tagName;
	}

	public void setTagName(java.lang.String tagName)
	{
		if (tagName != null)
			this.tagName().setValue(tagName);
	}

	public void setTagNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString tagName)
	{
		this.tagName = tagName;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	tagLink()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.tagLink;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.tagLink = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getTagLink()
	{
		return this.tagLink == null ? null : tagLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getTagLinkMetadata()
	{
		return tagLink;
	}

	public void setTagLink(ecologylab.net.ParsedURL tagLink)
	{
		if (tagLink != null)
			this.tagLink().setValue(tagLink);
	}

	public void setTagLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL tagLink)
	{
		this.tagLink = tagLink;
	}
}
