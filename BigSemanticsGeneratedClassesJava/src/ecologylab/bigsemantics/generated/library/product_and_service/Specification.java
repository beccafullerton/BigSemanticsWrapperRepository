package ecologylab.bigsemantics.generated.library.product_and_service;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Specification extends Metadata
{
	@simpl_scalar
	private MetadataString name;

	@simpl_scalar
	private MetadataString value;

	public Specification()
	{ super(); }

	public Specification(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	name()
	{
		MetadataString	result = this.name;
		if (result == null)
		{
			result = new MetadataString();
			this.name = result;
		}
		return result;
	}

	public String getName()
	{
		return this.name == null ? null : name().getValue();
	}

	public MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(MetadataString name)
	{
		this.name = name;
	}

	public MetadataString	value()
	{
		MetadataString	result = this.value;
		if (result == null)
		{
			result = new MetadataString();
			this.value = result;
		}
		return result;
	}

	public String getValue()
	{
		return this.value == null ? null : value().getValue();
	}

	public MetadataString getValueMetadata()
	{
		return value;
	}

	public void setValue(String value)
	{
		if (value != null)
			this.value().setValue(value);
	}

	public void setValueMetadata(MetadataString value)
	{
		this.value = value;
	}
}
