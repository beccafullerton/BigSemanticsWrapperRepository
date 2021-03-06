package ecologylab.bigsemantics.generated.library.creativeWork.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.FlamencoFacet;
import ecologylab.bigsemantics.generated.library.creativeWork.artwork.Artwork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FlamencoObject extends Artwork
{
	@simpl_scalar
	private MetadataString category;

	@simpl_collection("flamenco_facet")
	@mm_name("general_facets")
	private List<FlamencoFacet> generalFacets;

	@simpl_collection("flamenco_facet")
	@mm_name("specific_facets")
	private List<FlamencoFacet> specificFacets;

	public FlamencoObject()
	{ super(); }

	public FlamencoObject(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	category()
	{
		MetadataString	result = this.category;
		if (result == null)
		{
			result = new MetadataString();
			this.category = result;
		}
		return result;
	}

	public String getCategory()
	{
		return this.category == null ? null : category().getValue();
	}

	public MetadataString getCategoryMetadata()
	{
		return category;
	}

	public void setCategory(String category)
	{
		if (category != null)
			this.category().setValue(category);
	}

	public void setCategoryMetadata(MetadataString category)
	{
		this.category = category;
	}

	public List<FlamencoFacet> getGeneralFacets()
	{
		return generalFacets;
	}

  // lazy evaluation:
  public List<FlamencoFacet> generalFacets()
  {
    if (generalFacets == null)
      generalFacets = new ArrayList<FlamencoFacet>();
    return generalFacets;
  }

  // addTo:
  public void addToGeneralFacets(FlamencoFacet element)
  {
    generalFacets().add(element);
  }

  // size:
  public int generalFacetsSize()
  {
    return generalFacets == null ? 0 : generalFacets.size();
  }

	public void setGeneralFacets(List<FlamencoFacet> generalFacets)
	{
		this.generalFacets = generalFacets;
	}

	public List<FlamencoFacet> getSpecificFacets()
	{
		return specificFacets;
	}

  // lazy evaluation:
  public List<FlamencoFacet> specificFacets()
  {
    if (specificFacets == null)
      specificFacets = new ArrayList<FlamencoFacet>();
    return specificFacets;
  }

  // addTo:
  public void addToSpecificFacets(FlamencoFacet element)
  {
    specificFacets().add(element);
  }

  // size:
  public int specificFacetsSize()
  {
    return specificFacets == null ? 0 : specificFacets.size();
  }

	public void setSpecificFacets(List<FlamencoFacet> specificFacets)
	{
		this.specificFacets = specificFacets;
	}
}
