//
// Publisher.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.PublisherNS 
{
	/// <summary>
	/// A publishing company.
	/// </summary>
	[SimplInherit]
	public class Publisher : Document
	{
		[SimplScalar]
		[SimplCompositeAsScalar]
		private MetadataString title;

		[SimplScalar]
		private MetadataString city;

		public Publisher()
		{ }

		public Publisher(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Title
		{
			get{return title;}
			set
			{
				if (this.title != value)
				{
					this.title = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString City
		{
			get{return city;}
			set
			{
				if (this.city != value)
				{
					this.city = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
