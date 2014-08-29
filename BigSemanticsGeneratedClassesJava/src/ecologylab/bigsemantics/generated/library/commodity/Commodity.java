package ecologylab.bigsemantics.generated.library.commodity;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.Commodity;
import ecologylab.bigsemantics.generated.library.commodity.LabeledSpecifications;
import ecologylab.bigsemantics.generated.library.commodity.Specification;
import ecologylab.bigsemantics.generated.library.gisLocation.GisLocation;
import ecologylab.bigsemantics.generated.library.postalAddress.PostalAddress;
import ecologylab.bigsemantics.generated.library.review.Review;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Commodity extends CompoundDocument
{
	@simpl_scalar
	private MetadataString price;

	@simpl_collection("commodity")
	@mm_name("companion_products")
	private List<Commodity> companionProducts;

	@simpl_collection("commodity")
	@mm_name("comparitive_products")
	private List<Commodity> comparitiveProducts;

	@simpl_collection("product_detail")
	@mm_name("product_details")
	private List<MetadataString> productDetails;

	@simpl_collection("specification")
	@mm_name("specifications")
	private List<Specification> specifications;

	@simpl_collection("labeled_specifications")
	@mm_name("specifications_table")
	private List<LabeledSpecifications> specificationsTable;

	@simpl_scalar
	private MetadataString overallRating;

	@simpl_scalar
	private MetadataParsedURL reviewsLocation;

	@simpl_scalar
	private MetadataInteger numReviews;

	@simpl_collection("review")
	@mm_name("reviews")
	private List<Review> reviews;

	@simpl_composite
	@mm_name("business_website")
	private CompoundDocument businessWebsite;

	@simpl_composite
	@mm_name("business_address")
	private PostalAddress businessAddress;

	@simpl_composite
	@mm_name("business_gis_location")
	private GisLocation businessGisLocation;

	public Commodity()
	{ super(); }

	public Commodity(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	price()
	{
		MetadataString	result = this.price;
		if (result == null)
		{
			result = new MetadataString();
			this.price = result;
		}
		return result;
	}

	public String getPrice()
	{
		return this.price == null ? null : price().getValue();
	}

	public MetadataString getPriceMetadata()
	{
		return price;
	}

	public void setPrice(String price)
	{
		if (price != null)
			this.price().setValue(price);
	}

	public void setPriceMetadata(MetadataString price)
	{
		this.price = price;
	}

	public List<Commodity> getCompanionProducts()
	{
		return companionProducts;
	}

  // lazy evaluation:
  public List<Commodity> companionProducts()
  {
    if (companionProducts == null)
      companionProducts = new ArrayList<Commodity>();
    return companionProducts;
  }

  // addTo:
  public void addToCompanionProducts(Commodity element)
  {
    companionProducts().add(element);
  }

  // size:
  public int companionProductsSize()
  {
    return companionProducts == null ? 0 : companionProducts.size();
  }

	public void setCompanionProducts(List<Commodity> companionProducts)
	{
		this.companionProducts = companionProducts;
	}

	public List<Commodity> getComparitiveProducts()
	{
		return comparitiveProducts;
	}

  // lazy evaluation:
  public List<Commodity> comparitiveProducts()
  {
    if (comparitiveProducts == null)
      comparitiveProducts = new ArrayList<Commodity>();
    return comparitiveProducts;
  }

  // addTo:
  public void addToComparitiveProducts(Commodity element)
  {
    comparitiveProducts().add(element);
  }

  // size:
  public int comparitiveProductsSize()
  {
    return comparitiveProducts == null ? 0 : comparitiveProducts.size();
  }

	public void setComparitiveProducts(List<Commodity> comparitiveProducts)
	{
		this.comparitiveProducts = comparitiveProducts;
	}

	public List<MetadataString> getProductDetails()
	{
		return productDetails;
	}

  // lazy evaluation:
  public List<MetadataString> productDetails()
  {
    if (productDetails == null)
      productDetails = new ArrayList<MetadataString>();
    return productDetails;
  }

  // addTo:
  public void addToProductDetails(MetadataString element)
  {
    productDetails().add(element);
  }

  // size:
  public int productDetailsSize()
  {
    return productDetails == null ? 0 : productDetails.size();
  }

	public void setProductDetails(List<MetadataString> productDetails)
	{
		this.productDetails = productDetails;
	}

	public List<Specification> getSpecifications()
	{
		return specifications;
	}

  // lazy evaluation:
  public List<Specification> specifications()
  {
    if (specifications == null)
      specifications = new ArrayList<Specification>();
    return specifications;
  }

  // addTo:
  public void addToSpecifications(Specification element)
  {
    specifications().add(element);
  }

  // size:
  public int specificationsSize()
  {
    return specifications == null ? 0 : specifications.size();
  }

	public void setSpecifications(List<Specification> specifications)
	{
		this.specifications = specifications;
	}

	public List<LabeledSpecifications> getSpecificationsTable()
	{
		return specificationsTable;
	}

  // lazy evaluation:
  public List<LabeledSpecifications> specificationsTable()
  {
    if (specificationsTable == null)
      specificationsTable = new ArrayList<LabeledSpecifications>();
    return specificationsTable;
  }

  // addTo:
  public void addToSpecificationsTable(LabeledSpecifications element)
  {
    specificationsTable().add(element);
  }

  // size:
  public int specificationsTableSize()
  {
    return specificationsTable == null ? 0 : specificationsTable.size();
  }

	public void setSpecificationsTable(List<LabeledSpecifications> specificationsTable)
	{
		this.specificationsTable = specificationsTable;
	}

	public MetadataString	overallRating()
	{
		MetadataString	result = this.overallRating;
		if (result == null)
		{
			result = new MetadataString();
			this.overallRating = result;
		}
		return result;
	}

	public String getOverallRating()
	{
		return this.overallRating == null ? null : overallRating().getValue();
	}

	public MetadataString getOverallRatingMetadata()
	{
		return overallRating;
	}

	public void setOverallRating(String overallRating)
	{
		if (overallRating != null)
			this.overallRating().setValue(overallRating);
	}

	public void setOverallRatingMetadata(MetadataString overallRating)
	{
		this.overallRating = overallRating;
	}

	public MetadataParsedURL	reviewsLocation()
	{
		MetadataParsedURL	result = this.reviewsLocation;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.reviewsLocation = result;
		}
		return result;
	}

	public ParsedURL getReviewsLocation()
	{
		return this.reviewsLocation == null ? null : reviewsLocation().getValue();
	}

	public MetadataParsedURL getReviewsLocationMetadata()
	{
		return reviewsLocation;
	}

	public void setReviewsLocation(ParsedURL reviewsLocation)
	{
		if (reviewsLocation != null)
			this.reviewsLocation().setValue(reviewsLocation);
	}

	public void setReviewsLocationMetadata(MetadataParsedURL reviewsLocation)
	{
		this.reviewsLocation = reviewsLocation;
	}

	public MetadataInteger	numReviews()
	{
		MetadataInteger	result = this.numReviews;
		if (result == null)
		{
			result = new MetadataInteger();
			this.numReviews = result;
		}
		return result;
	}

	public Integer getNumReviews()
	{
		return this.numReviews == null ? 0 : numReviews().getValue();
	}

	public MetadataInteger getNumReviewsMetadata()
	{
		return numReviews;
	}

	public void setNumReviews(Integer numReviews)
	{
		if (numReviews != 0)
			this.numReviews().setValue(numReviews);
	}

	public void setNumReviewsMetadata(MetadataInteger numReviews)
	{
		this.numReviews = numReviews;
	}

	public List<Review> getReviews()
	{
		return reviews;
	}

  // lazy evaluation:
  public List<Review> reviews()
  {
    if (reviews == null)
      reviews = new ArrayList<Review>();
    return reviews;
  }

  // addTo:
  public void addToReviews(Review element)
  {
    reviews().add(element);
  }

  // size:
  public int reviewsSize()
  {
    return reviews == null ? 0 : reviews.size();
  }

	public void setReviews(List<Review> reviews)
	{
		this.reviews = reviews;
	}

	public CompoundDocument getBusinessWebsite()
	{
		return businessWebsite;
	}

	public void setBusinessWebsite(CompoundDocument businessWebsite)
	{
		this.businessWebsite = businessWebsite;
	}

	public PostalAddress getBusinessAddress()
	{
		return businessAddress;
	}

	public void setBusinessAddress(PostalAddress businessAddress)
	{
		this.businessAddress = businessAddress;
	}

	public GisLocation getBusinessGisLocation()
	{
		return businessGisLocation;
	}

	public void setBusinessGisLocation(GisLocation businessGisLocation)
	{
		this.businessGisLocation = businessGisLocation;
	}
}
