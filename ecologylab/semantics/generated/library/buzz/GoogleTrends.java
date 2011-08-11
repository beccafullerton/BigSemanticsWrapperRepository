package ecologylab.semantics.generated.library.buzz;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.buzz.HotSearch;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  GoogleTrends.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google trends
 */ 
@simpl_inherit
public class GoogleTrends extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("hot_search") @mm_name("hot_searches")	private List<HotSearch> hotSearches;

	public GoogleTrends()
	{ }

	public GoogleTrends(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<HotSearch> getHotSearches()
	{
		return hotSearches;
	}

	public void setHotSearches(List<HotSearch> hotSearches)
	{
		this.hotSearches = hotSearches;
	}
}
