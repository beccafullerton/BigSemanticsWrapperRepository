package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.LeagueAbility;
import ecologylab.bigsemantics.generated.library.creativeWork.LeagueRelationshipList;
import ecologylab.bigsemantics.generated.library.creativeWork.YoutubeVideo;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class LeagueChampion extends CreativeWork
{
	@simpl_scalar
	private MetadataString epithet;

	@simpl_collection("league_ability")
	@mm_name("abilites")
	private List<LeagueAbility> abilites;

	@simpl_collection("league_relationship_list")
	@mm_name("relationships")
	private List<LeagueRelationshipList> relationships;

	@simpl_composite
	@mm_name("champion_spotlight")
	private YoutubeVideo championSpotlight;

	public LeagueChampion()
	{ super(); }

	public LeagueChampion(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	epithet()
	{
		MetadataString	result = this.epithet;
		if (result == null)
		{
			result = new MetadataString();
			this.epithet = result;
		}
		return result;
	}

	public String getEpithet()
	{
		return this.epithet == null ? null : epithet().getValue();
	}

	public MetadataString getEpithetMetadata()
	{
		return epithet;
	}

	public void setEpithet(String epithet)
	{
		if (epithet != null)
			this.epithet().setValue(epithet);
	}

	public void setEpithetMetadata(MetadataString epithet)
	{
		this.epithet = epithet;
	}

	public List<LeagueAbility> getAbilites()
	{
		return abilites;
	}

  // lazy evaluation:
  public List<LeagueAbility> abilites()
  {
    if (abilites == null)
      abilites = new ArrayList<LeagueAbility>();
    return abilites;
  }

  // addTo:
  public void addToAbilites(LeagueAbility element)
  {
    abilites().add(element);
  }

  // size:
  public int abilitesSize()
  {
    return abilites == null ? 0 : abilites.size();
  }

	public void setAbilites(List<LeagueAbility> abilites)
	{
		this.abilites = abilites;
	}

	public List<LeagueRelationshipList> getRelationships()
	{
		return relationships;
	}

  // lazy evaluation:
  public List<LeagueRelationshipList> relationships()
  {
    if (relationships == null)
      relationships = new ArrayList<LeagueRelationshipList>();
    return relationships;
  }

  // addTo:
  public void addToRelationships(LeagueRelationshipList element)
  {
    relationships().add(element);
  }

  // size:
  public int relationshipsSize()
  {
    return relationships == null ? 0 : relationships.size();
  }

	public void setRelationships(List<LeagueRelationshipList> relationships)
	{
		this.relationships = relationships;
	}

	public YoutubeVideo getChampionSpotlight()
	{
		return championSpotlight;
	}

	public void setChampionSpotlight(YoutubeVideo championSpotlight)
	{
		this.championSpotlight = championSpotlight;
	}
}
