//
// GuggenArtwork.cs
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
	public class GuggenArtwork : Artwork
	{
		[SimplCollection("guggen_filter")]
		[SimplTag("tag")]
		[MmName("tags")]
		private List<GuggenFilter> tags;

		public GuggenArtwork()
		{ }

		public GuggenArtwork(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<GuggenFilter> Tags
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