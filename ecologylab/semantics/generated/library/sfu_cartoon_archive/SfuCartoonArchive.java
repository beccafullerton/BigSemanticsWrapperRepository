package ecologylab.semantics.generated.library.sfu_cartoon_archive;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.Date;
import java.util.List;

/** 
 *This MMD was initially generated by the browser authoring tool
 */ 
@simpl_inherit
public class SfuCartoonArchive extends Document
{
	@simpl_scalar
	private MetadataString text;

	@simpl_scalar
	private MetadataString cartoonist;

	@simpl_scalar
	private MetadataDate datePublished;

	@simpl_scalar
	private MetadataString publishedIn;

	@simpl_scalar
	private MetadataString cartoonSize;

	@simpl_scalar
	private MetadataString notes;

	@simpl_scalar
	private MetadataString sfuReferenceCode;

	public SfuCartoonArchive()
	{ }

	public SfuCartoonArchive(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	text()
	{
		MetadataString	result = this.text;
		if (result == null)
		{
			result = new MetadataString();
			this.text = result;
		}
		return result;
	}

	public String getText()
	{
		return this.text == null ? null : text().getValue();
	}

	public MetadataString getTextMetadata()
	{
		return text;
	}

	public void setText(String text)
	{
		if (text != null)
			this.text().setValue(text);
	}

	public void setTextMetadata(MetadataString text)
	{
		this.text = text;
	}

	public MetadataString	cartoonist()
	{
		MetadataString	result = this.cartoonist;
		if (result == null)
		{
			result = new MetadataString();
			this.cartoonist = result;
		}
		return result;
	}

	public String getCartoonist()
	{
		return this.cartoonist == null ? null : cartoonist().getValue();
	}

	public MetadataString getCartoonistMetadata()
	{
		return cartoonist;
	}

	public void setCartoonist(String cartoonist)
	{
		if (cartoonist != null)
			this.cartoonist().setValue(cartoonist);
	}

	public void setCartoonistMetadata(MetadataString cartoonist)
	{
		this.cartoonist = cartoonist;
	}

	public MetadataDate	datePublished()
	{
		MetadataDate	result = this.datePublished;
		if (result == null)
		{
			result = new MetadataDate();
			this.datePublished = result;
		}
		return result;
	}

	public Date getDatePublished()
	{
		return this.datePublished == null ? null : datePublished().getValue();
	}

	public MetadataDate getDatePublishedMetadata()
	{
		return datePublished;
	}

	public void setDatePublished(Date datePublished)
	{
		if (datePublished != null)
			this.datePublished().setValue(datePublished);
	}

	public void setDatePublishedMetadata(MetadataDate datePublished)
	{
		this.datePublished = datePublished;
	}

	public MetadataString	publishedIn()
	{
		MetadataString	result = this.publishedIn;
		if (result == null)
		{
			result = new MetadataString();
			this.publishedIn = result;
		}
		return result;
	}

	public String getPublishedIn()
	{
		return this.publishedIn == null ? null : publishedIn().getValue();
	}

	public MetadataString getPublishedInMetadata()
	{
		return publishedIn;
	}

	public void setPublishedIn(String publishedIn)
	{
		if (publishedIn != null)
			this.publishedIn().setValue(publishedIn);
	}

	public void setPublishedInMetadata(MetadataString publishedIn)
	{
		this.publishedIn = publishedIn;
	}

	public MetadataString	cartoonSize()
	{
		MetadataString	result = this.cartoonSize;
		if (result == null)
		{
			result = new MetadataString();
			this.cartoonSize = result;
		}
		return result;
	}

	public String getCartoonSize()
	{
		return this.cartoonSize == null ? null : cartoonSize().getValue();
	}

	public MetadataString getCartoonSizeMetadata()
	{
		return cartoonSize;
	}

	public void setCartoonSize(String cartoonSize)
	{
		if (cartoonSize != null)
			this.cartoonSize().setValue(cartoonSize);
	}

	public void setCartoonSizeMetadata(MetadataString cartoonSize)
	{
		this.cartoonSize = cartoonSize;
	}

	public MetadataString	notes()
	{
		MetadataString	result = this.notes;
		if (result == null)
		{
			result = new MetadataString();
			this.notes = result;
		}
		return result;
	}

	public String getNotes()
	{
		return this.notes == null ? null : notes().getValue();
	}

	public MetadataString getNotesMetadata()
	{
		return notes;
	}

	public void setNotes(String notes)
	{
		if (notes != null)
			this.notes().setValue(notes);
	}

	public void setNotesMetadata(MetadataString notes)
	{
		this.notes = notes;
	}

	public MetadataString	sfuReferenceCode()
	{
		MetadataString	result = this.sfuReferenceCode;
		if (result == null)
		{
			result = new MetadataString();
			this.sfuReferenceCode = result;
		}
		return result;
	}

	public String getSfuReferenceCode()
	{
		return this.sfuReferenceCode == null ? null : sfuReferenceCode().getValue();
	}

	public MetadataString getSfuReferenceCodeMetadata()
	{
		return sfuReferenceCode;
	}

	public void setSfuReferenceCode(String sfuReferenceCode)
	{
		if (sfuReferenceCode != null)
			this.sfuReferenceCode().setValue(sfuReferenceCode);
	}

	public void setSfuReferenceCodeMetadata(MetadataString sfuReferenceCode)
	{
		this.sfuReferenceCode = sfuReferenceCode;
	}
}
