package ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2016) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.CitationInfo;
import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.ScholarlyArticle;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

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
	{ super(); }

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
