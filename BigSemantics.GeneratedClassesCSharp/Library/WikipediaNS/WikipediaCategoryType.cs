//
// WikipediaCategoryType.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.WikipediaNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.WikipediaNS 
{
	[SimplInherit]
	public class WikipediaCategoryType : CompoundDocument
	{
		[SimplCollection("wikipedia_category_type")]
		[MmName("subcategories")]
		private List<WikipediaCategoryType> subcategories;

		[SimplCollection("wikipedia_page_type")]
		[MmName("articles")]
		private List<WikipediaPageType> articles;

		[SimplScalar]
		private MetadataParsedURL nextPageUrl;

		[SimplCollection("wikipedia_category_type")]
		[MmName("supercategories")]
		private List<WikipediaCategoryType> supercategories;

		public WikipediaCategoryType()
		{ }

		public WikipediaCategoryType(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<WikipediaCategoryType> Subcategories
		{
			get{return subcategories;}
			set
			{
				if (this.subcategories != value)
				{
					this.subcategories = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<WikipediaPageType> Articles
		{
			get{return articles;}
			set
			{
				if (this.articles != value)
				{
					this.articles = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL NextPageUrl
		{
			get{return nextPageUrl;}
			set
			{
				if (this.nextPageUrl != value)
				{
					this.nextPageUrl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<WikipediaCategoryType> Supercategories
		{
			get{return supercategories;}
			set
			{
				if (this.supercategories != value)
				{
					this.supercategories = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
