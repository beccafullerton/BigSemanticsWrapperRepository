//
// JstorSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
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

namespace Ecologylab.BigSemantics.Generated.Library.JstorSearchNS 
{
	/// <summary>
	/// jstor Search class
	/// </summary>
	[SimplInherit]
	public class JstorSearch : Search<SearchResult>
	{
		public JstorSearch()
		{ }

		public JstorSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
