package ecologylab.bigsemantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.dlese.Contributor;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Lifecycle extends Metadata
{
	@simpl_collection("contributor")
	@mm_name("contributors")
	private List<Contributor> contributors;

	public Lifecycle()
	{ super(); }

	public Lifecycle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Contributor> getContributors()
	{
		return contributors;
	}

  // lazy evaluation:
  public List<Contributor> contributors()
  {
    if (contributors == null)
      contributors = new ArrayList<Contributor>();
    return contributors;
  }

  // addTo:
  public void addToContributors(Contributor element)
  {
    contributors().add(element);
  }

  // size:
  public int contributorsSize()
  {
    return contributors == null ? 0 : contributors.size();
  }

	public void setContributors(List<Contributor> contributors)
	{
		this.contributors = contributors;
	}
}
