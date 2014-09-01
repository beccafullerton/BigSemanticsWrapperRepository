//
// Forever21.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ProductNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.Forever21ProductNS 
{
	[SimplInherit]
	[SimplTag("forever_21")]
	public class Forever21 : Product
	{
		[SimplCollection("rich_document")]
		[MmName("available_colors")]
		private List<RichDocument> availableColors;

		public Forever21()
		{ }

		public Forever21(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<RichDocument> AvailableColors
		{
			get{return availableColors;}
			set
			{
				if (this.availableColors != value)
				{
					this.availableColors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
