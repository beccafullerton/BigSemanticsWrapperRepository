//
// AttractionList.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class AttractionList : RichDocument
	{
		[SimplCollection("attraction")]
		[MmName("attractions")]
		private List<Attraction> attractions;

		public AttractionList()
		{ }

		public AttractionList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Attraction> Attractions
		{
			get{return attractions;}
			set
			{
				if (this.attractions != value)
				{
					this.attractions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
