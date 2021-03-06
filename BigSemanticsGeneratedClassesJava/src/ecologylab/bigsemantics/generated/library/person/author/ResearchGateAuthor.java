package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.ResearchGateInstitution;
import ecologylab.bigsemantics.generated.library.ResearchGateInstitutionDepartment;
import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.ResearchGateArticle;
import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.ResearchGateStats;
import ecologylab.bigsemantics.generated.library.person.author.ResearchGateAuthor;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ResearchGateAuthor extends Author
{
	@simpl_composite
	@mm_name("insitution")
	private ResearchGateInstitution insitution;

	@simpl_composite
	@mm_name("department")
	private ResearchGateInstitutionDepartment department;

	@simpl_composite
	@mm_name("stats")
	private ResearchGateStats stats;

	@simpl_collection("research_gate_article")
	@mm_name("featured_publications")
	private List<ResearchGateArticle> featuredPublications;

	@simpl_collection("research_gate_author")
	@mm_name("top_coauthors")
	private List<ResearchGateAuthor> topCoauthors;

	@simpl_collection("skill")
	@mm_name("skills")
	private List<MetadataString> skills;

	public ResearchGateAuthor()
	{ super(); }

	public ResearchGateAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ResearchGateInstitution getInsitution()
	{
		return insitution;
	}

	public void setInsitution(ResearchGateInstitution insitution)
	{
		this.insitution = insitution;
	}

	public ResearchGateInstitutionDepartment getDepartment()
	{
		return department;
	}

	public void setDepartment(ResearchGateInstitutionDepartment department)
	{
		this.department = department;
	}

	public ResearchGateStats getStats()
	{
		return stats;
	}

	public void setStats(ResearchGateStats stats)
	{
		this.stats = stats;
	}

	public List<ResearchGateArticle> getFeaturedPublications()
	{
		return featuredPublications;
	}

  // lazy evaluation:
  public List<ResearchGateArticle> featuredPublications()
  {
    if (featuredPublications == null)
      featuredPublications = new ArrayList<ResearchGateArticle>();
    return featuredPublications;
  }

  // addTo:
  public void addToFeaturedPublications(ResearchGateArticle element)
  {
    featuredPublications().add(element);
  }

  // size:
  public int featuredPublicationsSize()
  {
    return featuredPublications == null ? 0 : featuredPublications.size();
  }

	public void setFeaturedPublications(List<ResearchGateArticle> featuredPublications)
	{
		this.featuredPublications = featuredPublications;
	}

	public List<ResearchGateAuthor> getTopCoauthors()
	{
		return topCoauthors;
	}

  // lazy evaluation:
  public List<ResearchGateAuthor> topCoauthors()
  {
    if (topCoauthors == null)
      topCoauthors = new ArrayList<ResearchGateAuthor>();
    return topCoauthors;
  }

  // addTo:
  public void addToTopCoauthors(ResearchGateAuthor element)
  {
    topCoauthors().add(element);
  }

  // size:
  public int topCoauthorsSize()
  {
    return topCoauthors == null ? 0 : topCoauthors.size();
  }

	public void setTopCoauthors(List<ResearchGateAuthor> topCoauthors)
	{
		this.topCoauthors = topCoauthors;
	}

	public List<MetadataString> getSkills()
	{
		return skills;
	}

  // lazy evaluation:
  public List<MetadataString> skills()
  {
    if (skills == null)
      skills = new ArrayList<MetadataString>();
    return skills;
  }

  // addTo:
  public void addToSkills(MetadataString element)
  {
    skills().add(element);
  }

  // size:
  public int skillsSize()
  {
    return skills == null ? 0 : skills.size();
  }

	public void setSkills(List<MetadataString> skills)
	{
		this.skills = skills;
	}
}
