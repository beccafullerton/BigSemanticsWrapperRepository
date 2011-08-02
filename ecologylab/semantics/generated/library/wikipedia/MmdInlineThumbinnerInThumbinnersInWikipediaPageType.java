package ecologylab.semantics.generated.library.wikipedia;

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
*  MmdInlineThumbinnerInThumbinnersInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineThumbinnerInThumbinnersInWikipediaPageType extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString thumbImgCaption;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL thumbImgSrc;

	public MmdInlineThumbinnerInThumbinnersInWikipediaPageType()
	{ }

	public MmdInlineThumbinnerInThumbinnersInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	thumbImgCaption()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.thumbImgCaption;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.thumbImgCaption = result;
		}
		return result;
	}

	public java.lang.String getThumbImgCaption()
	{
		return this.thumbImgCaption == null ? null : thumbImgCaption().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getThumbImgCaptionMetadata()
	{
		return thumbImgCaption;
	}

	public void setThumbImgCaption(java.lang.String thumbImgCaption)
	{
		if (thumbImgCaption != null)
			this.thumbImgCaption().setValue(thumbImgCaption);
	}

	public void setThumbImgCaptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString thumbImgCaption)
	{
		this.thumbImgCaption = thumbImgCaption;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	thumbImgSrc()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.thumbImgSrc;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.thumbImgSrc = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getThumbImgSrc()
	{
		return this.thumbImgSrc == null ? null : thumbImgSrc().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getThumbImgSrcMetadata()
	{
		return thumbImgSrc;
	}

	public void setThumbImgSrc(ecologylab.net.ParsedURL thumbImgSrc)
	{
		if (thumbImgSrc != null)
			this.thumbImgSrc().setValue(thumbImgSrc);
	}

	public void setThumbImgSrcMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL thumbImgSrc)
	{
		this.thumbImgSrc = thumbImgSrc;
	}
}
