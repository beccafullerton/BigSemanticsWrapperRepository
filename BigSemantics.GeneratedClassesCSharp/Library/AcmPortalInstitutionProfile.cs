//
// AcmPortalInstitutionProfile.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class AcmPortalInstitutionProfile : RichDocument
	{
		[SimplComposite]
		[MmName("home_page")]
		private RichDocument homePage;

		public AcmPortalInstitutionProfile()
		{ }

		public AcmPortalInstitutionProfile(MetaMetadataCompositeField mmd) : base(mmd) { }


		public RichDocument HomePage
		{
			get{return homePage;}
			set
			{
				if (this.homePage != value)
				{
					this.homePage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}