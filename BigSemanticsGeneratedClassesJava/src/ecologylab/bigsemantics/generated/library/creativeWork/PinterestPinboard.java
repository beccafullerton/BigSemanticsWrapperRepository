package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.PinterestPin;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class PinterestPinboard extends CreativeWork
{
	@simpl_collection("pinterest_pin")
	@mm_name("pins")
	private List<PinterestPin> pins;

	@simpl_composite
	@mm_name("pinner")
	private Author pinner;

	public PinterestPinboard()
	{ super(); }

	public PinterestPinboard(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<PinterestPin> getPins()
	{
		return pins;
	}

  // lazy evaluation:
  public List<PinterestPin> pins()
  {
    if (pins == null)
      pins = new ArrayList<PinterestPin>();
    return pins;
  }

  // addTo:
  public void addToPins(PinterestPin element)
  {
    pins().add(element);
  }

  // size:
  public int pinsSize()
  {
    return pins == null ? 0 : pins.size();
  }

	public void setPins(List<PinterestPin> pins)
	{
		this.pins = pins;
	}

	public Author getPinner()
	{
		return pinner;
	}

	public void setPinner(Author pinner)
	{
		this.pinner = pinner;
	}
}
