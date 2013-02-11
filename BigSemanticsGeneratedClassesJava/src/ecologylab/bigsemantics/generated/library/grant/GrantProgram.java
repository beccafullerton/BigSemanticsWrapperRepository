package ecologylab.bigsemantics.generated.library.grant;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.grant.Grant;
import ecologylab.bigsemantics.generated.library.grant.GrantStaff;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataDate;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GrantProgram extends CompoundDocument
{
	@simpl_collection("staff")
	@mm_name("staffs")
	private List<GrantStaff> staffs;

	@simpl_scalar
	private MetadataString synopsis;

	@simpl_scalar
	private MetadataString guidelines;

	@simpl_collection("due_date")
	@mm_name("due_dates")
	private List<MetadataDate> dueDates;

	@simpl_collection("grant")
	@mm_name("grants")
	private List<Grant> grants;

	public GrantProgram()
	{ super(); }

	public GrantProgram(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GrantStaff> getStaffs()
	{
		return staffs;
	}

  // lazy evaluation:
  public List<GrantStaff> staffs()
  {
    if (staffs == null)
      staffs = new ArrayList<GrantStaff>();
    return staffs;
  }

  // addTo:
  public void addToStaffs(GrantStaff element)
  {
    staffs().add(element);
  }

  // size:
  public int staffsSize()
  {
    return staffs == null ? 0 : staffs.size();
  }

	public void setStaffs(List<GrantStaff> staffs)
	{
		this.staffs = staffs;
	}

	public MetadataString	synopsis()
	{
		MetadataString	result = this.synopsis;
		if (result == null)
		{
			result = new MetadataString();
			this.synopsis = result;
		}
		return result;
	}

	public String getSynopsis()
	{
		return this.synopsis == null ? null : synopsis().getValue();
	}

	public MetadataString getSynopsisMetadata()
	{
		return synopsis;
	}

	public void setSynopsis(String synopsis)
	{
		if (synopsis != null)
			this.synopsis().setValue(synopsis);
	}

	public void setSynopsisMetadata(MetadataString synopsis)
	{
		this.synopsis = synopsis;
	}

	public MetadataString	guidelines()
	{
		MetadataString	result = this.guidelines;
		if (result == null)
		{
			result = new MetadataString();
			this.guidelines = result;
		}
		return result;
	}

	public String getGuidelines()
	{
		return this.guidelines == null ? null : guidelines().getValue();
	}

	public MetadataString getGuidelinesMetadata()
	{
		return guidelines;
	}

	public void setGuidelines(String guidelines)
	{
		if (guidelines != null)
			this.guidelines().setValue(guidelines);
	}

	public void setGuidelinesMetadata(MetadataString guidelines)
	{
		this.guidelines = guidelines;
	}

	public List<MetadataDate> getDueDates()
	{
		return dueDates;
	}

  // lazy evaluation:
  public List<MetadataDate> dueDates()
  {
    if (dueDates == null)
      dueDates = new ArrayList<MetadataDate>();
    return dueDates;
  }

  // addTo:
  public void addToDueDates(MetadataDate element)
  {
    dueDates().add(element);
  }

  // size:
  public int dueDatesSize()
  {
    return dueDates == null ? 0 : dueDates.size();
  }

	public void setDueDates(List<MetadataDate> dueDates)
	{
		this.dueDates = dueDates;
	}

	public List<Grant> getGrants()
	{
		return grants;
	}

  // lazy evaluation:
  public List<Grant> grants()
  {
    if (grants == null)
      grants = new ArrayList<Grant>();
    return grants;
  }

  // addTo:
  public void addToGrants(Grant element)
  {
    grants().add(element);
  }

  // size:
  public int grantsSize()
  {
    return grants == null ? 0 : grants.size();
  }

	public void setGrants(List<Grant> grants)
	{
		this.grants = grants;
	}
}
