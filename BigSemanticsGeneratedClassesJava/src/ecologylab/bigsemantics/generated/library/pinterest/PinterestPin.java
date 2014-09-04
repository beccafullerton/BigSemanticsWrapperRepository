package ecologylab.bigsemantics.generated.library.pinterest;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.CreativeWork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class PinterestPin extends CreativeWork
{
	@simpl_composite
	@mm_name("pinboard")
	private RichDocument pinboard;

	@simpl_composite
	@mm_name("pinner")
	private RichDocument pinner;

	@simpl_composite
	@mm_name("repins")
	private RichDocument repins;

	@simpl_composite
	@mm_name("likes")
	private RichDocument likes;

	@simpl_composite
	@mm_name("repinned_from_pinner")
	private RichDocument repinnedFromPinner;

	@simpl_composite
	@mm_name("repinned_from_pinboard")
	private RichDocument repinnedFromPinboard;

	@simpl_composite
	@mm_name("original_pinner")
	private RichDocument originalPinner;

	@simpl_composite
	@mm_name("original_pinboard")
	private RichDocument originalPinboard;

	@simpl_composite
	@mm_name("originally_from")
	private RichDocument originallyFrom;

	public PinterestPin()
	{ super(); }

	public PinterestPin(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public RichDocument getPinboard()
	{
		return pinboard;
	}

	public void setPinboard(RichDocument pinboard)
	{
		this.pinboard = pinboard;
	}

	public RichDocument getPinner()
	{
		return pinner;
	}

	public void setPinner(RichDocument pinner)
	{
		this.pinner = pinner;
	}

	public RichDocument getRepins()
	{
		return repins;
	}

	public void setRepins(RichDocument repins)
	{
		this.repins = repins;
	}

	public RichDocument getLikes()
	{
		return likes;
	}

	public void setLikes(RichDocument likes)
	{
		this.likes = likes;
	}

	public RichDocument getRepinnedFromPinner()
	{
		return repinnedFromPinner;
	}

	public void setRepinnedFromPinner(RichDocument repinnedFromPinner)
	{
		this.repinnedFromPinner = repinnedFromPinner;
	}

	public RichDocument getRepinnedFromPinboard()
	{
		return repinnedFromPinboard;
	}

	public void setRepinnedFromPinboard(RichDocument repinnedFromPinboard)
	{
		this.repinnedFromPinboard = repinnedFromPinboard;
	}

	public RichDocument getOriginalPinner()
	{
		return originalPinner;
	}

	public void setOriginalPinner(RichDocument originalPinner)
	{
		this.originalPinner = originalPinner;
	}

	public RichDocument getOriginalPinboard()
	{
		return originalPinboard;
	}

	public void setOriginalPinboard(RichDocument originalPinboard)
	{
		this.originalPinboard = originalPinboard;
	}

	public RichDocument getOriginallyFrom()
	{
		return originallyFrom;
	}

	public void setOriginallyFrom(RichDocument originallyFrom)
	{
		this.originallyFrom = originallyFrom;
	}
}
