//
// Event.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.GisNS;
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

namespace Ecologylab.Semantics.Generated.Library.DisasterNS 
{
	/// <summary>
	/// Generalized Event Object
	/// </summary>
	[SimplInherit]
	public class Event : CompoundDocument
	{
		[SimplScalar]
		private MetadataDate startTime;

		[SimplScalar]
		private MetadataDate endTime;

		[SimplComposite]
		[MmName("gis_location")]
		private GisLocation gisLocation;

		public Event()
		{ }

		public Event(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataDate StartTime
		{
			get{return startTime;}
			set
			{
				if (this.startTime != value)
				{
					this.startTime = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate EndTime
		{
			get{return endTime;}
			set
			{
				if (this.endTime != value)
				{
					this.endTime = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GisLocation GisLocation
		{
			get{return gisLocation;}
			set
			{
				if (this.gisLocation != value)
				{
					this.gisLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
