//
// BingSearchApi.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.SearchNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.BingSearchNS 
{
	/// <summary>
	/// The bing Search api.
	/// </summary>
	[SimplInherit]
	public class BingSearchApi : Search<RichDocument>
	{
		[SimplComposite]
		[MmName("search_crumb_composite")]
		private SearchCrumb searchCrumbComposite;

		public BingSearchApi()
		{ }

		public BingSearchApi(MetaMetadataCompositeField mmd) : base(mmd) { }


		public SearchCrumb SearchCrumbComposite
		{
			get{return searchCrumbComposite;}
			set
			{
				if (this.searchCrumbComposite != value)
				{
					this.searchCrumbComposite = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
