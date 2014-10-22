package ecologylab.bigsemantics.generated.library.creativeWork.blogPost;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataDate;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Post extends CreativeWork
{
	@simpl_scalar
	private MetadataDate postDate;

	@simpl_collection("document")
	@mm_name("tags")
	private List<Document> tags;

	public Post()
	{ super(); }

	public Post(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDate	postDate()
	{
		MetadataDate	result = this.postDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.postDate = result;
		}
		return result;
	}

	public Date getPostDate()
	{
		return this.postDate == null ? null : postDate().getValue();
	}

	public MetadataDate getPostDateMetadata()
	{
		return postDate;
	}

	public void setPostDate(Date postDate)
	{
		if (postDate != null)
			this.postDate().setValue(postDate);
	}

	public void setPostDateMetadata(MetadataDate postDate)
	{
		this.postDate = postDate;
	}

	public List<Document> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<Document> tags()
  {
    if (tags == null)
      tags = new ArrayList<Document>();
    return tags;
  }

  // addTo:
  public void addToTags(Document element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<Document> tags)
	{
		this.tags = tags;
	}
}
