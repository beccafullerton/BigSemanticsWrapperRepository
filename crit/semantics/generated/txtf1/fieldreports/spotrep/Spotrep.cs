//
// Spotrep.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.gps;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace crit.semantics.generated.txtf1.fieldreports.spotrep 
{
	/// <summary>
	/// A 9-line report from the field.
	/// </summary>
	[SimplInherit]
	public class Spotrep : Annotation
	{
		/// <summary>
		/// Extent of damage at location.
		/// </summary>
		[SimplScalar]
		private MetadataString damageExtent;

		/// <summary>
		/// Deployed unit activity observed at the location.
		/// </summary>
		[SimplScalar]
		private MetadataString observedActivity;

		/// <summary>
		/// Raw place data, including Google maps URL.
		/// </summary>
		[SimplScalar]
		private MetadataString rawPlace;

		/// <summary>
		/// Location of report.
		/// </summary>
		[SimplComposite]
		[MmName("place")]
		private GisLocation place;

		/// <summary>
		/// Units observed at location.
		/// </summary>
		[SimplScalar]
		private MetadataString observedUnits;

		/// <summary>
		/// Equipment observed at location.
		/// </summary>
		[SimplScalar]
		private MetadataString observedEquipment;

		/// <summary>
		/// Sender's assessment of the situation at the location, including recommended resources.
		/// </summary>
		[SimplScalar]
		private MetadataString assessment;

		/// <summary>
		/// File containing photograph of the situation.
		/// </summary>
		[SimplScalar]
		private MetadataString photographFile;

		public Spotrep()
		{ }

		public Spotrep(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString DamageExtent
		{
			get{return damageExtent;}
			set
			{
				if (this.damageExtent != value)
				{
					this.damageExtent = value;
					this.RaisePropertyChanged( () => this.DamageExtent );
				}
			}
		}

		public MetadataString ObservedActivity
		{
			get{return observedActivity;}
			set
			{
				if (this.observedActivity != value)
				{
					this.observedActivity = value;
					this.RaisePropertyChanged( () => this.ObservedActivity );
				}
			}
		}

		public MetadataString RawPlace
		{
			get{return rawPlace;}
			set
			{
				if (this.rawPlace != value)
				{
					this.rawPlace = value;
					this.RaisePropertyChanged( () => this.RawPlace );
				}
			}
		}

		public GisLocation Place
		{
			get{return place;}
			set
			{
				if (this.place != value)
				{
					this.place = value;
					this.RaisePropertyChanged( () => this.Place );
				}
			}
		}

		public MetadataString ObservedUnits
		{
			get{return observedUnits;}
			set
			{
				if (this.observedUnits != value)
				{
					this.observedUnits = value;
					this.RaisePropertyChanged( () => this.ObservedUnits );
				}
			}
		}

		public MetadataString ObservedEquipment
		{
			get{return observedEquipment;}
			set
			{
				if (this.observedEquipment != value)
				{
					this.observedEquipment = value;
					this.RaisePropertyChanged( () => this.ObservedEquipment );
				}
			}
		}

		public MetadataString Assessment
		{
			get{return assessment;}
			set
			{
				if (this.assessment != value)
				{
					this.assessment = value;
					this.RaisePropertyChanged( () => this.Assessment );
				}
			}
		}

		public MetadataString PhotographFile
		{
			get{return photographFile;}
			set
			{
				if (this.photographFile != value)
				{
					this.photographFile = value;
					this.RaisePropertyChanged( () => this.PhotographFile );
				}
			}
		}
	}
}
