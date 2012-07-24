//
// SocialMediaSearch2.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.search 
{
	[SimplInherit]
	[SimplTag("social_media_search_2")]
	public class SocialMediaSearch2<SR> : Search<Document> where SR : SocialMediaSearchResult
	{
		public SocialMediaSearch2()
		{ }

		public SocialMediaSearch2(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
