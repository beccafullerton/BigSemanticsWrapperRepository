//
// AcmPortalAuthorPublicationDetail.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.AcmAuthorNS 
{
	[SimplInherit]
	public class AcmPortalAuthorPublicationDetail : Metadata
	{
		[SimplScalar]
		private MetadataString publicationCount;

		[SimplScalar]
		private MetadataString citationCount;

		[SimplScalar]
		private MetadataString years;

		public AcmPortalAuthorPublicationDetail()
		{ }

		public AcmPortalAuthorPublicationDetail(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString PublicationCount
		{
			get{return publicationCount;}
			set
			{
				if (this.publicationCount != value)
				{
					this.publicationCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CitationCount
		{
			get{return citationCount;}
			set
			{
				if (this.citationCount != value)
				{
					this.citationCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Years
		{
			get{return years;}
			set
			{
				if (this.years != value)
				{
					this.years = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
