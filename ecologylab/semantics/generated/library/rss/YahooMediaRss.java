package ecologylab.semantics.generated.library.rss;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.rss.Dc;
import ecologylab.semantics.generated.library.rss.MediaContent;
import ecologylab.serialization.simpl_inherit;

/**
*  YahooMediaRss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * News feeds.
 */ 
@simpl_inherit
public class YahooMediaRss extends Dc
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("media:content")	@mm_name("media_content")
	private MediaContent mediaContent;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("media:description")	@simpl_hints(Hint.XML_LEAF)	
	private ecologylab.semantics.metadata.scalar.MetadataString mediaDescription;

	public YahooMediaRss()
	{ }

	public YahooMediaRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MediaContent getMediaContent()
	{
		return mediaContent;
	}

	public void setMediaContent(MediaContent mediaContent)
	{
		this.mediaContent = mediaContent;
	}

	public MetadataString	mediaDescription()
	{
		MetadataString	result = this.mediaDescription;
		if (result == null)
		{
			result = new MetadataString();
			this.mediaDescription = result;
		}
		return result;
	}

	public String getMediaDescription()
	{
		return this.mediaDescription == null ? null : mediaDescription().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getMediaDescriptionMetadata()
	{
		return mediaDescription;
	}

	public void setMediaDescription(String mediaDescription)
	{
		if (mediaDescription != null)
			this.mediaDescription().setValue(mediaDescription);
	}

	public void setMediaDescriptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString mediaDescription)
	{
		this.mediaDescription = mediaDescription;
	}
}
