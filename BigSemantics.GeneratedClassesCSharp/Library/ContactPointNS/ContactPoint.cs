//
// ContactPoint.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.GisLocationNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.ContactPointNS 
{
	/// <summary>
	/// Resembles a schema.org ContactPoint.
	/// </summary>
	[SimplInherit]
	public class ContactPoint : RichDocument
	{
		[SimplScalar]
		private MetadataString telephone;

		[SimplScalar]
		private MetadataString faxNumber;

		[SimplScalar]
		private MetadataString email;

		[SimplScalar]
		private MetadataString room;

		/// <summary>
		/// Whole address as one String
		/// </summary>
		[SimplScalar]
		private MetadataString streetAddress;

		[SimplComposite]
		[MmName("map")]
		private GisLocation map;

		public ContactPoint()
		{ }

		public ContactPoint(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Telephone
		{
			get{return telephone;}
			set
			{
				if (this.telephone != value)
				{
					this.telephone = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString FaxNumber
		{
			get{return faxNumber;}
			set
			{
				if (this.faxNumber != value)
				{
					this.faxNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Email
		{
			get{return email;}
			set
			{
				if (this.email != value)
				{
					this.email = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Room
		{
			get{return room;}
			set
			{
				if (this.room != value)
				{
					this.room = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString StreetAddress
		{
			get{return streetAddress;}
			set
			{
				if (this.streetAddress != value)
				{
					this.streetAddress = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GisLocation Map
		{
			get{return map;}
			set
			{
				if (this.map != value)
				{
					this.map = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
