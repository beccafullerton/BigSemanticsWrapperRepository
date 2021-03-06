//
// GoogleImageSearchResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
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
	/// Google image search result.
	/// </summary>
	[SimplInherit]
	public class GoogleImageSearchResult : ImageSearchResult
	{
		public GoogleImageSearchResult()
		{ }

		public GoogleImageSearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
