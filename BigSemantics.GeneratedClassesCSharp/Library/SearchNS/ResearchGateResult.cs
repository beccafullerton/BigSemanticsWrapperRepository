//
// ResearchGateResult.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
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

namespace Ecologylab.Semantics.Generated.Library.SearchNS 
{
	[SimplInherit]
	public class ResearchGateResult : SearchResult
	{
		[SimplCollection("author")]
		[MmName("authors")]
		private List<Author> authors;

		public ResearchGateResult()
		{ }

		public ResearchGateResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Author> Authors
		{
			get{return authors;}
			set
			{
				if (this.authors != value)
				{
					this.authors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
