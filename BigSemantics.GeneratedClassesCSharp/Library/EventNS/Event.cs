//
// Event.cs
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

namespace Ecologylab.BigSemantics.Generated.Library.EventNS 
{
	/// <summary>
	/// Generalized Event Object
	/// </summary>
	[SimplInherit]
	public class Event : RichDocument
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
