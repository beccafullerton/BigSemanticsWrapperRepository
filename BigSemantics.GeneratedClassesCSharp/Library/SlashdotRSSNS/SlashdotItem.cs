//
// SlashdotItem.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.ItemNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.SlashdotRSSNS 
{
	/// <summary>
	/// One item in a feed.
	/// </summary>
	[SimplInherit]
	public class SlashdotItem : Item
	{
		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		private MetadataString department;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		private MetadataString section;

		public SlashdotItem()
		{ }

		public SlashdotItem(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Department
		{
			get{return department;}
			set
			{
				if (this.department != value)
				{
					this.department = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Section
		{
			get{return section;}
			set
			{
				if (this.section != value)
				{
					this.section = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
