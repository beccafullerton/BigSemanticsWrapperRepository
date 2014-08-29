//
// WhitneyWatchAndListen.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.Generated.Library.WhitneyWatchAndListenNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.WhitneyWatchAndListenNS 
{
	[SimplInherit]
	public class WhitneyWatchAndListen : Artwork
	{
		[SimplCollection("whitney_watch_and_listen")]
		[MmName("audio_playlist")]
		private List<WhitneyWatchAndListen> audioPlaylist;

		public WhitneyWatchAndListen()
		{ }

		public WhitneyWatchAndListen(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<WhitneyWatchAndListen> AudioPlaylist
		{
			get{return audioPlaylist;}
			set
			{
				if (this.audioPlaylist != value)
				{
					this.audioPlaylist = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
