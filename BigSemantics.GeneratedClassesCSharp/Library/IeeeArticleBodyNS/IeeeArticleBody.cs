//
// IeeeArticleBody.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.IeeeArticleBodyNS;
using Ecologylab.BigSemantics.Generated.Library.ScholarlyArticleNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.IeeeArticleBodyNS 
{
	[SimplInherit]
	public class IeeeArticleBody : ScholarlyArticle
	{
		[SimplCollection("sections")]
		[MmName("sections")]
		private List<Sections> sections;

		public IeeeArticleBody()
		{ }

		public IeeeArticleBody(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Sections> Sections
		{
			get{return sections;}
			set
			{
				if (this.sections != value)
				{
					this.sections = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
