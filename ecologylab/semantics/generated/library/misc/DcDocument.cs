//
// DcDocument.cs
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

namespace ecologylab.semantics.generated.library.misc 
{
	[SimplInherit]
	public class DcDocument : CompoundDocument
	{
		[SimplScalar]
		private MetadataString subject;

		public DcDocument()
		{ }

		public DcDocument(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Subject
		{
			get{return subject;}
			set
			{
				if (this.subject != value)
				{
					this.subject = value;
					this.RaisePropertyChanged( () => this.Subject );
				}
			}
		}
	}
}