package ecologylab.semantics.generated.library.scholarlyPublication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Source.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Metadata related to where an article is published.
 */ 
@simpl_inherit
public class Source extends Document
{
	/** 
	 * Same as title, but used for composite scalar
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private ecologylab.semantics.metadata.scalar.MetadataString archiveName;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger yearOfPublication;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString isbn;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString pages;

	public Source()
	{ }

	public Source(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	archiveName()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.archiveName;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.archiveName = result;
		}
		return result;
	}

	public java.lang.String getArchiveName()
	{
		return this.archiveName == null ? null : archiveName().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getArchiveNameMetadata()
	{
		return archiveName;
	}

	public void setArchiveName(java.lang.String archiveName)
	{
		if (archiveName != null)
			this.archiveName().setValue(archiveName);
	}

	public void setArchiveNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString archiveName)
	{
		this.archiveName = archiveName;
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger	yearOfPublication()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.yearOfPublication;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.yearOfPublication = result;
		}
		return result;
	}

	public java.lang.Integer getYearOfPublication()
	{
		return this.yearOfPublication == null ? 0 : yearOfPublication().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getYearOfPublicationMetadata()
	{
		return yearOfPublication;
	}

	public void setYearOfPublication(java.lang.Integer yearOfPublication)
	{
		if (yearOfPublication != 0)
			this.yearOfPublication().setValue(yearOfPublication);
	}

	public void setYearOfPublicationMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger yearOfPublication)
	{
		this.yearOfPublication = yearOfPublication;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	isbn()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.isbn;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.isbn = result;
		}
		return result;
	}

	public java.lang.String getIsbn()
	{
		return this.isbn == null ? null : isbn().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getIsbnMetadata()
	{
		return isbn;
	}

	public void setIsbn(java.lang.String isbn)
	{
		if (isbn != null)
			this.isbn().setValue(isbn);
	}

	public void setIsbnMetadata(ecologylab.semantics.metadata.scalar.MetadataString isbn)
	{
		this.isbn = isbn;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	pages()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.pages;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.pages = result;
		}
		return result;
	}

	public java.lang.String getPages()
	{
		return this.pages == null ? null : pages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(java.lang.String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString pages)
	{
		this.pages = pages;
	}
}
