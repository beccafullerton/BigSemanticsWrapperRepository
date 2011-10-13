package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/12/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.ImageInSearchResult;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;

/** 
 *Bing image search result.
 */ 
@simpl_inherit
public class BingImageSearchResult extends ImageInSearchResult
{
	@simpl_composite
	@simpl_tag("mms:Thumbnail")
	@mm_name("thumbnail")
	private ImageInSearchResult thumbnail;

	public BingImageSearchResult()
	{ }

	public BingImageSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ImageInSearchResult getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(ImageInSearchResult thumbnail)
	{
		this.thumbnail = thumbnail;
	}
}
