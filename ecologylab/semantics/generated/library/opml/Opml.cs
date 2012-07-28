//
// Opml.cs
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
using ecologylab.semantics.generated.library.opml;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.opml 
{
	[SimplInherit]
	public class Opml : CompoundDocument
	{
		[SimplComposite]
		[MmName("head")]
		private Head head;

		[SimplComposite]
		[MmName("body")]
		private Body body;

		public Opml()
		{ }

		public Opml(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Head Head
		{
			get{return head;}
			set
			{
				if (this.head != value)
				{
					this.head = value;
					this.RaisePropertyChanged( () => this.Head );
				}
			}
		}

		public Body Body
		{
			get{return body;}
			set
			{
				if (this.body != value)
				{
					this.body = value;
					this.RaisePropertyChanged( () => this.Body );
				}
			}
		}
	}
}