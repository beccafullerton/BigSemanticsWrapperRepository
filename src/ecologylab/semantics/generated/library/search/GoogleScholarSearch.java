package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.GoogleScholarSearchResult;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *The google Search class
 */ 
@simpl_inherit
public class GoogleScholarSearch extends Document
{
	@simpl_collection("google_scholar_search_result")
	@simpl_nowrap
	@mm_name("search_results")
	private List<GoogleScholarSearchResult> searchResults;

	public GoogleScholarSearch()
	{ super(); }

	public GoogleScholarSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GoogleScholarSearchResult> getSearchResults()
	{
		return searchResults;
	}

  // lazy evaluation:
  public List<GoogleScholarSearchResult> searchResults()
  {
    if (searchResults == null)
      searchResults = new ArrayList<GoogleScholarSearchResult>();
    return searchResults;
  }

  // addTo:
  public void addToSearchResults(GoogleScholarSearchResult element)
  {
    searchResults().add(element);
  }

  // size:
  public int searchResultsSize()
  {
    return searchResults == null ? 0 : searchResults.size();
  }

	public void setSearchResults(List<GoogleScholarSearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}
