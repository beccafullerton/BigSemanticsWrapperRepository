//
// RhizomeArtwork.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ArtworkNS 
{
	[SimplInherit]
	public class RhizomeArtwork : Artwork
	{
		[SimplCollection("artwork")]
		[SimplOtherTags(new String[] {"creative_works"})]
		[MmName("related_works")]
		private List<Artwork> relatedWorks;

		[SimplCollection("rhizome_tag")]
		[SimplTag("tag")]
		[MmName("tags")]
		private List<RhizomeTag> tags;

		public RhizomeArtwork()
		{ }

		public RhizomeArtwork(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Artwork> RelatedWorks
		{
			get{return relatedWorks;}
			set
			{
				if (this.relatedWorks != value)
				{
					this.relatedWorks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RhizomeTag> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}