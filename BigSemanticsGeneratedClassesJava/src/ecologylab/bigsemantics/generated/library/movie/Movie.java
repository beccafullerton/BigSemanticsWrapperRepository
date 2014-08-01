package ecologylab.bigsemantics.generated.library.movie;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.CreativeWork;
import ecologylab.bigsemantics.generated.library.movie.MoviePerson;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *The movie class.
 */ 
@simpl_inherit
public class Movie extends CreativeWork
{
	@simpl_scalar
	private MetadataString tagline;

	@simpl_scalar
	private MetadataString storyline;

	/** 
	 *MPAA rating
	 */ 
	@simpl_scalar
	private MetadataString mpaaRating;

	/** 
	 *How long the movie runs
	 */ 
	@simpl_scalar
	private MetadataString runtime;

	/** 
	 *When the movie was released in theaters
	 */ 
	@simpl_scalar
	private MetadataString theaterRelease;

	/** 
	 *Who directed the movie.
	 */ 
	@simpl_collection("movie_person")
	@mm_name("directors")
	private List<MoviePerson> directors;

	/** 
	 *Who wrote the movie.
	 */ 
	@simpl_collection("movie_person")
	@mm_name("writers")
	private List<MoviePerson> writers;

	/** 
	 *Movie Poster or other image
	 */ 
	@simpl_scalar
	private MetadataParsedURL pic;

	@simpl_collection("image")
	@mm_name("photos")
	private List<Image> photos;

	@simpl_collection("movie_person")
	@mm_name("cast")
	private List<MoviePerson> cast;

	/** 
	 *Movie genres
	 */ 
	@simpl_collection("document")
	@mm_name("genres")
	private List<Document> genres;

	public Movie()
	{ super(); }

	public Movie(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	tagline()
	{
		MetadataString	result = this.tagline;
		if (result == null)
		{
			result = new MetadataString();
			this.tagline = result;
		}
		return result;
	}

	public String getTagline()
	{
		return this.tagline == null ? null : tagline().getValue();
	}

	public MetadataString getTaglineMetadata()
	{
		return tagline;
	}

	public void setTagline(String tagline)
	{
		if (tagline != null)
			this.tagline().setValue(tagline);
	}

	public void setTaglineMetadata(MetadataString tagline)
	{
		this.tagline = tagline;
	}

	public MetadataString	storyline()
	{
		MetadataString	result = this.storyline;
		if (result == null)
		{
			result = new MetadataString();
			this.storyline = result;
		}
		return result;
	}

	public String getStoryline()
	{
		return this.storyline == null ? null : storyline().getValue();
	}

	public MetadataString getStorylineMetadata()
	{
		return storyline;
	}

	public void setStoryline(String storyline)
	{
		if (storyline != null)
			this.storyline().setValue(storyline);
	}

	public void setStorylineMetadata(MetadataString storyline)
	{
		this.storyline = storyline;
	}

	public MetadataString	mpaaRating()
	{
		MetadataString	result = this.mpaaRating;
		if (result == null)
		{
			result = new MetadataString();
			this.mpaaRating = result;
		}
		return result;
	}

	public String getMpaaRating()
	{
		return this.mpaaRating == null ? null : mpaaRating().getValue();
	}

	public MetadataString getMpaaRatingMetadata()
	{
		return mpaaRating;
	}

	public void setMpaaRating(String mpaaRating)
	{
		if (mpaaRating != null)
			this.mpaaRating().setValue(mpaaRating);
	}

	public void setMpaaRatingMetadata(MetadataString mpaaRating)
	{
		this.mpaaRating = mpaaRating;
	}

	public MetadataString	runtime()
	{
		MetadataString	result = this.runtime;
		if (result == null)
		{
			result = new MetadataString();
			this.runtime = result;
		}
		return result;
	}

	public String getRuntime()
	{
		return this.runtime == null ? null : runtime().getValue();
	}

	public MetadataString getRuntimeMetadata()
	{
		return runtime;
	}

	public void setRuntime(String runtime)
	{
		if (runtime != null)
			this.runtime().setValue(runtime);
	}

	public void setRuntimeMetadata(MetadataString runtime)
	{
		this.runtime = runtime;
	}

	public MetadataString	theaterRelease()
	{
		MetadataString	result = this.theaterRelease;
		if (result == null)
		{
			result = new MetadataString();
			this.theaterRelease = result;
		}
		return result;
	}

	public String getTheaterRelease()
	{
		return this.theaterRelease == null ? null : theaterRelease().getValue();
	}

	public MetadataString getTheaterReleaseMetadata()
	{
		return theaterRelease;
	}

	public void setTheaterRelease(String theaterRelease)
	{
		if (theaterRelease != null)
			this.theaterRelease().setValue(theaterRelease);
	}

	public void setTheaterReleaseMetadata(MetadataString theaterRelease)
	{
		this.theaterRelease = theaterRelease;
	}

	public List<MoviePerson> getDirectors()
	{
		return directors;
	}

  // lazy evaluation:
  public List<MoviePerson> directors()
  {
    if (directors == null)
      directors = new ArrayList<MoviePerson>();
    return directors;
  }

  // addTo:
  public void addToDirectors(MoviePerson element)
  {
    directors().add(element);
  }

  // size:
  public int directorsSize()
  {
    return directors == null ? 0 : directors.size();
  }

	public void setDirectors(List<MoviePerson> directors)
	{
		this.directors = directors;
	}

	public List<MoviePerson> getWriters()
	{
		return writers;
	}

  // lazy evaluation:
  public List<MoviePerson> writers()
  {
    if (writers == null)
      writers = new ArrayList<MoviePerson>();
    return writers;
  }

  // addTo:
  public void addToWriters(MoviePerson element)
  {
    writers().add(element);
  }

  // size:
  public int writersSize()
  {
    return writers == null ? 0 : writers.size();
  }

	public void setWriters(List<MoviePerson> writers)
	{
		this.writers = writers;
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

	public MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		if (pic != null)
			this.pic().setValue(pic);
	}

	public void setPicMetadata(MetadataParsedURL pic)
	{
		this.pic = pic;
	}

	public List<Image> getPhotos()
	{
		return photos;
	}

  // lazy evaluation:
  public List<Image> photos()
  {
    if (photos == null)
      photos = new ArrayList<Image>();
    return photos;
  }

  // addTo:
  public void addToPhotos(Image element)
  {
    photos().add(element);
  }

  // size:
  public int photosSize()
  {
    return photos == null ? 0 : photos.size();
  }

	public void setPhotos(List<Image> photos)
	{
		this.photos = photos;
	}

	public List<MoviePerson> getCast()
	{
		return cast;
	}

  // lazy evaluation:
  public List<MoviePerson> cast()
  {
    if (cast == null)
      cast = new ArrayList<MoviePerson>();
    return cast;
  }

  // addTo:
  public void addToCast(MoviePerson element)
  {
    cast().add(element);
  }

  // size:
  public int castSize()
  {
    return cast == null ? 0 : cast.size();
  }

	public void setCast(List<MoviePerson> cast)
	{
		this.cast = cast;
	}

	public List<Document> getGenres()
	{
		return genres;
	}

  // lazy evaluation:
  public List<Document> genres()
  {
    if (genres == null)
      genres = new ArrayList<Document>();
    return genres;
  }

  // addTo:
  public void addToGenres(Document element)
  {
    genres().add(element);
  }

  // size:
  public int genresSize()
  {
    return genres == null ? 0 : genres.size();
  }

	public void setGenres(List<Document> genres)
	{
		this.genres = genres;
	}
}
