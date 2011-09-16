package ecologylab.semantics.generated.library.bibManaging;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.bibManaging.CiteseerxRecord;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  CiteseerxSummary.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Summary page from CiteSeerX.
 */ 
@simpl_inherit
public class CiteseerxSummary extends CiteseerxRecord
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL citationPage;

	/** 
	 * Papers that cite the same works.
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL activeBibliographyPage;

	/** 
	 * Papers that are cited by the same works.
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL cocitationPage;

	public CiteseerxSummary()
	{ }

	public CiteseerxSummary(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	citationPage()
	{
		MetadataParsedURL	result = this.citationPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.citationPage = result;
		}
		return result;
	}

	public ParsedURL getCitationPage()
	{
		return this.citationPage == null ? null : citationPage().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getCitationPageMetadata()
	{
		return citationPage;
	}

	public void setCitationPage(ParsedURL citationPage)
	{
		if (citationPage != null)
			this.citationPage().setValue(citationPage);
	}

	public void setCitationPageMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL citationPage)
	{
		this.citationPage = citationPage;
	}

	public MetadataParsedURL	activeBibliographyPage()
	{
		MetadataParsedURL	result = this.activeBibliographyPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.activeBibliographyPage = result;
		}
		return result;
	}

	public ParsedURL getActiveBibliographyPage()
	{
		return this.activeBibliographyPage == null ? null : activeBibliographyPage().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getActiveBibliographyPageMetadata()
	{
		return activeBibliographyPage;
	}

	public void setActiveBibliographyPage(ParsedURL activeBibliographyPage)
	{
		if (activeBibliographyPage != null)
			this.activeBibliographyPage().setValue(activeBibliographyPage);
	}

	public void setActiveBibliographyPageMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL activeBibliographyPage)
	{
		this.activeBibliographyPage = activeBibliographyPage;
	}

	public MetadataParsedURL	cocitationPage()
	{
		MetadataParsedURL	result = this.cocitationPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.cocitationPage = result;
		}
		return result;
	}

	public ParsedURL getCocitationPage()
	{
		return this.cocitationPage == null ? null : cocitationPage().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getCocitationPageMetadata()
	{
		return cocitationPage;
	}

	public void setCocitationPage(ParsedURL cocitationPage)
	{
		if (cocitationPage != null)
			this.cocitationPage().setValue(cocitationPage);
	}

	public void setCocitationPageMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL cocitationPage)
	{
		this.cocitationPage = cocitationPage;
	}
}
