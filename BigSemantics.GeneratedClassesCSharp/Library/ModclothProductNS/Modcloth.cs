//
// Modcloth.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.ModclothProductNS;
using Ecologylab.BigSemantics.Generated.Library.ModclothSearchNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.ModclothProductNS 
{
	[SimplInherit]
	public class Modcloth : Product
	{
		[SimplScalar]
		private MetadataString designer;

		[SimplCollection("detail")]
		[MmName("details")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> details;

		[SimplCollection("avalailable_size")]
		[MmName("avalailable_sizes")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> avalailableSizes;

		[SimplScalar]
		private MetadataString sizingReccomendation;

		[SimplCollection("modcloth")]
		[MmName("similar_products")]
		private List<Modcloth> similarProducts;

		[SimplCollection("modcloth_search")]
		[MmName("tags")]
		private List<ModclothSearch> tags;

		public Modcloth()
		{ }

		public Modcloth(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Designer
		{
			get{return designer;}
			set
			{
				if (this.designer != value)
				{
					this.designer = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> Details
		{
			get{return details;}
			set
			{
				if (this.details != value)
				{
					this.details = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> AvalailableSizes
		{
			get{return avalailableSizes;}
			set
			{
				if (this.avalailableSizes != value)
				{
					this.avalailableSizes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString SizingReccomendation
		{
			get{return sizingReccomendation;}
			set
			{
				if (this.sizingReccomendation != value)
				{
					this.sizingReccomendation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Modcloth> SimilarProducts
		{
			get{return similarProducts;}
			set
			{
				if (this.similarProducts != value)
				{
					this.similarProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ModclothSearch> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
