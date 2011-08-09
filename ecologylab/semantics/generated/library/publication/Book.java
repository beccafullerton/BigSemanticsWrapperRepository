package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.publication.Author;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.publication.Publication;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Book.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Book extends Publication
{
	/** 
	 */ 
	@simpl_collection("author") @mm_name("editors")	private List<Author> editors;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString edition;

	/** 
	 */ 
	@simpl_collection("publication") @mm_name("table_of_contents")	private List<Publication> tableOfContents;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL coverImage;

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

	public ecologylab.semantics.metadata.scalar.MetadataString	edition()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.edition;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.edition = result;
		}
		return result;
	}

	public java.lang.String getEdition()
	{
		return this.edition == null ? null : edition().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getEditionMetadata()
	{
		return edition;
	}

	public void setEdition(java.lang.String edition)
	{
		if (edition != null)
			this.edition().setValue(edition);
	}

	public void setEditionMetadata(ecologylab.semantics.metadata.scalar.MetadataString edition)
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

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	coverImage()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.coverImage;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.coverImage = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getCoverImage()
	{
		return this.coverImage == null ? null : coverImage().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getCoverImageMetadata()
	{
		return coverImage;
	}

	public void setCoverImage(ecologylab.net.ParsedURL coverImage)
	{
		if (coverImage != null)
			this.coverImage().setValue(coverImage);
	}

	public void setCoverImageMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL coverImage)
	{
		this.coverImage = coverImage;
	}
}
