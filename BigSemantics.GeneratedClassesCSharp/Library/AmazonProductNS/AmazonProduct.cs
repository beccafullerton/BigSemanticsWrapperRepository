//
// AmazonProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.AmazonListNS;
using Ecologylab.BigSemantics.Generated.Library.ProductNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.AmazonProductNS 
{
	[SimplInherit]
	public class AmazonProduct : Product
	{
		[SimplComposite]
		[MmName("department")]
		private RichDocument department;

		[SimplComposite]
		[MmName("bestseller_list_rank")]
		private AmazonList bestsellerListRank;

		[SimplCollection("rich_document")]
		[MmName("list_mania")]
		private List<RichDocument> listMania;

		public AmazonProduct()
		{ }

		public AmazonProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public RichDocument Department
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

		public AmazonList BestsellerListRank
		{
			get{return bestsellerListRank;}
			set
			{
				if (this.bestsellerListRank != value)
				{
					this.bestsellerListRank = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> ListMania
		{
			get{return listMania;}
			set
			{
				if (this.listMania != value)
				{
					this.listMania = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
