//
// GettyWorkInfo.cs
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

namespace Ecologylab.Semantics.Generated.Library.GettyArtworkNS 
{
	[SimplInherit]
	public class GettyWorkInfo : RichDocument
	{
		[SimplScalar]
		private MetadataString authorName;

		[SimplScalar]
		private MetadataString dateAndLocation;

		[SimplScalar]
		private MetadataString medium;

		[SimplScalar]
		private MetadataString dimensions;

		[SimplScalar]
		private MetadataString museumCode;

		public GettyWorkInfo()
		{ }

		public GettyWorkInfo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString AuthorName
		{
			get{return authorName;}
			set
			{
				if (this.authorName != value)
				{
					this.authorName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DateAndLocation
		{
			get{return dateAndLocation;}
			set
			{
				if (this.dateAndLocation != value)
				{
					this.dateAndLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Medium
		{
			get{return medium;}
			set
			{
				if (this.medium != value)
				{
					this.medium = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Dimensions
		{
			get{return dimensions;}
			set
			{
				if (this.dimensions != value)
				{
					this.dimensions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString MuseumCode
		{
			get{return museumCode;}
			set
			{
				if (this.museumCode != value)
				{
					this.museumCode = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
