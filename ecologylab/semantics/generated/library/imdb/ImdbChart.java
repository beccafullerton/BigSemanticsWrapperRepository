package ecologylab.semantics.generated.library.imdb;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.generated.library.imdb.ImdbTitle;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  ImdbChart.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * IMDB chart
 */ 
@simpl_inherit
public class ImdbChart extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("imdb_title") @mm_name("results")	private List<ImdbTitle> results;

	public ImdbChart()
	{ }

	public ImdbChart(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<ImdbTitle> getResults()
	{
		return results;
	}

	public void setResults(List<ImdbTitle> results)
	{
		this.results = results;
	}
}
