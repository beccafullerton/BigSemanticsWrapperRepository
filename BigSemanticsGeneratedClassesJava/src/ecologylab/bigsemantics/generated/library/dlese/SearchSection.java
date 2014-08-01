package ecologylab.bigsemantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.dlese.DleseRecord1;
import ecologylab.bigsemantics.generated.library.dlese.ResultInfo;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
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
public class SearchSection extends Metadata
{
	@simpl_composite
	@mm_name("result_info")
	private ResultInfo resultInfo;

	@simpl_collection("dlese_record1")
	@mm_name("search_results")
	private List<DleseRecord1> searchResults;

	public SearchSection()
	{ super(); }

	public SearchSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ResultInfo getResultInfo()
	{
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo)
	{
		this.resultInfo = resultInfo;
	}

	public List<DleseRecord1> getSearchResults()
	{
		return searchResults;
	}

  // lazy evaluation:
  public List<DleseRecord1> searchResults()
  {
    if (searchResults == null)
      searchResults = new ArrayList<DleseRecord1>();
    return searchResults;
  }

  // addTo:
  public void addToSearchResults(DleseRecord1 element)
  {
    searchResults().add(element);
  }

  // size:
  public int searchResultsSize()
  {
    return searchResults == null ? 0 : searchResults.size();
  }

	public void setSearchResults(List<DleseRecord1> searchResults)
	{
		this.searchResults = searchResults;
	}
}
