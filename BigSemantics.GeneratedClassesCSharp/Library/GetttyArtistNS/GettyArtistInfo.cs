//
// GettyArtistInfo.cs
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

namespace Ecologylab.Semantics.Generated.Library.GetttyArtistNS 
{
	[SimplInherit]
	public class GettyArtistInfo : RichDocument
	{
		[SimplScalar]
		private MetadataString lifespan;

		[SimplScalar]
		private MetadataString professions;

		[SimplScalar]
		private MetadataString languages;

		public GettyArtistInfo()
		{ }

		public GettyArtistInfo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Lifespan
		{
			get{return lifespan;}
			set
			{
				if (this.lifespan != value)
				{
					this.lifespan = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Professions
		{
			get{return professions;}
			set
			{
				if (this.professions != value)
				{
					this.professions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Languages
		{
			get{return languages;}
			set
			{
				if (this.languages != value)
				{
					this.languages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
