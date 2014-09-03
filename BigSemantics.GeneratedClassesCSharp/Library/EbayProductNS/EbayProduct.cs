//
// EbayProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ProductNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.EbayProductNS 
{
	[SimplInherit]
	public class EbayProduct : Product
	{
		[SimplScalar]
		private MetadataString itemCondition;

		[SimplScalar]
		private MetadataString availability;

		[SimplComposite]
		[MmName("seller")]
		private RichDocument seller;

		public EbayProduct()
		{ }

		public EbayProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString ItemCondition
		{
			get{return itemCondition;}
			set
			{
				if (this.itemCondition != value)
				{
					this.itemCondition = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Availability
		{
			get{return availability;}
			set
			{
				if (this.availability != value)
				{
					this.availability = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Seller
		{
			get{return seller;}
			set
			{
				if (this.seller != value)
				{
					this.seller = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
