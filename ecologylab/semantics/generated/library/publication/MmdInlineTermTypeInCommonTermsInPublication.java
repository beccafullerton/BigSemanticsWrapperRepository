package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineTermTypeInCommonTermsInPublication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineTermTypeInCommonTermsInPublication extends Document
{
	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private ecologylab.semantics.metadata.scalar.MetadataString term;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger frequency;

	public MmdInlineTermTypeInCommonTermsInPublication()
	{ }

	public MmdInlineTermTypeInCommonTermsInPublication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	term()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.term;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.term = result;
		}
		return result;
	}

	public java.lang.String getTerm()
	{
		return this.term == null ? null : term().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTermMetadata()
	{
		return term;
	}

	public void setTerm(java.lang.String term)
	{
		if (term != null)
			this.term().setValue(term);
	}

	public void setTermMetadata(ecologylab.semantics.metadata.scalar.MetadataString term)
	{
		this.term = term;
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger	frequency()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.frequency;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.frequency = result;
		}
		return result;
	}

	public java.lang.Integer getFrequency()
	{
		return this.frequency == null ? 0 : frequency().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getFrequencyMetadata()
	{
		return frequency;
	}

	public void setFrequency(java.lang.Integer frequency)
	{
		if (frequency != 0)
			this.frequency().setValue(frequency);
	}

	public void setFrequencyMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger frequency)
	{
		this.frequency = frequency;
	}
}
