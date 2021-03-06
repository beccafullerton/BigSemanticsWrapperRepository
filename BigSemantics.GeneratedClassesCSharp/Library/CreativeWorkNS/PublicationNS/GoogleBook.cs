//
// GoogleBook.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	[SimplInherit]
	public class GoogleBook : Book
	{
		[SimplCollection("rich_document")]
		[MmName("purchase_links")]
		private List<RichDocument> purchaseLinks;

		public GoogleBook()
		{ }

		public GoogleBook(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<RichDocument> PurchaseLinks
		{
			get{return purchaseLinks;}
			set
			{
				if (this.purchaseLinks != value)
				{
					this.purchaseLinks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
