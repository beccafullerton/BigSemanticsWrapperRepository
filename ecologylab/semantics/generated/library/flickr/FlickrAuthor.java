package ecologylab.semantics.generated.library.flickr;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.flickr.FlickrLink;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  FlickrAuthor.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * All flickr photos of a particular user
 */ 
@simpl_inherit
public class FlickrAuthor extends CompoundDocument
{
	/** 
	 * Collection of all images of a user
	 */ 
	@simpl_collection("flickr_link") @mm_name("flickr_link_set")	private List<FlickrLink> flickrLinkSet;

	public FlickrAuthor()
	{ }

	public FlickrAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrLink> getFlickrLinkSet()
	{
		return flickrLinkSet;
	}

	public void setFlickrLinkSet(List<FlickrLink> flickrLinkSet)
	{
		this.flickrLinkSet = flickrLinkSet;
	}
}
