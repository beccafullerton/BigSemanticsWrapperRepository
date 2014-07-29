package ecologylab.bigsemantics.generated.library.researchGate;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.gis.ContactPoint;
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
public class ResearchGateInstitutionContactInfo extends ContactPoint
{
	@simpl_scalar
	private MetadataString websiteAddress;

	public ResearchGateInstitutionContactInfo()
	{ super(); }

	public ResearchGateInstitutionContactInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	websiteAddress()
	{
		MetadataString	result = this.websiteAddress;
		if (result == null)
		{
			result = new MetadataString();
			this.websiteAddress = result;
		}
		return result;
	}

	public String getWebsiteAddress()
	{
		return this.websiteAddress == null ? null : websiteAddress().getValue();
	}

	public MetadataString getWebsiteAddressMetadata()
	{
		return websiteAddress;
	}

	public void setWebsiteAddress(String websiteAddress)
	{
		if (websiteAddress != null)
			this.websiteAddress().setValue(websiteAddress);
	}

	public void setWebsiteAddressMetadata(MetadataString websiteAddress)
	{
		this.websiteAddress = websiteAddress;
	}
}
