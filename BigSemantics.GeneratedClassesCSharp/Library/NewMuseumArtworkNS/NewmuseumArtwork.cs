//
// NewmuseumArtwork.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.ArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.NewmuseumExhibitionNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.NewMuseumArtworkNS 
{
	[SimplInherit]
	public class NewmuseumArtwork : Artwork
	{
		[SimplCollection("newmuseum_exhibition")]
		[MmName("related_exhibitions")]
		private List<NewmuseumExhibition> relatedExhibitions;

		public NewmuseumArtwork()
		{ }

		public NewmuseumArtwork(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<NewmuseumExhibition> RelatedExhibitions
		{
			get{return relatedExhibitions;}
			set
			{
				if (this.relatedExhibitions != value)
				{
					this.relatedExhibitions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
