//
// MediaProvider.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


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

namespace Ecologylab.BigSemantics.Generated.Library.PrimitivesNS 
{
	[SimplInherit]
	public class MediaProvider : Metadata
	{
		[SimplScalar]
		private MetadataString provider;

		[SimplScalar]
		private MetadataString providerId;

		public MediaProvider()
		{ }

		public MediaProvider(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Provider
		{
			get{return provider;}
			set
			{
				if (this.provider != value)
				{
					this.provider = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ProviderId
		{
			get{return providerId;}
			set
			{
				if (this.providerId != value)
				{
					this.providerId = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
