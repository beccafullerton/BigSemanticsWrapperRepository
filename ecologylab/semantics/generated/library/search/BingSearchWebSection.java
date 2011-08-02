package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.search.BingWebSearchResult;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  BingSearchWebSection.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class BingSearchWebSection extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("web:WebResult")	@xml_tag("web:Results") @mm_name("web_search_results")	private List<BingWebSearchResult> webSearchResults;

	public BingSearchWebSection()
	{ }

	public BingSearchWebSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<BingWebSearchResult> getWebSearchResults()
	{
		return webSearchResults;
	}

	public void setWebSearchResults(List<BingWebSearchResult> webSearchResults)
	{
		this.webSearchResults = webSearchResults;
	}
}
