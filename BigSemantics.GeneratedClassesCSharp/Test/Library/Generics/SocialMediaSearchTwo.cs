//
// SocialMediaSearchTwo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.Test.Library.Generics;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Test.Library.Generics 
{
	[SimplInherit]
	public class SocialMediaSearchTwo<SR> : GeneralSearch<Document> where SR : SocialMediaSearchResultForTest
	{
		public SocialMediaSearchTwo()
		{ }

		public SocialMediaSearchTwo(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
