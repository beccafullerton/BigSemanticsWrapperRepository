//
// Collection.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
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

namespace Ecologylab.Semantics.Generated.Library.DleseRecordNS 
{
	[SimplInherit]
	public class Collection : Metadata
	{
		[SimplScalar]
		private MetadataString id;

		public Collection()
		{ }

		public Collection(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Id
		{
			get{return id;}
			set
			{
				if (this.id != value)
				{
					this.id = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
