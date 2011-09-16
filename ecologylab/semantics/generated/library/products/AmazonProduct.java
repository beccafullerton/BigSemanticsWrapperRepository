package ecologylab.semantics.generated.library.products;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.generated.library.products.Product;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.generated.library.products.BestsellerList;

/**
*  AmazonProduct.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class AmazonProduct extends Product
{
	/** 
	 */ 
	@simpl_composite	@mm_name("department")
	private Document department;

	/** 
	 */ 
	@simpl_composite	@mm_name("bestseller_list")
	private BestsellerList bestsellerList;

	public AmazonProduct()
	{ }

	public AmazonProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Document getDepartment()
	{
		return department;
	}

	public void setDepartment(Document department)
	{
		this.department = department;
	}

	public BestsellerList getBestsellerList()
	{
		return bestsellerList;
	}

	public void setBestsellerList(BestsellerList bestsellerList)
	{
		this.bestsellerList = bestsellerList;
	}
}
