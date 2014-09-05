//
// CiteseerxSummary.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CiteseerxRecordNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CiteseerxSummaryNS 
{
	/// <summary>
	/// Summary page from CiteSeerX.
	/// </summary>
	[SimplInherit]
	public class CiteseerxSummary : CiteseerxRecord
	{
		[SimplComposite]
		[SimplOtherTags(new String[] {"citation_records"})]
		[MmName("cited_articles")]
		private Document citedArticles;

		[SimplComposite]
		[SimplOtherTags(new String[] {"active_bibliography_records"})]
		[MmName("articles_that_cite_the_same_works")]
		private Document articlesThatCiteTheSameWorks;

		[SimplComposite]
		[SimplOtherTags(new String[] {"cocitation_records"})]
		[MmName("articles_cited_by_the_same_works")]
		private Document articlesCitedByTheSameWorks;

		public CiteseerxSummary()
		{ }

		public CiteseerxSummary(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Document CitedArticles
		{
			get{return citedArticles;}
			set
			{
				if (this.citedArticles != value)
				{
					this.citedArticles = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Document ArticlesThatCiteTheSameWorks
		{
			get{return articlesThatCiteTheSameWorks;}
			set
			{
				if (this.articlesThatCiteTheSameWorks != value)
				{
					this.articlesThatCiteTheSameWorks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Document ArticlesCitedByTheSameWorks
		{
			get{return articlesCitedByTheSameWorks;}
			set
			{
				if (this.articlesCitedByTheSameWorks != value)
				{
					this.articlesCitedByTheSameWorks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
