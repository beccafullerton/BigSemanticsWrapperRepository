package ecologylab.semantics.generated.library.nsdl;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.generated.library.nsdl.NsdlDocument;
import ecologylab.serialization.annotations.simpl_collection;

/**
*  SearchResults.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class SearchResults extends Metadata
{
	/** 
	 */ 
	@simpl_collection("nsdl_document")	@mm_name("results")
	private List<NsdlDocument> results;

	public SearchResults()
	{ }

	public SearchResults(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<NsdlDocument> getResults()
	{
		return results;
	}

	public void setResults(List<NsdlDocument> results)
	{
		this.results = results;
	}
}
