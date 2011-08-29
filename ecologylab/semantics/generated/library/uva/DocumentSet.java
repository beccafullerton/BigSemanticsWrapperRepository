package ecologylab.semantics.generated.library.uva;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;

/**
*  DocumentSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class DocumentSet extends Metadata
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("document")	@mm_name("documents")
	private List<Document> documents;

	public DocumentSet()
	{ }

	public DocumentSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Document> getDocuments()
	{
		return documents;
	}

	public void setDocuments(List<Document> documents)
	{
		this.documents = documents;
	}
}
