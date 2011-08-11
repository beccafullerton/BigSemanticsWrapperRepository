package ecologylab.semantics.generated.library.products;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.products.ProductReview;

/**
*  Product.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Product extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString price;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString model;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL imageUrl;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString overallRating;

	/** 
	 */ 
	@simpl_collection("product_review") @mm_name("reviews")	private List<ProductReview> reviews;

	public Product()
	{ }

	public Product(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	price()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.price;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.price = result;
		}
		return result;
	}

	public java.lang.String getPrice()
	{
		return this.price == null ? null : price().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPriceMetadata()
	{
		return price;
	}

	public void setPrice(java.lang.String price)
	{
		if (price != null)
			this.price().setValue(price);
	}

	public void setPriceMetadata(ecologylab.semantics.metadata.scalar.MetadataString price)
	{
		this.price = price;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	model()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.model;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.model = result;
		}
		return result;
	}

	public java.lang.String getModel()
	{
		return this.model == null ? null : model().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getModelMetadata()
	{
		return model;
	}

	public void setModel(java.lang.String model)
	{
		if (model != null)
			this.model().setValue(model);
	}

	public void setModelMetadata(ecologylab.semantics.metadata.scalar.MetadataString model)
	{
		this.model = model;
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	imageUrl()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.imageUrl;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.imageUrl = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getImageUrl()
	{
		return this.imageUrl == null ? null : imageUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getImageUrlMetadata()
	{
		return imageUrl;
	}

	public void setImageUrl(ecologylab.net.ParsedURL imageUrl)
	{
		if (imageUrl != null)
			this.imageUrl().setValue(imageUrl);
	}

	public void setImageUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	overallRating()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.overallRating;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.overallRating = result;
		}
		return result;
	}

	public java.lang.String getOverallRating()
	{
		return this.overallRating == null ? null : overallRating().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getOverallRatingMetadata()
	{
		return overallRating;
	}

	public void setOverallRating(java.lang.String overallRating)
	{
		if (overallRating != null)
			this.overallRating().setValue(overallRating);
	}

	public void setOverallRatingMetadata(ecologylab.semantics.metadata.scalar.MetadataString overallRating)
	{
		this.overallRating = overallRating;
	}

	public List<ProductReview> getReviews()
	{
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews)
	{
		this.reviews = reviews;
	}
}
