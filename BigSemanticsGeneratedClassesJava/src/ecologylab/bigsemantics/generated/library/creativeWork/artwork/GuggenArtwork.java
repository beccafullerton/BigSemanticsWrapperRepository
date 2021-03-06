package ecologylab.bigsemantics.generated.library.creativeWork.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.artwork.Artwork;
import ecologylab.bigsemantics.generated.library.search.GuggenFilter;
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
public class GuggenArtwork extends Artwork
{
	@simpl_collection("guggen_filter")
	@mm_name("tags")
	private List<GuggenFilter> tags;

	public GuggenArtwork()
	{ super(); }

	public GuggenArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GuggenFilter> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<GuggenFilter> tags()
  {
    if (tags == null)
      tags = new ArrayList<GuggenFilter>();
    return tags;
  }

  // addTo:
  public void addToTags(GuggenFilter element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<GuggenFilter> tags)
	{
		this.tags = tags;
	}
}
