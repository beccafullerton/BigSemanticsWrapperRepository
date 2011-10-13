package ecologylab.semantics.generated.library.bibManaging;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/12/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.bibManaging.CitationInfo;
import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;

/** 
 *CiteSeerX record for an article.
 */ 
@simpl_inherit
public class CiteseerxRecord extends ScholarlyArticle
{
	@simpl_composite
	@mm_name("citation_info")
	private CitationInfo citationInfo;

	public CiteseerxRecord()
	{ }

	public CiteseerxRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public CitationInfo getCitationInfo()
	{
		return citationInfo;
	}

	public void setCitationInfo(CitationInfo citationInfo)
	{
		this.citationInfo = citationInfo;
	}
}
