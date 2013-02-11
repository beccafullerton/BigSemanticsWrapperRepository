package ecologylab.bigsemantics.generated.library.nsdl;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.nsdl.SearchResults;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;
import java.util.Map;

@simpl_inherit
@simpl_tag("NSDLSearchService")
public class NsdlService extends Metadata
{
	@simpl_composite
	@simpl_tag("SearchResults")
	@mm_name("search_results")
	private SearchResults searchResults;

	public NsdlService()
	{ super(); }

	public NsdlService(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchResults getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(SearchResults searchResults)
	{
		this.searchResults = searchResults;
	}
}
