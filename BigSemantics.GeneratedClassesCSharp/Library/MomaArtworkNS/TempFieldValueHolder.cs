//
// TempFieldValueHolder.cs
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

namespace Ecologylab.BigSemantics.Generated.Library.MomaArtworkNS 
{
	[SimplInherit]
	public class TempFieldValueHolder : Metadata
	{
		[SimplScalar]
		private MetadataString tempDimensions;

		[SimplScalar]
		private MetadataString tempYear;

		[SimplScalar]
		private MetadataString tempMedium;

		public TempFieldValueHolder()
		{ }

		public TempFieldValueHolder(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString TempDimensions
		{
			get{return tempDimensions;}
			set
			{
				if (this.tempDimensions != value)
				{
					this.tempDimensions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString TempYear
		{
			get{return tempYear;}
			set
			{
				if (this.tempYear != value)
				{
					this.tempYear = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString TempMedium
		{
			get{return tempMedium;}
			set
			{
				if (this.tempMedium != value)
				{
					this.tempMedium = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
