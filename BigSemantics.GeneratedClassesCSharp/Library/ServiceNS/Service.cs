//
// Service.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CommodityNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.ServiceNS 
{
	[SimplInherit]
	public class Service : Commodity
	{
		[SimplScalar]
		private MetadataString hours;

		public Service()
		{ }

		public Service(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Hours
		{
			get{return hours;}
			set
			{
				if (this.hours != value)
				{
					this.hours = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
