package ecologylab.semantics.generated.library.products;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/12/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.Document;
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
public class BestsellerList extends Document
{
	@simpl_scalar
	private MetadataString rank;

	public BestsellerList()
	{ }

	public BestsellerList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	rank()
	{
		MetadataString	result = this.rank;
		if (result == null)
		{
			result = new MetadataString();
			this.rank = result;
		}
		return result;
	}

	public String getRank()
	{
		return this.rank == null ? null : rank().getValue();
	}

	public MetadataString getRankMetadata()
	{
		return rank;
	}

	public void setRank(String rank)
	{
		if (rank != null)
			this.rank().setValue(rank);
	}

	public void setRankMetadata(MetadataString rank)
	{
		this.rank = rank;
	}
}
