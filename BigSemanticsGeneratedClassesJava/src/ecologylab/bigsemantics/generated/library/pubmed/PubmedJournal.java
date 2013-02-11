package ecologylab.bigsemantics.generated.library.pubmed;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.Periodical;
import ecologylab.bigsemantics.generated.library.pubmed.PubmedArticle;
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
public class PubmedJournal extends Periodical
{
	@simpl_collection("pubmed_article")
	@mm_name("articles")
	private List<PubmedArticle> articles;

	public PubmedJournal()
	{ super(); }

	public PubmedJournal(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<PubmedArticle> getArticles()
	{
		return articles;
	}

  // lazy evaluation:
  public List<PubmedArticle> articles()
  {
    if (articles == null)
      articles = new ArrayList<PubmedArticle>();
    return articles;
  }

  // addTo:
  public void addToArticles(PubmedArticle element)
  {
    articles().add(element);
  }

  // size:
  public int articlesSize()
  {
    return articles == null ? 0 : articles.size();
  }

	public void setArticles(List<PubmedArticle> articles)
	{
		this.articles = articles;
	}
}
