//
// Cb2Product.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.Cb2ProductNS;
using Ecologylab.BigSemantics.Generated.Library.ProductNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.Cb2ProductNS 
{
	[SimplInherit]
	public class Cb2Product : Product
	{
		[SimplCollection("cb2_product")]
		[MmName("works_with")]
		private List<Cb2Product> worksWith;

		public Cb2Product()
		{ }

		public Cb2Product(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Cb2Product> WorksWith
		{
			get{return worksWith;}
			set
			{
				if (this.worksWith != value)
				{
					this.worksWith = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
