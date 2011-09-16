package ecologylab.semantics.generated.library.fastflip;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Thumbnail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Thumbnail extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL pic;

	public Thumbnail()
	{ }

	public Thumbnail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic == null ? null : pic().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		if (pic != null)
			this.pic().setValue(pic);
	}

	public void setPicMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL pic)
	{
		this.pic = pic;
	}
}
