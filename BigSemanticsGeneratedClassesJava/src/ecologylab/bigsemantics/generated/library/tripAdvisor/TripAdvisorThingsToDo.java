package ecologylab.bigsemantics.generated.library.tripAdvisor;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.attraction.Attraction;
import ecologylab.bigsemantics.generated.library.hotel.Hotel;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Trip advisor travel suggestions
 */ 
@simpl_inherit
public class TripAdvisorThingsToDo extends Attraction
{
	@simpl_composite
	@mm_name("image")
	private Image image;

	@simpl_collection("hotel")
	@mm_name("popular_hotels")
	private List<Hotel> popularHotels;

	public TripAdvisorThingsToDo()
	{ super(); }

	public TripAdvisorThingsToDo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public List<Hotel> getPopularHotels()
	{
		return popularHotels;
	}

  // lazy evaluation:
  public List<Hotel> popularHotels()
  {
    if (popularHotels == null)
      popularHotels = new ArrayList<Hotel>();
    return popularHotels;
  }

  // addTo:
  public void addToPopularHotels(Hotel element)
  {
    popularHotels().add(element);
  }

  // size:
  public int popularHotelsSize()
  {
    return popularHotels == null ? 0 : popularHotels.size();
  }

	public void setPopularHotels(List<Hotel> popularHotels)
	{
		this.popularHotels = popularHotels;
	}
}
