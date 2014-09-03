package ecologylab.bigsemantics.generated.library.comment;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.person.Person;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Comment extends RichDocument
{
	@simpl_composite
	@mm_name("author")
	private Person author;

	/** 
	 *How long this comment has been there.
	 */ 
	@simpl_scalar
	private MetadataString time;

	/** 
	 *How many votes this comment has got.
	 */ 
	@simpl_scalar
	private MetadataInteger count;

	public Comment()
	{ super(); }

	public Comment(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Person getAuthor()
	{
		return author;
	}

	public void setAuthor(Person author)
	{
		this.author = author;
	}

	public MetadataString	time()
	{
		MetadataString	result = this.time;
		if (result == null)
		{
			result = new MetadataString();
			this.time = result;
		}
		return result;
	}

	public String getTime()
	{
		return this.time == null ? null : time().getValue();
	}

	public MetadataString getTimeMetadata()
	{
		return time;
	}

	public void setTime(String time)
	{
		if (time != null)
			this.time().setValue(time);
	}

	public void setTimeMetadata(MetadataString time)
	{
		this.time = time;
	}

	public MetadataInteger	count()
	{
		MetadataInteger	result = this.count;
		if (result == null)
		{
			result = new MetadataInteger();
			this.count = result;
		}
		return result;
	}

	public Integer getCount()
	{
		return this.count == null ? 0 : count().getValue();
	}

	public MetadataInteger getCountMetadata()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		if (count != 0)
			this.count().setValue(count);
	}

	public void setCountMetadata(MetadataInteger count)
	{
		this.count = count;
	}
}
