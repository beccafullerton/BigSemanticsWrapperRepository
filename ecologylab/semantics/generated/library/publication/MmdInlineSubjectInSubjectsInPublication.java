package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineSubjectInSubjectsInPublication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineSubjectInSubjectsInPublication extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL location;

	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private ecologylab.semantics.metadata.scalar.MetadataString subject;

	public MmdInlineSubjectInSubjectsInPublication()
	{ }

	public MmdInlineSubjectInSubjectsInPublication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	location()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.location;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.location = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getLocation()
	{
		return this.location == null ? null : location().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLocationMetadata()
	{
		return location;
	}

	public void setLocation(ecologylab.net.ParsedURL location)
	{
		if (location != null)
			this.location().setValue(location);
	}

	public void setLocationMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL location)
	{
		this.location = location;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	subject()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.subject;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.subject = result;
		}
		return result;
	}

	public java.lang.String getSubject()
	{
		return this.subject == null ? null : subject().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSubjectMetadata()
	{
		return subject;
	}

	public void setSubject(java.lang.String subject)
	{
		if (subject != null)
			this.subject().setValue(subject);
	}

	public void setSubjectMetadata(ecologylab.semantics.metadata.scalar.MetadataString subject)
	{
		this.subject = subject;
	}
}
