package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Thumbinner.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Thumbinner extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString thumbImgCaption;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL thumbImgSrc;

	public Thumbinner()
	{ }

	public Thumbinner(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	thumbImgCaption()
	{
		MetadataString	result = this.thumbImgCaption;
		if (result == null)
		{
			result = new MetadataString();
			this.thumbImgCaption = result;
		}
		return result;
	}

	public String getThumbImgCaption()
	{
		return this.thumbImgCaption == null ? null : thumbImgCaption().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getThumbImgCaptionMetadata()
	{
		return thumbImgCaption;
	}

	public void setThumbImgCaption(String thumbImgCaption)
	{
		if (thumbImgCaption != null)
			this.thumbImgCaption().setValue(thumbImgCaption);
	}

	public void setThumbImgCaptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString thumbImgCaption)
	{
		this.thumbImgCaption = thumbImgCaption;
	}

	public MetadataParsedURL	thumbImgSrc()
	{
		MetadataParsedURL	result = this.thumbImgSrc;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbImgSrc = result;
		}
		return result;
	}

	public ParsedURL getThumbImgSrc()
	{
		return this.thumbImgSrc == null ? null : thumbImgSrc().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getThumbImgSrcMetadata()
	{
		return thumbImgSrc;
	}

	public void setThumbImgSrc(ParsedURL thumbImgSrc)
	{
		if (thumbImgSrc != null)
			this.thumbImgSrc().setValue(thumbImgSrc);
	}

	public void setThumbImgSrcMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL thumbImgSrc)
	{
		this.thumbImgSrc = thumbImgSrc;
	}
}
