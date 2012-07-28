//
// NsfAwardSearch.cs
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

namespace ecologylab.semantics.generated.library.nsf 
{
	/// <summary>
	/// NSF Award search.
	/// </summary>
	[SimplInherit]
	public class NsfAwardSearch : Search<Document>
	{
		public NsfAwardSearch()
		{ }

		public NsfAwardSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}