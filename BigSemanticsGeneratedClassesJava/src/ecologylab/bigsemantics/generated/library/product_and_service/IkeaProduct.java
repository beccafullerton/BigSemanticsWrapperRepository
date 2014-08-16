package ecologylab.bigsemantics.generated.library.product_and_service;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.product_and_service.IkeaDepartment;
import ecologylab.bigsemantics.generated.library.product_and_service.Product;
import ecologylab.bigsemantics.generated.library.product_and_service.Specification;
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
public class IkeaProduct extends Product
{
	@simpl_collection("specification")
	@mm_name("dimensions")
	private List<Specification> dimensions;

	@simpl_scalar
	private MetadataString weight;

	@simpl_collection("ikea_department")
	@mm_name("departments")
	private List<IkeaDepartment> departments;

	public IkeaProduct()
	{ super(); }

	public IkeaProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Specification> getDimensions()
	{
		return dimensions;
	}

  // lazy evaluation:
  public List<Specification> dimensions()
  {
    if (dimensions == null)
      dimensions = new ArrayList<Specification>();
    return dimensions;
  }

  // addTo:
  public void addToDimensions(Specification element)
  {
    dimensions().add(element);
  }

  // size:
  public int dimensionsSize()
  {
    return dimensions == null ? 0 : dimensions.size();
  }

	public void setDimensions(List<Specification> dimensions)
	{
		this.dimensions = dimensions;
	}

	public MetadataString	weight()
	{
		MetadataString	result = this.weight;
		if (result == null)
		{
			result = new MetadataString();
			this.weight = result;
		}
		return result;
	}

	public String getWeight()
	{
		return this.weight == null ? null : weight().getValue();
	}

	public MetadataString getWeightMetadata()
	{
		return weight;
	}

	public void setWeight(String weight)
	{
		if (weight != null)
			this.weight().setValue(weight);
	}

	public void setWeightMetadata(MetadataString weight)
	{
		this.weight = weight;
	}

	public List<IkeaDepartment> getDepartments()
	{
		return departments;
	}

  // lazy evaluation:
  public List<IkeaDepartment> departments()
  {
    if (departments == null)
      departments = new ArrayList<IkeaDepartment>();
    return departments;
  }

  // addTo:
  public void addToDepartments(IkeaDepartment element)
  {
    departments().add(element);
  }

  // size:
  public int departmentsSize()
  {
    return departments == null ? 0 : departments.size();
  }

	public void setDepartments(List<IkeaDepartment> departments)
	{
		this.departments = departments;
	}
}