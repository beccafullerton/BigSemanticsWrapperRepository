package ecologylab.semantics.generated.library.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

@simpl_inherit
public class TermType extends Document
{
	@simpl_scalar
	@simpl_composite_as_scalar
	private MetadataString term;

	@simpl_scalar
	private MetadataInteger frequency;

	public TermType()
	{ }

	public TermType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	term()
	{
		MetadataString	result = this.term;
		if (result == null)
		{
			result = new MetadataString();
			this.term = result;
		}
		return result;
	}

	public String getTerm()
	{
		return this.term == null ? null : term().getValue();
	}

	public MetadataString getTermMetadata()
	{
		return term;
	}

	public void setTerm(String term)
	{
		if (term != null)
			this.term().setValue(term);
	}

	public void setTermMetadata(MetadataString term)
	{
		this.term = term;
	}

	public MetadataInteger	frequency()
	{
		MetadataInteger	result = this.frequency;
		if (result == null)
		{
			result = new MetadataInteger();
			this.frequency = result;
		}
		return result;
	}

	public Integer getFrequency()
	{
		return this.frequency == null ? 0 : frequency().getValue();
	}

	public MetadataInteger getFrequencyMetadata()
	{
		return frequency;
	}

	public void setFrequency(Integer frequency)
	{
		if (frequency != 0)
			this.frequency().setValue(frequency);
	}

	public void setFrequencyMetadata(MetadataInteger frequency)
	{
		this.frequency = frequency;
	}
}
