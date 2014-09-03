//
// ResearchGateResearcher.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ResearchgateAuthorNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ResearchgateResearcherNS 
{
	[SimplInherit]
	public class ResearchGateResearcher : ResearchGateAuthor
	{
		[SimplCollection("rich_document")]
		[MmName("researcher_stats")]
		private List<RichDocument> researcherStats;

		public ResearchGateResearcher()
		{ }

		public ResearchGateResearcher(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<RichDocument> ResearcherStats
		{
			get{return researcherStats;}
			set
			{
				if (this.researcherStats != value)
				{
					this.researcherStats = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
