//
// HomeDepotProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.ProductNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.HomeDepotProductNS 
{
	[SimplInherit]
	public class HomeDepotProduct : Product
	{
		[SimplCollection("product_details2")]
		[MmName("product_details2")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> productDetails2;

		public HomeDepotProduct()
		{ }

		public HomeDepotProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> ProductDetails2
		{
			get{return productDetails2;}
			set
			{
				if (this.productDetails2 != value)
				{
					this.productDetails2 = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
