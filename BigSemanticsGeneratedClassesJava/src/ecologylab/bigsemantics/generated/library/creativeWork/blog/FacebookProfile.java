package ecologylab.bigsemantics.generated.library.creativeWork.blog;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.InterestGroup;
import ecologylab.bigsemantics.generated.library.creativeWork.SocialMediaProfile;
import ecologylab.bigsemantics.generated.library.creativeWork.blog.SocialMediaFeed;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.SocialMediaPost;
import ecologylab.bigsemantics.generated.library.person.author.FacebookUser;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FacebookProfile extends SocialMediaProfile
{
	@simpl_composite
	@simpl_tag("coverPhoto")
	@mm_name("coverPhoto")
	private Image coverPhoto;

	@simpl_collection("facebook_user")
	@mm_name("facebook")
	private List<FacebookUser> facebook;

	/** 
	 *mainFeed
	 */ 
	@simpl_collection("social_media_post")
	@mm_name("feed")
	private List<SocialMediaPost> feed;

	@simpl_collection("social_media_feed")
	@simpl_tag("Friends")
	@mm_name("Friends")
	private List<SocialMediaFeed> Friends;

	@simpl_collection("social_media_feed")
	@simpl_tag("Photos")
	@mm_name("Photos")
	private List<SocialMediaFeed> Photos;

	@simpl_collection("social_media_feed")
	@simpl_tag("Videos")
	@mm_name("Videos")
	private List<SocialMediaFeed> Videos;

	@simpl_collection("interest_group")
	@simpl_tag("Sports")
	@mm_name("Sports")
	private List<InterestGroup> Sports;

	@simpl_collection("interest_group")
	@simpl_tag("Music")
	@mm_name("Music")
	private List<InterestGroup> Music;

	@simpl_collection("interest_group")
	@simpl_tag("Movies")
	@mm_name("Movies")
	private List<InterestGroup> Movies;

	@simpl_collection("interest_group")
	@simpl_tag("appsAndGames")
	@mm_name("appsAndGames")
	private List<InterestGroup> appsAndGames;

	@simpl_collection("interest_group")
	@simpl_tag("Likes")
	@mm_name("Likes")
	private List<InterestGroup> Likes;

	@simpl_collection("social_media_feed")
	@mm_name("check_ins")
	private List<SocialMediaFeed> checkIns;

	public FacebookProfile()
	{ super(); }

	public FacebookProfile(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Image getCoverPhoto()
	{
		return coverPhoto;
	}

	public void setCoverPhoto(Image coverPhoto)
	{
		this.coverPhoto = coverPhoto;
	}

	public List<FacebookUser> getFacebook()
	{
		return facebook;
	}

  // lazy evaluation:
  public List<FacebookUser> facebook()
  {
    if (facebook == null)
      facebook = new ArrayList<FacebookUser>();
    return facebook;
  }

  // addTo:
  public void addToFacebook(FacebookUser element)
  {
    facebook().add(element);
  }

  // size:
  public int facebookSize()
  {
    return facebook == null ? 0 : facebook.size();
  }

	public void setFacebook(List<FacebookUser> facebook)
	{
		this.facebook = facebook;
	}

	public List<SocialMediaPost> getFeed()
	{
		return feed;
	}

  // lazy evaluation:
  public List<SocialMediaPost> feed()
  {
    if (feed == null)
      feed = new ArrayList<SocialMediaPost>();
    return feed;
  }

  // addTo:
  public void addToFeed(SocialMediaPost element)
  {
    feed().add(element);
  }

  // size:
  public int feedSize()
  {
    return feed == null ? 0 : feed.size();
  }

	public void setFeed(List<SocialMediaPost> feed)
	{
		this.feed = feed;
	}

	public List<SocialMediaFeed> getFriends()
	{
		return Friends;
	}

  // lazy evaluation:
  public List<SocialMediaFeed> Friends()
  {
    if (Friends == null)
      Friends = new ArrayList<SocialMediaFeed>();
    return Friends;
  }

  // addTo:
  public void addToFriends(SocialMediaFeed element)
  {
    Friends().add(element);
  }

  // size:
  public int FriendsSize()
  {
    return Friends == null ? 0 : Friends.size();
  }

	public void setFriends(List<SocialMediaFeed> Friends)
	{
		this.Friends = Friends;
	}

	public List<SocialMediaFeed> getPhotos()
	{
		return Photos;
	}

  // lazy evaluation:
  public List<SocialMediaFeed> Photos()
  {
    if (Photos == null)
      Photos = new ArrayList<SocialMediaFeed>();
    return Photos;
  }

  // addTo:
  public void addToPhotos(SocialMediaFeed element)
  {
    Photos().add(element);
  }

  // size:
  public int PhotosSize()
  {
    return Photos == null ? 0 : Photos.size();
  }

	public void setPhotos(List<SocialMediaFeed> Photos)
	{
		this.Photos = Photos;
	}

	public List<SocialMediaFeed> getVideos()
	{
		return Videos;
	}

  // lazy evaluation:
  public List<SocialMediaFeed> Videos()
  {
    if (Videos == null)
      Videos = new ArrayList<SocialMediaFeed>();
    return Videos;
  }

  // addTo:
  public void addToVideos(SocialMediaFeed element)
  {
    Videos().add(element);
  }

  // size:
  public int VideosSize()
  {
    return Videos == null ? 0 : Videos.size();
  }

	public void setVideos(List<SocialMediaFeed> Videos)
	{
		this.Videos = Videos;
	}

	public List<InterestGroup> getSports()
	{
		return Sports;
	}

  // lazy evaluation:
  public List<InterestGroup> Sports()
  {
    if (Sports == null)
      Sports = new ArrayList<InterestGroup>();
    return Sports;
  }

  // addTo:
  public void addToSports(InterestGroup element)
  {
    Sports().add(element);
  }

  // size:
  public int SportsSize()
  {
    return Sports == null ? 0 : Sports.size();
  }

	public void setSports(List<InterestGroup> Sports)
	{
		this.Sports = Sports;
	}

	public List<InterestGroup> getMusic()
	{
		return Music;
	}

  // lazy evaluation:
  public List<InterestGroup> Music()
  {
    if (Music == null)
      Music = new ArrayList<InterestGroup>();
    return Music;
  }

  // addTo:
  public void addToMusic(InterestGroup element)
  {
    Music().add(element);
  }

  // size:
  public int MusicSize()
  {
    return Music == null ? 0 : Music.size();
  }

	public void setMusic(List<InterestGroup> Music)
	{
		this.Music = Music;
	}

	public List<InterestGroup> getMovies()
	{
		return Movies;
	}

  // lazy evaluation:
  public List<InterestGroup> Movies()
  {
    if (Movies == null)
      Movies = new ArrayList<InterestGroup>();
    return Movies;
  }

  // addTo:
  public void addToMovies(InterestGroup element)
  {
    Movies().add(element);
  }

  // size:
  public int MoviesSize()
  {
    return Movies == null ? 0 : Movies.size();
  }

	public void setMovies(List<InterestGroup> Movies)
	{
		this.Movies = Movies;
	}

	public List<InterestGroup> getAppsAndGames()
	{
		return appsAndGames;
	}

  // lazy evaluation:
  public List<InterestGroup> appsAndGames()
  {
    if (appsAndGames == null)
      appsAndGames = new ArrayList<InterestGroup>();
    return appsAndGames;
  }

  // addTo:
  public void addToAppsAndGames(InterestGroup element)
  {
    appsAndGames().add(element);
  }

  // size:
  public int appsAndGamesSize()
  {
    return appsAndGames == null ? 0 : appsAndGames.size();
  }

	public void setAppsAndGames(List<InterestGroup> appsAndGames)
	{
		this.appsAndGames = appsAndGames;
	}

	public List<InterestGroup> getLikes()
	{
		return Likes;
	}

  // lazy evaluation:
  public List<InterestGroup> Likes()
  {
    if (Likes == null)
      Likes = new ArrayList<InterestGroup>();
    return Likes;
  }

  // addTo:
  public void addToLikes(InterestGroup element)
  {
    Likes().add(element);
  }

  // size:
  public int LikesSize()
  {
    return Likes == null ? 0 : Likes.size();
  }

	public void setLikes(List<InterestGroup> Likes)
	{
		this.Likes = Likes;
	}

	public List<SocialMediaFeed> getCheckIns()
	{
		return checkIns;
	}

  // lazy evaluation:
  public List<SocialMediaFeed> checkIns()
  {
    if (checkIns == null)
      checkIns = new ArrayList<SocialMediaFeed>();
    return checkIns;
  }

  // addTo:
  public void addToCheckIns(SocialMediaFeed element)
  {
    checkIns().add(element);
  }

  // size:
  public int checkInsSize()
  {
    return checkIns == null ? 0 : checkIns.size();
  }

	public void setCheckIns(List<SocialMediaFeed> checkIns)
	{
		this.checkIns = checkIns;
	}
}
