package ecologylab.bigsemantics.generated.library.leagueoflegends;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.leagueoflegends.LeagueChampion;
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
public class LeagueRelationshipList extends RichDocument
{
	@simpl_collection("league_champion")
	@mm_name("champions")
	private List<LeagueChampion> champions;

	public LeagueRelationshipList()
	{ super(); }

	public LeagueRelationshipList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<LeagueChampion> getChampions()
	{
		return champions;
	}

  // lazy evaluation:
  public List<LeagueChampion> champions()
  {
    if (champions == null)
      champions = new ArrayList<LeagueChampion>();
    return champions;
  }

  // addTo:
  public void addToChampions(LeagueChampion element)
  {
    champions().add(element);
  }

  // size:
  public int championsSize()
  {
    return champions == null ? 0 : champions.size();
  }

	public void setChampions(List<LeagueChampion> champions)
	{
		this.champions = champions;
	}
}
