package ecologylab.semantics.generated.library;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  WeatherReport.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The definition of weather report class.
 */ 
@simpl_inherit
public class WeatherReport extends CompoundDocument
{
	/** 
	 * The name of the city.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString city;

	/** 
	 * The weather condition of the city, like sunny or cloudy.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString weather;

	/** 
	 * The URL of the picture indicating weather condition.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL picUrl;

	/** 
	 * The temperature.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString temperature;

	/** 
	 * The humidity of the air.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString humidity;

	/** 
	 * The wind speed.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString wind;

	/** 
	 * The dew point.
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString dewPoint;

	public WeatherReport()
	{ }

	public WeatherReport(MetaMetadataCompositeField mmd) {
		super(mmd);
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

	public ecologylab.semantics.metadata.scalar.MetadataString	weather()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.weather;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.weather = result;
		}
		return result;
	}

	public java.lang.String getWeather()
	{
		return this.weather == null ? null : weather().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getWeatherMetadata()
	{
		return weather;
	}

	public void setWeather(java.lang.String weather)
	{
		if (weather != null)
			this.weather().setValue(weather);
	}

	public void setWeatherMetadata(ecologylab.semantics.metadata.scalar.MetadataString weather)
	{
		this.weather = weather;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	picUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.picUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.picUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getPicUrl()
	{
		return this.picUrl == null ? null : picUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPicUrlMetadata()
	{
		return picUrl;
	}

	public void setPicUrl(ecologylab.net.ParsedURL picUrl)
	{
		if (picUrl != null)
			this.picUrl().setValue(picUrl);
	}

	public void setPicUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL picUrl)
	{
		this.picUrl = picUrl;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	temperature()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.temperature;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.temperature = result;
		}
		return result;
	}

	public java.lang.String getTemperature()
	{
		return this.temperature == null ? null : temperature().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTemperatureMetadata()
	{
		return temperature;
	}

	public void setTemperature(java.lang.String temperature)
	{
		if (temperature != null)
			this.temperature().setValue(temperature);
	}

	public void setTemperatureMetadata(ecologylab.semantics.metadata.scalar.MetadataString temperature)
	{
		this.temperature = temperature;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	humidity()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.humidity;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.humidity = result;
		}
		return result;
	}

	public java.lang.String getHumidity()
	{
		return this.humidity == null ? null : humidity().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getHumidityMetadata()
	{
		return humidity;
	}

	public void setHumidity(java.lang.String humidity)
	{
		if (humidity != null)
			this.humidity().setValue(humidity);
	}

	public void setHumidityMetadata(ecologylab.semantics.metadata.scalar.MetadataString humidity)
	{
		this.humidity = humidity;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	wind()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.wind;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.wind = result;
		}
		return result;
	}

	public java.lang.String getWind()
	{
		return this.wind == null ? null : wind().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getWindMetadata()
	{
		return wind;
	}

	public void setWind(java.lang.String wind)
	{
		if (wind != null)
			this.wind().setValue(wind);
	}

	public void setWindMetadata(ecologylab.semantics.metadata.scalar.MetadataString wind)
	{
		this.wind = wind;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	dewPoint()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.dewPoint;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.dewPoint = result;
		}
		return result;
	}

	public java.lang.String getDewPoint()
	{
		return this.dewPoint == null ? null : dewPoint().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDewPointMetadata()
	{
		return dewPoint;
	}

	public void setDewPoint(java.lang.String dewPoint)
	{
		if (dewPoint != null)
			this.dewPoint().setValue(dewPoint);
	}

	public void setDewPointMetadata(ecologylab.semantics.metadata.scalar.MetadataString dewPoint)
	{
		this.dewPoint = dewPoint;
	}
}
