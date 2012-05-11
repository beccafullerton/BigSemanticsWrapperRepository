package ecologylab.semantics.generated.library.scholarlyPublication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.Periodical;
import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AcmPortalPeriodical extends Periodical
{
	@simpl_collection("scholarly_article")
	@mm_name("articles")
	private List<ScholarlyArticle> articles;

	public AcmPortalPeriodical()
	{ super(); }

	public AcmPortalPeriodical(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<ScholarlyArticle> getArticles()
	{
		return articles;
	}

  // lazy evaluation:
  public List<ScholarlyArticle> articles()
  {
    if (articles == null)
      articles = new ArrayList<ScholarlyArticle>();
    return articles;
  }

  // addTo:
  public void addToArticles(ScholarlyArticle element)
  {
    articles().add(element);
  }

  // size:
  public int articlesSize()
  {
    return articles == null ? 0 : articles.size();
  }

	public void setArticles(List<ScholarlyArticle> articles)
	{
		this.articles = articles;
	}
}