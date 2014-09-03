package ecologylab.bigsemantics.generated.library.gettyExploration;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.gettyCollection.GettyCollection;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GettyExploration extends RichDocument
{
	@simpl_collection("getty_collection")
	@mm_name("collections")
	private List<GettyCollection> collections;

	public GettyExploration()
	{ super(); }

	public GettyExploration(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GettyCollection> getCollections()
	{
		return collections;
	}

  // lazy evaluation:
  public List<GettyCollection> collections()
  {
    if (collections == null)
      collections = new ArrayList<GettyCollection>();
    return collections;
  }

  // addTo:
  public void addToCollections(GettyCollection element)
  {
    collections().add(element);
  }

  // size:
  public int collectionsSize()
  {
    return collections == null ? 0 : collections.size();
  }

	public void setCollections(List<GettyCollection> collections)
	{
		this.collections = collections;
	}
}
