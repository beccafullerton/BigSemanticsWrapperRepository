//
// YahooGeoCodeResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.YahooSearchNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.YahooSearchNS 
{
	[SimplInherit]
	public class YahooGeoCodeResult : YahooResult
	{
		[SimplScalar]
		private MetadataString county;

		[SimplScalar]
		private MetadataString postal;

		[SimplScalar]
		private MetadataString state;

		[SimplScalar]
		private MetadataString line1;

		[SimplScalar]
		private MetadataString line2;

		[SimplScalar]
		private MetadataString city;

		[SimplScalar]
		private MetadataString country;

		public YahooGeoCodeResult()
		{ }

		public YahooGeoCodeResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString County
		{
			get{return county;}
			set
			{
				if (this.county != value)
				{
					this.county = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Postal
		{
			get{return postal;}
			set
			{
				if (this.postal != value)
				{
					this.postal = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString State
		{
			get{return state;}
			set
			{
				if (this.state != value)
				{
					this.state = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Line1
		{
			get{return line1;}
			set
			{
				if (this.line1 != value)
				{
					this.line1 = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Line2
		{
			get{return line2;}
			set
			{
				if (this.line2 != value)
				{
					this.line2 = value;
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

		public MetadataString Country
		{
			get{return country;}
			set
			{
				if (this.country != value)
				{
					this.country = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
