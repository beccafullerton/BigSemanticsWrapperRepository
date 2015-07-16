//
// VimeoList.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	[SimplInherit]
	public class VimeoList : RichDocument
	{
		[SimplCollection("rich_document")]
		[MmName("links")]
		private List<RichDocument> links;

		public VimeoList()
		{ }

		public VimeoList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<RichDocument> Links
		{
			get{return links;}
			set
			{
				if (this.links != value)
				{
					this.links = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}