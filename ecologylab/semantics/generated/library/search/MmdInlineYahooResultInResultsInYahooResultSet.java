package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.search.YahooThumbnail;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineYahooResultInResultsInYahooResultSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineYahooResultInResultsInYahooResultSet extends Document
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("Summary")	private ecologylab.semantics.metadata.scalar.MetadataString summary;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("ModificationDate")	private ecologylab.semantics.metadata.scalar.MetadataString modificationDate;

	/** 
	 */ 
	@simpl_composite	@xml_tag("Thumbnail") @mm_name("thumbnail")	private YahooThumbnail thumbnail;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("MimeType")	private ecologylab.semantics.metadata.scalar.MetadataString mimeType;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("RefererUrl")	private ecologylab.semantics.metadata.scalar.MetadataParsedURL refererUrl;

	public MmdInlineYahooResultInResultsInYahooResultSet()
	{ }

	public MmdInlineYahooResultInResultsInYahooResultSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	summary()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.summary;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.summary = result;
		}
		return result;
	}

	public java.lang.String getSummary()
	{
		return this.summary == null ? null : summary().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(java.lang.String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(ecologylab.semantics.metadata.scalar.MetadataString summary)
	{
		this.summary = summary;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	modificationDate()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.modificationDate;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.modificationDate = result;
		}
		return result;
	}

	public java.lang.String getModificationDate()
	{
		return this.modificationDate == null ? null : modificationDate().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getModificationDateMetadata()
	{
		return modificationDate;
	}

	public void setModificationDate(java.lang.String modificationDate)
	{
		if (modificationDate != null)
			this.modificationDate().setValue(modificationDate);
	}

	public void setModificationDateMetadata(ecologylab.semantics.metadata.scalar.MetadataString modificationDate)
	{
		this.modificationDate = modificationDate;
	}

	public YahooThumbnail getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(YahooThumbnail thumbnail)
	{
		this.thumbnail = thumbnail;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	mimeType()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.mimeType;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.mimeType = result;
		}
		return result;
	}

	public java.lang.String getMimeType()
	{
		return this.mimeType == null ? null : mimeType().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getMimeTypeMetadata()
	{
		return mimeType;
	}

	public void setMimeType(java.lang.String mimeType)
	{
		if (mimeType != null)
			this.mimeType().setValue(mimeType);
	}

	public void setMimeTypeMetadata(ecologylab.semantics.metadata.scalar.MetadataString mimeType)
	{
		this.mimeType = mimeType;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	refererUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.refererUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.refererUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getRefererUrl()
	{
		return this.refererUrl == null ? null : refererUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getRefererUrlMetadata()
	{
		return refererUrl;
	}

	public void setRefererUrl(ecologylab.net.ParsedURL refererUrl)
	{
		if (refererUrl != null)
			this.refererUrl().setValue(refererUrl);
	}

	public void setRefererUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL refererUrl)
	{
		this.refererUrl = refererUrl;
	}
}
