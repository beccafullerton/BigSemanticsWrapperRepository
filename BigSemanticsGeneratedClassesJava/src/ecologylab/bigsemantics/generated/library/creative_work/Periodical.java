package ecologylab.bigsemantics.generated.library.creative_work;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.BasicPublication;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataDate;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *An issue of a periodical.
 */ 
@simpl_inherit
public class Periodical extends BasicPublication
{
	/** 
	 *All the issues of a periodical.
	 */ 
	@simpl_composite
	@mm_name("archive")
	private Document archive;

	@simpl_scalar
	private MetadataString volumeAndIssue;

	/** 
	 *Publication Date
	 */ 
	@simpl_scalar
	private MetadataDate date;

	public Periodical()
	{ super(); }

	public Periodical(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Document getArchive()
	{
		return archive;
	}

	public void setArchive(Document archive)
	{
		this.archive = archive;
	}

	public MetadataString	volumeAndIssue()
	{
		MetadataString	result = this.volumeAndIssue;
		if (result == null)
		{
			result = new MetadataString();
			this.volumeAndIssue = result;
		}
		return result;
	}

	public String getVolumeAndIssue()
	{
		return this.volumeAndIssue == null ? null : volumeAndIssue().getValue();
	}

	public MetadataString getVolumeAndIssueMetadata()
	{
		return volumeAndIssue;
	}

	public void setVolumeAndIssue(String volumeAndIssue)
	{
		if (volumeAndIssue != null)
			this.volumeAndIssue().setValue(volumeAndIssue);
	}

	public void setVolumeAndIssueMetadata(MetadataString volumeAndIssue)
	{
		this.volumeAndIssue = volumeAndIssue;
	}

	public MetadataDate	date()
	{
		MetadataDate	result = this.date;
		if (result == null)
		{
			result = new MetadataDate();
			this.date = result;
		}
		return result;
	}

	public Date getDate()
	{
		return this.date == null ? null : date().getValue();
	}

	public MetadataDate getDateMetadata()
	{
		return date;
	}

	public void setDate(Date date)
	{
		if (date != null)
			this.date().setValue(date);
	}

	public void setDateMetadata(MetadataDate date)
	{
		this.date = date;
	}
}
