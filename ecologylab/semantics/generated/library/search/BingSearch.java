package ecologylab.semantics.generated.library.search;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.library.search.BingSearchImageSection;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.search.BingSearchWebSection;

/**
*  BingSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_tag("SearchResponse")
public class BingSearch extends CompoundDocument
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("web:Web") @mm_name("web_section")	private BingSearchWebSection webSection;

	/** 
	 */ 
	@simpl_composite	@xml_tag("mms:Image") @mm_name("image_section")	private BingSearchImageSection imageSection;

	public BingSearch()
	{ }

	public BingSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public BingSearchWebSection getWebSection()
	{
		return webSection;
	}

	public void setWebSection(BingSearchWebSection webSection)
	{
		this.webSection = webSection;
	}

	public BingSearchImageSection getImageSection()
	{
		return imageSection;
	}

	public void setImageSection(BingSearchImageSection imageSection)
	{
		this.imageSection = imageSection;
	}
}
