package crit.semantics.generated.txtf1.fieldreports.emergent_event;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import crit.semantics.generated.txtf1.fieldreports.emergent_event.EmergentEvent;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataFloat;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Float;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *a collection of emergent events
 */ 
@simpl_inherit
public class EmergentEventCollection extends Metadata
{
	@simpl_collection("emergent_event")
	@mm_name("emergent_events")
	private List<EmergentEvent> emergentEvents;

	@simpl_scalar
	private MetadataFloat version;

	@simpl_scalar
	private MetadataFloat metadataVersion;

	public EmergentEventCollection()
	{ super(); }

	public EmergentEventCollection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<EmergentEvent> getEmergentEvents()
	{
		return emergentEvents;
	}

  // lazy evaluation:
  public List<EmergentEvent> emergentEvents()
  {
    if (emergentEvents == null)
      emergentEvents = new ArrayList<EmergentEvent>();
    return emergentEvents;
  }

  // addTo:
  public void addToEmergentEvents(EmergentEvent element)
  {
    emergentEvents().add(element);
  }

  // size:
  public int emergentEventsSize()
  {
    return emergentEvents == null ? 0 : emergentEvents.size();
  }

	public void setEmergentEvents(List<EmergentEvent> emergentEvents)
	{
		this.emergentEvents = emergentEvents;
	}

	public MetadataFloat	version()
	{
		MetadataFloat	result = this.version;
		if (result == null)
		{
			result = new MetadataFloat();
			this.version = result;
		}
		return result;
	}

	public Float getVersion()
	{
		return this.version == null ? 0 : version().getValue();
	}

	public MetadataFloat getVersionMetadata()
	{
		return version;
	}

	public void setVersion(Float version)
	{
		if (version != 0)
			this.version().setValue(version);
	}

	public void setVersionMetadata(MetadataFloat version)
	{
		this.version = version;
	}

	public MetadataFloat	metadataVersion()
	{
		MetadataFloat	result = this.metadataVersion;
		if (result == null)
		{
			result = new MetadataFloat();
			this.metadataVersion = result;
		}
		return result;
	}

	public Float getMetadataVersion()
	{
		return this.metadataVersion == null ? 0 : metadataVersion().getValue();
	}

	public MetadataFloat getMetadataVersionMetadata()
	{
		return metadataVersion;
	}

	public void setMetadataVersion(Float metadataVersion)
	{
		if (metadataVersion != 0)
			this.metadataVersion().setValue(metadataVersion);
	}

	public void setMetadataVersionMetadata(MetadataFloat metadataVersion)
	{
		this.metadataVersion = metadataVersion;
	}
}
