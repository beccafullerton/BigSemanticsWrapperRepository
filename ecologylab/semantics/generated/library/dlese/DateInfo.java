package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.Date;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  DateInfo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class DateInfo extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataDate created;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataDate accessioned;

	public DateInfo()
	{ }

	public DateInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDate	created()
	{
		MetadataDate	result = this.created;
		if (result == null)
		{
			result = new MetadataDate();
			this.created = result;
		}
		return result;
	}

	public Date getCreated()
	{
		return this.created == null ? null : created().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDate getCreatedMetadata()
	{
		return created;
	}

	public void setCreated(Date created)
	{
		if (created != null)
			this.created().setValue(created);
	}

	public void setCreatedMetadata(ecologylab.semantics.metadata.scalar.MetadataDate created)
	{
		this.created = created;
	}

	public MetadataDate	accessioned()
	{
		MetadataDate	result = this.accessioned;
		if (result == null)
		{
			result = new MetadataDate();
			this.accessioned = result;
		}
		return result;
	}

	public Date getAccessioned()
	{
		return this.accessioned == null ? null : accessioned().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDate getAccessionedMetadata()
	{
		return accessioned;
	}

	public void setAccessioned(Date accessioned)
	{
		if (accessioned != null)
			this.accessioned().setValue(accessioned);
	}

	public void setAccessionedMetadata(ecologylab.semantics.metadata.scalar.MetadataDate accessioned)
	{
		this.accessioned = accessioned;
	}
}
