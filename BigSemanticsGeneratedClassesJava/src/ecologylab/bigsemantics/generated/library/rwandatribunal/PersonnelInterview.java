package ecologylab.bigsemantics.generated.library.rwandatribunal;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.rwandatribunal.VideoInterview;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *personnel interview
 */ 
@simpl_inherit
public class PersonnelInterview extends Document
{
	@simpl_scalar
	private MetadataString role;

	@simpl_scalar
	private MetadataParsedURL image;

	@simpl_collection("video_interview")
	@mm_name("speaks_on")
	private List<VideoInterview> speaksOn;

	@simpl_collection("video_interview")
	@mm_name("interview_segments")
	private List<VideoInterview> interviewSegments;

	public PersonnelInterview()
	{ super(); }

	public PersonnelInterview(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	role()
	{
		MetadataString	result = this.role;
		if (result == null)
		{
			result = new MetadataString();
			this.role = result;
		}
		return result;
	}

	public String getRole()
	{
		return this.role == null ? null : role().getValue();
	}

	public MetadataString getRoleMetadata()
	{
		return role;
	}

	public void setRole(String role)
	{
		if (role != null)
			this.role().setValue(role);
	}

	public void setRoleMetadata(MetadataString role)
	{
		this.role = role;
	}

	public MetadataParsedURL	image()
	{
		MetadataParsedURL	result = this.image;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.image = result;
		}
		return result;
	}

	public ParsedURL getImage()
	{
		return this.image == null ? null : image().getValue();
	}

	public MetadataParsedURL getImageMetadata()
	{
		return image;
	}

	public void setImage(ParsedURL image)
	{
		if (image != null)
			this.image().setValue(image);
	}

	public void setImageMetadata(MetadataParsedURL image)
	{
		this.image = image;
	}

	public List<VideoInterview> getSpeaksOn()
	{
		return speaksOn;
	}

  // lazy evaluation:
  public List<VideoInterview> speaksOn()
  {
    if (speaksOn == null)
      speaksOn = new ArrayList<VideoInterview>();
    return speaksOn;
  }

  // addTo:
  public void addToSpeaksOn(VideoInterview element)
  {
    speaksOn().add(element);
  }

  // size:
  public int speaksOnSize()
  {
    return speaksOn == null ? 0 : speaksOn.size();
  }

	public void setSpeaksOn(List<VideoInterview> speaksOn)
	{
		this.speaksOn = speaksOn;
	}

	public List<VideoInterview> getInterviewSegments()
	{
		return interviewSegments;
	}

  // lazy evaluation:
  public List<VideoInterview> interviewSegments()
  {
    if (interviewSegments == null)
      interviewSegments = new ArrayList<VideoInterview>();
    return interviewSegments;
  }

  // addTo:
  public void addToInterviewSegments(VideoInterview element)
  {
    interviewSegments().add(element);
  }

  // size:
  public int interviewSegmentsSize()
  {
    return interviewSegments == null ? 0 : interviewSegments.size();
  }

	public void setInterviewSegments(List<VideoInterview> interviewSegments)
	{
		this.interviewSegments = interviewSegments;
	}
}
