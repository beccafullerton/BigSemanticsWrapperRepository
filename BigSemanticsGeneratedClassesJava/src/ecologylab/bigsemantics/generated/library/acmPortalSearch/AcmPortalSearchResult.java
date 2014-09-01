package ecologylab.bigsemantics.generated.library.acmPortalSearch;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AcmPortalSearchResult extends RichDocument
{
	@simpl_scalar
	private MetadataString authorList;

	@simpl_scalar
	private MetadataString source;

	@simpl_scalar
	private MetadataString bibliometrics;

	public AcmPortalSearchResult()
	{ super(); }

	public AcmPortalSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	authorList()
	{
		MetadataString	result = this.authorList;
		if (result == null)
		{
			result = new MetadataString();
			this.authorList = result;
		}
		return result;
	}

	public String getAuthorList()
	{
		return this.authorList == null ? null : authorList().getValue();
	}

	public MetadataString getAuthorListMetadata()
	{
		return authorList;
	}

	public void setAuthorList(String authorList)
	{
		if (authorList != null)
			this.authorList().setValue(authorList);
	}

	public void setAuthorListMetadata(MetadataString authorList)
	{
		this.authorList = authorList;
	}

	public MetadataString	source()
	{
		MetadataString	result = this.source;
		if (result == null)
		{
			result = new MetadataString();
			this.source = result;
		}
		return result;
	}

	public String getSource()
	{
		return this.source == null ? null : source().getValue();
	}

	public MetadataString getSourceMetadata()
	{
		return source;
	}

	public void setSource(String source)
	{
		if (source != null)
			this.source().setValue(source);
	}

	public void setSourceMetadata(MetadataString source)
	{
		this.source = source;
	}

	public MetadataString	bibliometrics()
	{
		MetadataString	result = this.bibliometrics;
		if (result == null)
		{
			result = new MetadataString();
			this.bibliometrics = result;
		}
		return result;
	}

	public String getBibliometrics()
	{
		return this.bibliometrics == null ? null : bibliometrics().getValue();
	}

	public MetadataString getBibliometricsMetadata()
	{
		return bibliometrics;
	}

	public void setBibliometrics(String bibliometrics)
	{
		if (bibliometrics != null)
			this.bibliometrics().setValue(bibliometrics);
	}

	public void setBibliometricsMetadata(MetadataString bibliometrics)
	{
		this.bibliometrics = bibliometrics;
	}
}
