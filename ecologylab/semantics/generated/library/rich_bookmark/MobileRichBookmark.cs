//
// MobileRichBookmark.cs
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

namespace ecologylab.semantics.generated.library.rich_bookmark 
{
	[SimplInherit]
	public class MobileRichBookmark : Metadata
	{
		[SimplComposite]
		[SimplScope("repository_clippings")]
		[MmName("clipping")]
		private Clipping clipping;

		[SimplScalar]
		private MetadataDate time;

		[SimplComposite]
		[MmName("gis_location")]
		private GisLocation gisLocation;

		public MobileRichBookmark()
		{ }

		public MobileRichBookmark(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Clipping Clipping
		{
			get{return clipping;}
			set
			{
				if (this.clipping != value)
				{
					this.clipping = value;
					this.RaisePropertyChanged( () => this.Clipping );
				}
			}
		}

		public MetadataDate Time
		{
			get{return time;}
			set
			{
				if (this.time != value)
				{
					this.time = value;
					this.RaisePropertyChanged( () => this.Time );
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
					this.RaisePropertyChanged( () => this.GisLocation );
				}
			}
		}
	}
}
