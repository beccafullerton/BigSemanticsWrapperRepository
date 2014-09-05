//
// GoogleScholarSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.GoogleScholarSearchNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.GoogleScholarSearchNS 
{
	/// <summary>
	/// The google Search class
	/// </summary>
	[SimplInherit]
	public class GoogleScholarSearch : Search<GoogleScholarSearchResult>
	{
		public GoogleScholarSearch()
		{ }

		public GoogleScholarSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
