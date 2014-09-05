//
// Attraction.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.PostalAddressNS;
using Ecologylab.BigSemantics.Generated.Library.ReviewNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.AttractionNS 
{
	[SimplInherit]
	public class Attraction : RichDocument
	{
		/// <summary>
		/// Price/fee of the attraction
		/// </summary>
		[SimplScalar]
		private MetadataString fee;

		/// <summary>
		/// type of the attraction, i.e. museum
		/// </summary>
		[SimplScalar]
		private MetadataString attractionType;

		/// <summary>
		/// the hours that the attraction is open
		/// </summary>
		[SimplScalar]
		private MetadataString openHours;

		[SimplScalar]
		private MetadataString overallRating;

		[SimplComposite]
		[MmName("attraction_address")]
		private PostalAddress attractionAddress;

		/// <summary>
		/// website to go to for more information
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL attractionWebsite;

		[SimplCollection("review")]
		[MmName("reviews")]
		private List<Review> reviews;

		/// <summary>
		/// area of where attraction is and other attractions in the area
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL attractionsInTheArea;

		public Attraction()
		{ }

		public Attraction(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Fee
		{
			get{return fee;}
			set
			{
				if (this.fee != value)
				{
					this.fee = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AttractionType
		{
			get{return attractionType;}
			set
			{
				if (this.attractionType != value)
				{
					this.attractionType = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString OpenHours
		{
			get{return openHours;}
			set
			{
				if (this.openHours != value)
				{
					this.openHours = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString OverallRating
		{
			get{return overallRating;}
			set
			{
				if (this.overallRating != value)
				{
					this.overallRating = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public PostalAddress AttractionAddress
		{
			get{return attractionAddress;}
			set
			{
				if (this.attractionAddress != value)
				{
					this.attractionAddress = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL AttractionWebsite
		{
			get{return attractionWebsite;}
			set
			{
				if (this.attractionWebsite != value)
				{
					this.attractionWebsite = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Review> Reviews
		{
			get{return reviews;}
			set
			{
				if (this.reviews != value)
				{
					this.reviews = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL AttractionsInTheArea
		{
			get{return attractionsInTheArea;}
			set
			{
				if (this.attractionsInTheArea != value)
				{
					this.attractionsInTheArea = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
