package ecologylab.bigsemantics.generated.library.creativeWork.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.artwork.Artwork;
import ecologylab.bigsemantics.generated.library.creativeWork.artwork.TempFieldValueHolder;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class MomaArtwork extends Artwork
{
	@simpl_scalar
	private MetadataString status;

	@simpl_composite
	@mm_name("moma_classification")
	private RichDocument momaClassification;

	@simpl_scalar
	private MetadataParsedURL permalink;

	@simpl_scalar
	private MetadataParsedURL databaseLink;

	@simpl_scalar
	private MetadataString momaId;

	@simpl_scalar
	private MetadataParsedURL image;

	@simpl_composite
	@mm_name("temp_field_value_holder")
	private TempFieldValueHolder tempFieldValueHolder;

	public MomaArtwork()
	{ super(); }

	public MomaArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	status()
	{
		MetadataString	result = this.status;
		if (result == null)
		{
			result = new MetadataString();
			this.status = result;
		}
		return result;
	}

	public String getStatus()
	{
		return this.status == null ? null : status().getValue();
	}

	public MetadataString getStatusMetadata()
	{
		return status;
	}

	public void setStatus(String status)
	{
		if (status != null)
			this.status().setValue(status);
	}

	public void setStatusMetadata(MetadataString status)
	{
		this.status = status;
	}

	public RichDocument getMomaClassification()
	{
		return momaClassification;
	}

	public void setMomaClassification(RichDocument momaClassification)
	{
		this.momaClassification = momaClassification;
	}

	public MetadataParsedURL	permalink()
	{
		MetadataParsedURL	result = this.permalink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.permalink = result;
		}
		return result;
	}

	public ParsedURL getPermalink()
	{
		return this.permalink == null ? null : permalink().getValue();
	}

	public MetadataParsedURL getPermalinkMetadata()
	{
		return permalink;
	}

	public void setPermalink(ParsedURL permalink)
	{
		if (permalink != null)
			this.permalink().setValue(permalink);
	}

	public void setPermalinkMetadata(MetadataParsedURL permalink)
	{
		this.permalink = permalink;
	}

	public MetadataParsedURL	databaseLink()
	{
		MetadataParsedURL	result = this.databaseLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.databaseLink = result;
		}
		return result;
	}

	public ParsedURL getDatabaseLink()
	{
		return this.databaseLink == null ? null : databaseLink().getValue();
	}

	public MetadataParsedURL getDatabaseLinkMetadata()
	{
		return databaseLink;
	}

	public void setDatabaseLink(ParsedURL databaseLink)
	{
		if (databaseLink != null)
			this.databaseLink().setValue(databaseLink);
	}

	public void setDatabaseLinkMetadata(MetadataParsedURL databaseLink)
	{
		this.databaseLink = databaseLink;
	}

	public MetadataString	momaId()
	{
		MetadataString	result = this.momaId;
		if (result == null)
		{
			result = new MetadataString();
			this.momaId = result;
		}
		return result;
	}

	public String getMomaId()
	{
		return this.momaId == null ? null : momaId().getValue();
	}

	public MetadataString getMomaIdMetadata()
	{
		return momaId;
	}

	public void setMomaId(String momaId)
	{
		if (momaId != null)
			this.momaId().setValue(momaId);
	}

	public void setMomaIdMetadata(MetadataString momaId)
	{
		this.momaId = momaId;
	}

	public MetadataParsedURL	image()
	{
		MetadataParsedURL	result = this.image;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.image = result;
		}
		return result;
	}

	public ParsedURL getImage()
	{
		return this.image == null ? null : image().getValue();
	}

	public MetadataParsedURL getImageMetadata()
	{
		return image;
	}

	public void setImage(ParsedURL image)
	{
		if (image != null)
			this.image().setValue(image);
	}

	public void setImageMetadata(MetadataParsedURL image)
	{
		this.image = image;
	}

	public TempFieldValueHolder getTempFieldValueHolder()
	{
		return tempFieldValueHolder;
	}

	public void setTempFieldValueHolder(TempFieldValueHolder tempFieldValueHolder)
	{
		this.tempFieldValueHolder = tempFieldValueHolder;
	}
}