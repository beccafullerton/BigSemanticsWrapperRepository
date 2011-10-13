package ecologylab.semantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/12/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;

/** 
 *The LOLZ class
 */ 
@simpl_inherit
public class Lolz extends CompoundDocument
{
	@simpl_scalar
	private MetadataString caption;

	@simpl_scalar
	private MetadataParsedURL picture;

	@simpl_scalar
	private MetadataParsedURL mightLike;

	public Lolz()
	{ }

	public Lolz(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	caption()
	{
		MetadataString	result = this.caption;
		if (result == null)
		{
			result = new MetadataString();
			this.caption = result;
		}
		return result;
	}

	public String getCaption()
	{
		return this.caption == null ? null : caption().getValue();
	}

	public MetadataString getCaptionMetadata()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		if (caption != null)
			this.caption().setValue(caption);
	}

	public void setCaptionMetadata(MetadataString caption)
	{
		this.caption = caption;
	}

	public MetadataParsedURL	picture()
	{
		MetadataParsedURL	result = this.picture;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.picture = result;
		}
		return result;
	}

	public ParsedURL getPicture()
	{
		return this.picture == null ? null : picture().getValue();
	}

	public MetadataParsedURL getPictureMetadata()
	{
		return picture;
	}

	public void setPicture(ParsedURL picture)
	{
		if (picture != null)
			this.picture().setValue(picture);
	}

	public void setPictureMetadata(MetadataParsedURL picture)
	{
		this.picture = picture;
	}

	public MetadataParsedURL	mightLike()
	{
		MetadataParsedURL	result = this.mightLike;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.mightLike = result;
		}
		return result;
	}

	public ParsedURL getMightLike()
	{
		return this.mightLike == null ? null : mightLike().getValue();
	}

	public MetadataParsedURL getMightLikeMetadata()
	{
		return mightLike;
	}

	public void setMightLike(ParsedURL mightLike)
	{
		if (mightLike != null)
			this.mightLike().setValue(mightLike);
	}

	public void setMightLikeMetadata(MetadataParsedURL mightLike)
	{
		this.mightLike = mightLike;
	}
}
