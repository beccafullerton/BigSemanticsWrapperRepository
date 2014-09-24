package ecologylab.bigsemantics.generated.library.comment;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.comment.Comment;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Rating extends Comment
{
	@simpl_scalar
	private MetadataString rating;

	public Rating()
	{ super(); }

	public Rating(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	rating()
	{
		MetadataString	result = this.rating;
		if (result == null)
		{
			result = new MetadataString();
			this.rating = result;
		}
		return result;
	}

	public String getRating()
	{
		return this.rating == null ? null : rating().getValue();
	}

	public MetadataString getRatingMetadata()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		if (rating != null)
			this.rating().setValue(rating);
	}

	public void setRatingMetadata(MetadataString rating)
	{
		this.rating = rating;
	}
}