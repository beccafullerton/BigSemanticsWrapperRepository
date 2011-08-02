package ecologylab.semantics.generated.library.misc;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Dlms.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The DLMS Class
 */ 
@simpl_inherit
public class Dlms extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString subject;

	public Dlms()
	{ }

	public Dlms(MetaMetadataCompositeField mmd) {
		super(mmd);
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
