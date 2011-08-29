package ecologylab.semantics.generated.library.search;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.search.BingImageSearchResult;

/**
*  BingSearchImageSection.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class BingSearchImageSection extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("mms:ImageResult")	@xml_tag("mms:Results")	@mm_name("image_search_results")
	private List<BingImageSearchResult> imageSearchResults;

	public BingSearchImageSection()
	{ }

	public BingSearchImageSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<BingImageSearchResult> getImageSearchResults()
	{
		return imageSearchResults;
	}

	public void setImageSearchResults(List<BingImageSearchResult> imageSearchResults)
	{
		this.imageSearchResults = imageSearchResults;
	}
}
