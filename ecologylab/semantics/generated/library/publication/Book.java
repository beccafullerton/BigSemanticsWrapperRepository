package ecologylab.semantics.generated.library.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/26/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.semantics.generated.library.publication.Publication;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

@simpl_inherit
public class Book extends Publication
{
	@simpl_collection("author")
	@mm_name("editors")
	private List<Author> editors;

	@simpl_scalar
	private MetadataString edition;

	@simpl_collection("publication")
	@mm_name("table_of_contents")
	private List<Publication> tableOfContents;

	@simpl_scalar
	private MetadataParsedURL coverImage;

	public Book()
	{ }

	public Book(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Author> getEditors()
	{
		return editors;
	}

	public void setEditors(List<Author> editors)
	{
		this.editors = editors;
	}

	public MetadataString	edition()
	{
		MetadataString	result = this.edition;
		if (result == null)
		{
			result = new MetadataString();
			this.edition = result;
		}
		return result;
	}

	public String getEdition()
	{
		return this.edition == null ? null : edition().getValue();
	}

	public MetadataString getEditionMetadata()
	{
		return edition;
	}

	public void setEdition(String edition)
	{
		if (edition != null)
			this.edition().setValue(edition);
	}

	public void setEditionMetadata(MetadataString edition)
	{
		this.edition = edition;
	}

	public List<Publication> getTableOfContents()
	{
		return tableOfContents;
	}

	public void setTableOfContents(List<Publication> tableOfContents)
	{
		this.tableOfContents = tableOfContents;
	}

	public MetadataParsedURL	coverImage()
	{
		MetadataParsedURL	result = this.coverImage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.coverImage = result;
		}
		return result;
	}

	public ParsedURL getCoverImage()
	{
		return this.coverImage == null ? null : coverImage().getValue();
	}

	public MetadataParsedURL getCoverImageMetadata()
	{
		return coverImage;
	}

	public void setCoverImage(ParsedURL coverImage)
	{
		if (coverImage != null)
			this.coverImage().setValue(coverImage);
	}

	public void setCoverImageMetadata(MetadataParsedURL coverImage)
	{
		this.coverImage = coverImage;
	}
}
