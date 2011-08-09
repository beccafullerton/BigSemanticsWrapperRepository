package ecologylab.semantics.generated.library;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Tumblr.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Tumblr blog class
 */ 
@simpl_inherit
public class Tumblr extends CompoundDocument
{
	/** 
	 * Phone number of the restaurant
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString post;

	public Tumblr()
	{ }

	public Tumblr(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	post()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.post;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.post = result;
		}
		return result;
	}

	public java.lang.String getPost()
	{
		return this.post == null ? null : post().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPostMetadata()
	{
		return post;
	}

	public void setPost(java.lang.String post)
	{
		if (post != null)
			this.post().setValue(post);
	}

	public void setPostMetadata(ecologylab.semantics.metadata.scalar.MetadataString post)
	{
		this.post = post;
	}
}
