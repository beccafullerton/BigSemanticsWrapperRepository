package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.builtins.Image;

/**
*  ImageInSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Def of an image in a Bing image search result.
 */ 
@simpl_inherit
public class ImageInSearchResult extends Image
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("mms:Title")	private ecologylab.semantics.metadata.scalar.MetadataString caption;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("mms:ContentType")	private ecologylab.semantics.metadata.scalar.MetadataString contentType;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL referrerUrl;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("mms:FileSize")	private ecologylab.semantics.metadata.scalar.MetadataInteger fileSize;

	public ImageInSearchResult()
	{ }

	public ImageInSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	caption()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.caption;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.caption = result;
		}
		return result;
	}

	public java.lang.String getCaption()
	{
		return this.caption == null ? null : caption().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCaptionMetadata()
	{
		return caption;
	}

	public void setCaption(java.lang.String caption)
	{
		if (caption != null)
			this.caption().setValue(caption);
	}

	public void setCaptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString caption)
	{
		this.caption = caption;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	contentType()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.contentType;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.contentType = result;
		}
		return result;
	}

	public java.lang.String getContentType()
	{
		return this.contentType == null ? null : contentType().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getContentTypeMetadata()
	{
		return contentType;
	}

	public void setContentType(java.lang.String contentType)
	{
		if (contentType != null)
			this.contentType().setValue(contentType);
	}

	public void setContentTypeMetadata(ecologylab.semantics.metadata.scalar.MetadataString contentType)
	{
		this.contentType = contentType;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	referrerUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.referrerUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.referrerUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getReferrerUrl()
	{
		return this.referrerUrl == null ? null : referrerUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getReferrerUrlMetadata()
	{
		return referrerUrl;
	}

	public void setReferrerUrl(ecologylab.net.ParsedURL referrerUrl)
	{
		if (referrerUrl != null)
			this.referrerUrl().setValue(referrerUrl);
	}

	public void setReferrerUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL referrerUrl)
	{
		this.referrerUrl = referrerUrl;
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger	fileSize()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.fileSize;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.fileSize = result;
		}
		return result;
	}

	public java.lang.Integer getFileSize()
	{
		return this.fileSize == null ? 0 : fileSize().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getFileSizeMetadata()
	{
		return fileSize;
	}

	public void setFileSize(java.lang.Integer fileSize)
	{
		if (fileSize != 0)
			this.fileSize().setValue(fileSize);
	}

	public void setFileSizeMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger fileSize)
	{
		this.fileSize = fileSize;
	}
}
