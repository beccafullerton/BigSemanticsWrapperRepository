package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.generated.library.publication.Author;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.artwork.Artwork;

/**
*  Artist.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Artist extends Author
{
	/** 
	 */ 
	@simpl_collection("artwork") @mm_name("artworks")	private List<Artwork> artworks;

	public Artist()
	{ }

	public Artist(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Artwork> getArtworks()
	{
		return artworks;
	}

	public void setArtworks(List<Artwork> artworks)
	{
		this.artworks = artworks;
	}
}
