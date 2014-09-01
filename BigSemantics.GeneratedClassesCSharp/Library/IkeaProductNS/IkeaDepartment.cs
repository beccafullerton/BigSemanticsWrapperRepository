//
// IkeaDepartment.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.IkeaProductNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.IkeaProductNS 
{
	[SimplInherit]
	public class IkeaDepartment : RichDocument
	{
		[SimplCollection("ikea_product")]
		[MmName("products")]
		private List<IkeaProduct> products;

		public IkeaDepartment()
		{ }

		public IkeaDepartment(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IkeaProduct> Products
		{
			get{return products;}
			set
			{
				if (this.products != value)
				{
					this.products = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
