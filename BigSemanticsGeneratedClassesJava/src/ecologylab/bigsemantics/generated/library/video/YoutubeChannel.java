package ecologylab.bigsemantics.generated.library.video;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.video.YoutubeChannel;
import ecologylab.bigsemantics.generated.library.video.YoutubeVideo;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *youtube channels
 */ 
@simpl_inherit
public class YoutubeChannel extends RichDocument
{
	@simpl_collection("youtube_video")
	@mm_name("featured_video")
	private List<YoutubeVideo> featuredVideo;

	@simpl_collection("youtube_video")
	@mm_name("video_feed")
	private List<YoutubeVideo> videoFeed;

	@simpl_collection("rich_document")
	@mm_name("playlist")
	private List<RichDocument> playlist;

	@simpl_collection("youtube_channel")
	@mm_name("featured_channels")
	private List<YoutubeChannel> featuredChannels;

	@simpl_collection("youtube_channel")
	@mm_name("related_channels")
	private List<YoutubeChannel> relatedChannels;

	public YoutubeChannel()
	{ super(); }

	public YoutubeChannel(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<YoutubeVideo> getFeaturedVideo()
	{
		return featuredVideo;
	}

  // lazy evaluation:
  public List<YoutubeVideo> featuredVideo()
  {
    if (featuredVideo == null)
      featuredVideo = new ArrayList<YoutubeVideo>();
    return featuredVideo;
  }

  // addTo:
  public void addToFeaturedVideo(YoutubeVideo element)
  {
    featuredVideo().add(element);
  }

  // size:
  public int featuredVideoSize()
  {
    return featuredVideo == null ? 0 : featuredVideo.size();
  }

	public void setFeaturedVideo(List<YoutubeVideo> featuredVideo)
	{
		this.featuredVideo = featuredVideo;
	}

	public List<YoutubeVideo> getVideoFeed()
	{
		return videoFeed;
	}

  // lazy evaluation:
  public List<YoutubeVideo> videoFeed()
  {
    if (videoFeed == null)
      videoFeed = new ArrayList<YoutubeVideo>();
    return videoFeed;
  }

  // addTo:
  public void addToVideoFeed(YoutubeVideo element)
  {
    videoFeed().add(element);
  }

  // size:
  public int videoFeedSize()
  {
    return videoFeed == null ? 0 : videoFeed.size();
  }

	public void setVideoFeed(List<YoutubeVideo> videoFeed)
	{
		this.videoFeed = videoFeed;
	}

	public List<RichDocument> getPlaylist()
	{
		return playlist;
	}

  // lazy evaluation:
  public List<RichDocument> playlist()
  {
    if (playlist == null)
      playlist = new ArrayList<RichDocument>();
    return playlist;
  }

  // addTo:
  public void addToPlaylist(RichDocument element)
  {
    playlist().add(element);
  }

  // size:
  public int playlistSize()
  {
    return playlist == null ? 0 : playlist.size();
  }

	public void setPlaylist(List<RichDocument> playlist)
	{
		this.playlist = playlist;
	}

	public List<YoutubeChannel> getFeaturedChannels()
	{
		return featuredChannels;
	}

  // lazy evaluation:
  public List<YoutubeChannel> featuredChannels()
  {
    if (featuredChannels == null)
      featuredChannels = new ArrayList<YoutubeChannel>();
    return featuredChannels;
  }

  // addTo:
  public void addToFeaturedChannels(YoutubeChannel element)
  {
    featuredChannels().add(element);
  }

  // size:
  public int featuredChannelsSize()
  {
    return featuredChannels == null ? 0 : featuredChannels.size();
  }

	public void setFeaturedChannels(List<YoutubeChannel> featuredChannels)
	{
		this.featuredChannels = featuredChannels;
	}

	public List<YoutubeChannel> getRelatedChannels()
	{
		return relatedChannels;
	}

  // lazy evaluation:
  public List<YoutubeChannel> relatedChannels()
  {
    if (relatedChannels == null)
      relatedChannels = new ArrayList<YoutubeChannel>();
    return relatedChannels;
  }

  // addTo:
  public void addToRelatedChannels(YoutubeChannel element)
  {
    relatedChannels().add(element);
  }

  // size:
  public int relatedChannelsSize()
  {
    return relatedChannels == null ? 0 : relatedChannels.size();
  }

	public void setRelatedChannels(List<YoutubeChannel> relatedChannels)
	{
		this.relatedChannels = relatedChannels;
	}
}
