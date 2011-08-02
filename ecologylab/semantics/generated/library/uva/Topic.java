package ecologylab.semantics.generated.library.uva;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Topic.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * For Collabartion with UVA's Cluster formation project.
 */ 
@simpl_inherit
public class Topic extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataStringBuilder contentKeywords;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataStringBuilder anchorKeywords;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataStringBuilder urlKeywords;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataStringBuilder titleKeywords;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger id;

	public Topic()
	{ }

	public Topic(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder	contentKeywords()
	{
		ecologylab.semantics.metadata.scalar.MetadataStringBuilder	result = this.contentKeywords;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataStringBuilder();
			this.contentKeywords = result;
		}
		return result;
	}

	public java.lang.StringBuilder getContentKeywords()
	{
		return this.contentKeywords == null ? null : contentKeywords().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder getContentKeywordsMetadata()
	{
		return contentKeywords;
	}

	public void setContentKeywords(java.lang.StringBuilder contentKeywords)
	{
		if (contentKeywords != null)
			this.contentKeywords().setValue(contentKeywords);
	}

	public void setContentKeywordsMetadata(ecologylab.semantics.metadata.scalar.MetadataStringBuilder contentKeywords)
	{
		this.contentKeywords = contentKeywords;
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder	anchorKeywords()
	{
		ecologylab.semantics.metadata.scalar.MetadataStringBuilder	result = this.anchorKeywords;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataStringBuilder();
			this.anchorKeywords = result;
		}
		return result;
	}

	public java.lang.StringBuilder getAnchorKeywords()
	{
		return this.anchorKeywords == null ? null : anchorKeywords().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder getAnchorKeywordsMetadata()
	{
		return anchorKeywords;
	}

	public void setAnchorKeywords(java.lang.StringBuilder anchorKeywords)
	{
		if (anchorKeywords != null)
			this.anchorKeywords().setValue(anchorKeywords);
	}

	public void setAnchorKeywordsMetadata(ecologylab.semantics.metadata.scalar.MetadataStringBuilder anchorKeywords)
	{
		this.anchorKeywords = anchorKeywords;
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder	urlKeywords()
	{
		ecologylab.semantics.metadata.scalar.MetadataStringBuilder	result = this.urlKeywords;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataStringBuilder();
			this.urlKeywords = result;
		}
		return result;
	}

	public java.lang.StringBuilder getUrlKeywords()
	{
		return this.urlKeywords == null ? null : urlKeywords().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder getUrlKeywordsMetadata()
	{
		return urlKeywords;
	}

	public void setUrlKeywords(java.lang.StringBuilder urlKeywords)
	{
		if (urlKeywords != null)
			this.urlKeywords().setValue(urlKeywords);
	}

	public void setUrlKeywordsMetadata(ecologylab.semantics.metadata.scalar.MetadataStringBuilder urlKeywords)
	{
		this.urlKeywords = urlKeywords;
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder	titleKeywords()
	{
		ecologylab.semantics.metadata.scalar.MetadataStringBuilder	result = this.titleKeywords;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataStringBuilder();
			this.titleKeywords = result;
		}
		return result;
	}

	public java.lang.StringBuilder getTitleKeywords()
	{
		return this.titleKeywords == null ? null : titleKeywords().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataStringBuilder getTitleKeywordsMetadata()
	{
		return titleKeywords;
	}

	public void setTitleKeywords(java.lang.StringBuilder titleKeywords)
	{
		if (titleKeywords != null)
			this.titleKeywords().setValue(titleKeywords);
	}

	public void setTitleKeywordsMetadata(ecologylab.semantics.metadata.scalar.MetadataStringBuilder titleKeywords)
	{
		this.titleKeywords = titleKeywords;
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger	id()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public java.lang.Integer getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(java.lang.Integer id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger id)
	{
		this.id = id;
	}
}
