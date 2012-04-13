//
// CiteseerxSearchResult.cs
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
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.bibManaging 
{
	[SimplInherit]
	public class CiteseerxSearchResult : Document
	{
		[SimplScalar]
		private MetadataString citationInfo;

		public CiteseerxSearchResult()
		{ }

		public CiteseerxSearchResult(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString CitationInfo
		{
			get{return citationInfo;}
			set
			{
				if (this.citationInfo != value)
				{
					this.citationInfo = value;
					this.RaisePropertyChanged( () => this.CitationInfo );
				}
			}
		}
	}
}