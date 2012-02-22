package ecologylab.semantics.generated.library.opml;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.opml.Outline;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Body extends Metadata
{
	@simpl_collection("outline")
	@simpl_nowrap
	@mm_name("outline")
	private List<Outline> outline;

	public Body()
	{ super(); }

	public Body(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Outline> getOutline()
	{
		return outline;
	}

	public void setOutline(List<Outline> outline)
	{
		this.outline = outline;
	}
}