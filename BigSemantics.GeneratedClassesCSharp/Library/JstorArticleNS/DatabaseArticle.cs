//
// DatabaseArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.JstorArticleNS;
using Ecologylab.Semantics.Generated.Library.PublicationNS;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.JstorArticleNS 
{
	/// <summary>
	/// A database article - ie. jstor
	/// </summary>
	[SimplInherit]
	public class DatabaseArticle : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("journal_image")]
		private Image journalImage;

		[SimplComposite]
		[MmName("journal")]
		private Publication journal;

		[SimplComposite]
		[MmName("author_link")]
		private Search<RichDocument> authorLink;

		[SimplComposite]
		[MmName("citation_page")]
		private Search<RichDocument> citationPage;

		/// <summary>
		/// For pages initally linking to pdf view
		/// </summary>
		[SimplComposite]
		[MmName("summary_page")]
		private DatabaseArticle summaryPage;

		[SimplComposite]
		[MmName("related_items")]
		private Search<RichDocument> relatedItems;

		public DatabaseArticle()
		{ }

		public DatabaseArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Image JournalImage
		{
			get{return journalImage;}
			set
			{
				if (this.journalImage != value)
				{
					this.journalImage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Publication Journal
		{
			get{return journal;}
			set
			{
				if (this.journal != value)
				{
					this.journal = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Search<RichDocument> AuthorLink
		{
			get{return authorLink;}
			set
			{
				if (this.authorLink != value)
				{
					this.authorLink = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Search<RichDocument> CitationPage
		{
			get{return citationPage;}
			set
			{
				if (this.citationPage != value)
				{
					this.citationPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public DatabaseArticle SummaryPage
		{
			get{return summaryPage;}
			set
			{
				if (this.summaryPage != value)
				{
					this.summaryPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Search<RichDocument> RelatedItems
		{
			get{return relatedItems;}
			set
			{
				if (this.relatedItems != value)
				{
					this.relatedItems = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
