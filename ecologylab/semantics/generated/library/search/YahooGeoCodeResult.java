package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.search.YahooResult;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  YahooGeoCodeResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class YahooGeoCodeResult extends YahooResult
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString county;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString postal;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString state;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString line1;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString line2;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString city;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString country;

	public YahooGeoCodeResult()
	{ }

	public YahooGeoCodeResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	county()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.county;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.county = result;
		}
		return result;
	}

	public java.lang.String getCounty()
	{
		return this.county == null ? null : county().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCountyMetadata()
	{
		return county;
	}

	public void setCounty(java.lang.String county)
	{
		if (county != null)
			this.county().setValue(county);
	}

	public void setCountyMetadata(ecologylab.semantics.metadata.scalar.MetadataString county)
	{
		this.county = county;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	postal()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.postal;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.postal = result;
		}
		return result;
	}

	public java.lang.String getPostal()
	{
		return this.postal == null ? null : postal().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPostalMetadata()
	{
		return postal;
	}

	public void setPostal(java.lang.String postal)
	{
		if (postal != null)
			this.postal().setValue(postal);
	}

	public void setPostalMetadata(ecologylab.semantics.metadata.scalar.MetadataString postal)
	{
		this.postal = postal;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	state()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.state;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.state = result;
		}
		return result;
	}

	public java.lang.String getState()
	{
		return this.state == null ? null : state().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getStateMetadata()
	{
		return state;
	}

	public void setState(java.lang.String state)
	{
		if (state != null)
			this.state().setValue(state);
	}

	public void setStateMetadata(ecologylab.semantics.metadata.scalar.MetadataString state)
	{
		this.state = state;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	line1()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.line1;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.line1 = result;
		}
		return result;
	}

	public java.lang.String getLine1()
	{
		return this.line1 == null ? null : line1().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getLine1Metadata()
	{
		return line1;
	}

	public void setLine1(java.lang.String line1)
	{
		if (line1 != null)
			this.line1().setValue(line1);
	}

	public void setLine1Metadata(ecologylab.semantics.metadata.scalar.MetadataString line1)
	{
		this.line1 = line1;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	line2()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.line2;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.line2 = result;
		}
		return result;
	}

	public java.lang.String getLine2()
	{
		return this.line2 == null ? null : line2().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getLine2Metadata()
	{
		return line2;
	}

	public void setLine2(java.lang.String line2)
	{
		if (line2 != null)
			this.line2().setValue(line2);
	}

	public void setLine2Metadata(ecologylab.semantics.metadata.scalar.MetadataString line2)
	{
		this.line2 = line2;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	city()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.city;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.city = result;
		}
		return result;
	}

	public java.lang.String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(java.lang.String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(ecologylab.semantics.metadata.scalar.MetadataString city)
	{
		this.city = city;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	country()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.country;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.country = result;
		}
		return result;
	}

	public java.lang.String getCountry()
	{
		return this.country == null ? null : country().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCountryMetadata()
	{
		return country;
	}

	public void setCountry(java.lang.String country)
	{
		if (country != null)
			this.country().setValue(country);
	}

	public void setCountryMetadata(ecologylab.semantics.metadata.scalar.MetadataString country)
	{
		this.country = country;
	}
}
