package ecologylab.semantics.generated.library.misc;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.builtins.Image;

/**
*  IcdlImage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Image from The Interantional Children's digital library.
 */ 
@simpl_inherit
public class IcdlImage extends Image
{
	/** 
	 * The language of the library
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString languages;

	public IcdlImage()
	{ }

	public IcdlImage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	languages()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.languages;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.languages = result;
		}
		return result;
	}

	public java.lang.String getLanguages()
	{
		return this.languages == null ? null : languages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(java.lang.String languages)
	{
		if (languages != null)
			this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString languages)
	{
		this.languages = languages;
	}
}
