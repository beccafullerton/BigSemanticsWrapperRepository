//
// Search.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// A search.
	/// </summary>
	[SimplInherit]
	public class Search<SR> : RichDocument where SR : RichDocument
	{
		/// <summary>
		/// Useful for smaller searches where knowing num results is helpful
		/// </summary>
		[SimplScalar]
		private MetadataString numberResults;

		[SimplCollection]
		[SimplNoWrap]
		[SimplScope("repository_documents")]
		[MmName("search_results")]
		private List<RichDocument> searchResults;

		[SimplCollection("search")]
		[MmName("related_searches")]
		private List<Search<RichDocument>> relatedSearches;

		[SimplComposite]
		[MmName("next_page")]
		private Search<RichDocument> nextPage;

		public Search()
		{ }

		public Search(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString NumberResults
		{
			get{return numberResults;}
			set
			{
				if (this.numberResults != value)
				{
					this.numberResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> SearchResults
		{
			get{return searchResults;}
			set
			{
				if (this.searchResults != value)
				{
					this.searchResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Search<RichDocument>> RelatedSearches
		{
			get{return relatedSearches;}
			set
			{
				if (this.relatedSearches != value)
				{
					this.relatedSearches = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Search<RichDocument> NextPage
		{
			get{return nextPage;}
			set
			{
				if (this.nextPage != value)
				{
					this.nextPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
