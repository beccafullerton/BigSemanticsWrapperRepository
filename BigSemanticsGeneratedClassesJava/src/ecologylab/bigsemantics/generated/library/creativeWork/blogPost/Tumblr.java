package ecologylab.bigsemantics.generated.library.creativeWork.blogPost;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.Post;
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
public class Tumblr extends Post
{
	@simpl_scalar
	private MetadataString post;

	public Tumblr()
	{ super(); }

	public Tumblr(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	post()
	{
		MetadataString	result = this.post;
		if (result == null)
		{
			result = new MetadataString();
			this.post = result;
		}
		return result;
	}

	public String getPost()
	{
		return this.post == null ? null : post().getValue();
	}

	public MetadataString getPostMetadata()
	{
		return post;
	}

	public void setPost(String post)
	{
		if (post != null)
			this.post().setValue(post);
	}

	public void setPostMetadata(MetadataString post)
	{
		this.post = post;
	}
}