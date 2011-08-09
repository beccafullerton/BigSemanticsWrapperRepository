package ecologylab.semantics.generated.library.gps;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  ContactPoint.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Resembles a schema.org ContactPoint but is a mixin, not extending document.
 */ 
@simpl_inherit
public class ContactPoint extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString telephone;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString faxNumber;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString email;

	public ContactPoint()
	{ }

	public ContactPoint(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	telephone()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.telephone;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.telephone = result;
		}
		return result;
	}

	public java.lang.String getTelephone()
	{
		return this.telephone == null ? null : telephone().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTelephoneMetadata()
	{
		return telephone;
	}

	public void setTelephone(java.lang.String telephone)
	{
		if (telephone != null)
			this.telephone().setValue(telephone);
	}

	public void setTelephoneMetadata(ecologylab.semantics.metadata.scalar.MetadataString telephone)
	{
		this.telephone = telephone;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	faxNumber()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.faxNumber;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.faxNumber = result;
		}
		return result;
	}

	public java.lang.String getFaxNumber()
	{
		return this.faxNumber == null ? null : faxNumber().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getFaxNumberMetadata()
	{
		return faxNumber;
	}

	public void setFaxNumber(java.lang.String faxNumber)
	{
		if (faxNumber != null)
			this.faxNumber().setValue(faxNumber);
	}

	public void setFaxNumberMetadata(ecologylab.semantics.metadata.scalar.MetadataString faxNumber)
	{
		this.faxNumber = faxNumber;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	email()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.email;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.email = result;
		}
		return result;
	}

	public java.lang.String getEmail()
	{
		return this.email == null ? null : email().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getEmailMetadata()
	{
		return email;
	}

	public void setEmail(java.lang.String email)
	{
		if (email != null)
			this.email().setValue(email);
	}

	public void setEmailMetadata(ecologylab.semantics.metadata.scalar.MetadataString email)
	{
		this.email = email;
	}
}
