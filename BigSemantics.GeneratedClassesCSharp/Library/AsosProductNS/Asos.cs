//
// Asos.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.AsosProductNS;
using Ecologylab.Semantics.Generated.Library.ProductNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.AsosProductNS 
{
	[SimplInherit]
	public class Asos : Product
	{
		[SimplComposite]
		[MmName("designer")]
		private Designer designer;

		[SimplCollection("asos")]
		[MmName("recommmended_products")]
		private List<Asos> recommmendedProducts;

		[SimplCollection("compound_document")]
		[MmName("tags")]
		private List<CompoundDocument> tags;

		public Asos()
		{ }

		public Asos(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Designer Designer
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

		public List<Asos> RecommmendedProducts
		{
			get{return recommmendedProducts;}
			set
			{
				if (this.recommmendedProducts != value)
				{
					this.recommmendedProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<CompoundDocument> Tags
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
