//
// IeeeXploreArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS 
{
	[SimplInherit]
	public class IeeeXploreArticle : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("author_page")]
		private IeeeAuthorPage authorPage;

		[SimplCollection("ieee_xplore_search")]
		[MmName("articles_by_authors")]
		private List<IeeeXploreSearch> articlesByAuthors;

		[SimplComposite]
		[MmName("published_in")]
		private IeeeJournalPage publishedIn;

		[SimplComposite]
		[MmName("keyword_page")]
		private IeeeKeywords keywordPage;

		[SimplComposite]
		[MmName("references_page")]
		private IeeeXploreReferences referencesPage;

		[SimplComposite]
		[MmName("cited_by")]
		private IeeeXploreCitedBy citedBy;

		/// <summary>
		/// The digital object identifier of the article
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL doi;

		public IeeeXploreArticle()
		{ }

		public IeeeXploreArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public IeeeAuthorPage AuthorPage
		{
			get{return authorPage;}
			set
			{
				if (this.authorPage != value)
				{
					this.authorPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<IeeeXploreSearch> ArticlesByAuthors
		{
			get{return articlesByAuthors;}
			set
			{
				if (this.articlesByAuthors != value)
				{
					this.articlesByAuthors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public IeeeJournalPage PublishedIn
		{
			get{return publishedIn;}
			set
			{
				if (this.publishedIn != value)
				{
					this.publishedIn = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public IeeeKeywords KeywordPage
		{
			get{return keywordPage;}
			set
			{
				if (this.keywordPage != value)
				{
					this.keywordPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public IeeeXploreReferences ReferencesPage
		{
			get{return referencesPage;}
			set
			{
				if (this.referencesPage != value)
				{
					this.referencesPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public IeeeXploreCitedBy CitedBy
		{
			get{return citedBy;}
			set
			{
				if (this.citedBy != value)
				{
					this.citedBy = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Doi
		{
			get{return doi;}
			set
			{
				if (this.doi != value)
				{
					this.doi = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
