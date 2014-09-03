//
// IeeeKeywords.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.IeeeSearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.IeeeKeywordsNS 
{
	[SimplInherit]
	public class IeeeKeywords : RichDocument
	{
		[SimplCollection("ieee_xplore_search")]
		[MmName("keywords")]
		private List<IeeeXploreSearch> keywords;

		public IeeeKeywords()
		{ }

		public IeeeKeywords(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IeeeXploreSearch> Keywords
		{
			get{return keywords;}
			set
			{
				if (this.keywords != value)
				{
					this.keywords = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
