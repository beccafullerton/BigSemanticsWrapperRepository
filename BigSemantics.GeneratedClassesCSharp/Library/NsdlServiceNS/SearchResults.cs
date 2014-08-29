//
// SearchResults.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.NsdlDocumentNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.NsdlServiceNS 
{
	[SimplInherit]
	public class SearchResults : Metadata
	{
		[SimplCollection("nsdl_document")]
		[MmName("results")]
		private List<NsdlDocument> results;

		public SearchResults()
		{ }

		public SearchResults(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<NsdlDocument> Results
		{
			get{return results;}
			set
			{
				if (this.results != value)
				{
					this.results = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
