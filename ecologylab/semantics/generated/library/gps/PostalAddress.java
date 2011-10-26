package ecologylab.semantics.generated.library.gps;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.gps.ContactPoint;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;

/** 
 *Resembles a schema.org PostalAddress, but is a mixin, not extending document. Also adds the county field.
 */ 
@simpl_inherit
public class PostalAddress extends ContactPoint
{
	/** 
	 *This is really the city.
	 */ 
	@simpl_scalar
	private MetadataString locality;

	/** 
	 *This is state in the U.S., province in Canada, and varies internationaaly.
	 */ 
	@simpl_scalar
	private MetadataString region;

	/** 
	 *The internationalized version of zip code.
	 */ 
	@simpl_scalar
	private MetadataString postalCode;

	@simpl_scalar
	private MetadataString county;

	@simpl_scalar
	private MetadataString country;

	public PostalAddress()
	{ }

	public PostalAddress(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	locality()
	{
		MetadataString	result = this.locality;
		if (result == null)
		{
			result = new MetadataString();
			this.locality = result;
		}
		return result;
	}

	public String getLocality()
	{
		return this.locality == null ? null : locality().getValue();
	}

	public MetadataString getLocalityMetadata()
	{
		return locality;
	}

	public void setLocality(String locality)
	{
		if (locality != null)
			this.locality().setValue(locality);
	}

	public void setLocalityMetadata(MetadataString locality)
	{
		this.locality = locality;
	}

	public MetadataString	region()
	{
		MetadataString	result = this.region;
		if (result == null)
		{
			result = new MetadataString();
			this.region = result;
		}
		return result;
	}

	public String getRegion()
	{
		return this.region == null ? null : region().getValue();
	}

	public MetadataString getRegionMetadata()
	{
		return region;
	}

	public void setRegion(String region)
	{
		if (region != null)
			this.region().setValue(region);
	}

	public void setRegionMetadata(MetadataString region)
	{
		this.region = region;
	}

	public MetadataString	postalCode()
	{
		MetadataString	result = this.postalCode;
		if (result == null)
		{
			result = new MetadataString();
			this.postalCode = result;
		}
		return result;
	}

	public String getPostalCode()
	{
		return this.postalCode == null ? null : postalCode().getValue();
	}

	public MetadataString getPostalCodeMetadata()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		if (postalCode != null)
			this.postalCode().setValue(postalCode);
	}

	public void setPostalCodeMetadata(MetadataString postalCode)
	{
		this.postalCode = postalCode;
	}

	public MetadataString	county()
	{
		MetadataString	result = this.county;
		if (result == null)
		{
			result = new MetadataString();
			this.county = result;
		}
		return result;
	}

	public String getCounty()
	{
		return this.county == null ? null : county().getValue();
	}

	public MetadataString getCountyMetadata()
	{
		return county;
	}

	public void setCounty(String county)
	{
		if (county != null)
			this.county().setValue(county);
	}

	public void setCountyMetadata(MetadataString county)
	{
		this.county = county;
	}

	public MetadataString	country()
	{
		MetadataString	result = this.country;
		if (result == null)
		{
			result = new MetadataString();
			this.country = result;
		}
		return result;
	}

	public String getCountry()
	{
		return this.country == null ? null : country().getValue();
	}

	public MetadataString getCountryMetadata()
	{
		return country;
	}

	public void setCountry(String country)
	{
		if (country != null)
			this.country().setValue(country);
	}

	public void setCountryMetadata(MetadataString country)
	{
		this.country = country;
	}
}
