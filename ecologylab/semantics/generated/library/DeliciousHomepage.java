package ecologylab.semantics.generated.library;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.MmdInlineBookmarkInBookmarksInDeliciousHomepage;

/**
*  DeliciousHomepage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Delicious home page class
 */ 
@simpl_inherit
public class DeliciousHomepage extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("bookmark") @mm_name("bookmarks")	private List<MmdInlineBookmarkInBookmarksInDeliciousHomepage> bookmarks;

	public DeliciousHomepage()
	{ }

	public DeliciousHomepage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MmdInlineBookmarkInBookmarksInDeliciousHomepage> getBookmarks()
	{
		return bookmarks;
	}

	public void setBookmarks(List<MmdInlineBookmarkInBookmarksInDeliciousHomepage> bookmarks)
	{
		this.bookmarks = bookmarks;
	}
}
