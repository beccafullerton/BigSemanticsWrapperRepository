package ecologylab.semantics.generated.library.opml;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;

@simpl_inherit
public class Head extends Metadata
{
	@simpl_scalar
	private MetadataString title;

	public Head()
	{ }

	public Head(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}
}
