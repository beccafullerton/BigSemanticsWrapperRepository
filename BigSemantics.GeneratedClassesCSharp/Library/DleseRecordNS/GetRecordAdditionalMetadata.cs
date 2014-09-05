//
// GetRecordAdditionalMetadata.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.DleseRecordNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.DleseRecordNS 
{
	[SimplInherit]
	public class GetRecordAdditionalMetadata : AdditionalMetadata
	{
		[SimplScalar]
		private MetadataString realm;

		[SimplScalar]
		private MetadataString partOfDrc;

		[SimplScalar]
		private MetadataString accessionStatus;

		public GetRecordAdditionalMetadata()
		{ }

		public GetRecordAdditionalMetadata(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Realm
		{
			get{return realm;}
			set
			{
				if (this.realm != value)
				{
					this.realm = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PartOfDrc
		{
			get{return partOfDrc;}
			set
			{
				if (this.partOfDrc != value)
				{
					this.partOfDrc = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AccessionStatus
		{
			get{return accessionStatus;}
			set
			{
				if (this.accessionStatus != value)
				{
					this.accessionStatus = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
