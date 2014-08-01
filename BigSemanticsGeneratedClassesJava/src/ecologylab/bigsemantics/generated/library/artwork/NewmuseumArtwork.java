package ecologylab.bigsemantics.generated.library.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.artwork.Artwork;
import ecologylab.bigsemantics.generated.library.artwork.NewmuseumExhibition;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class NewmuseumArtwork extends Artwork
{
	@simpl_collection("newmuseum_exhibition")
	@mm_name("related_exhibitions")
	private List<NewmuseumExhibition> relatedExhibitions;

	public NewmuseumArtwork()
	{ super(); }

	public NewmuseumArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<NewmuseumExhibition> getRelatedExhibitions()
	{
		return relatedExhibitions;
	}

  // lazy evaluation:
  public List<NewmuseumExhibition> relatedExhibitions()
  {
    if (relatedExhibitions == null)
      relatedExhibitions = new ArrayList<NewmuseumExhibition>();
    return relatedExhibitions;
  }

  // addTo:
  public void addToRelatedExhibitions(NewmuseumExhibition element)
  {
    relatedExhibitions().add(element);
  }

  // size:
  public int relatedExhibitionsSize()
  {
    return relatedExhibitions == null ? 0 : relatedExhibitions.size();
  }

	public void setRelatedExhibitions(List<NewmuseumExhibition> relatedExhibitions)
	{
		this.relatedExhibitions = relatedExhibitions;
	}
}
