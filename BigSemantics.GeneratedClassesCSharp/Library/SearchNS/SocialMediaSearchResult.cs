//
// SocialMediaSearchResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


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
	/// A result from a social media search.
	/// </summary>
	[SimplInherit]
	public class SocialMediaSearchResult : RichDocument
	{
		/// <summary>
		/// The author of this item.
		/// </summary>
		[SimplScalar]
		private MetadataString author;

		/// <summary>
		/// Associated tags from the search engine, if exist.
		/// </summary>
		[SimplCollection("document")]
		[MmName("tags")]
		private List<Document> tags;

		public SocialMediaSearchResult()
		{ }

		public SocialMediaSearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Author
		{
			get{return author;}
			set
			{
				if (this.author != value)
				{
					this.author = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
