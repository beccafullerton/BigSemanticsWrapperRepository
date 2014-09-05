//
// AskNatureFunction.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.AskNatureFunctionNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.AskNatureFunctionNS 
{
	[SimplInherit]
	public class AskNatureFunction : RichDocument
	{
		[SimplScalar]
		private MetadataString groupId;

		[SimplScalar]
		private MetadataString subgroupId;

		[SimplScalar]
		private MetadataString functionId;

		[SimplCollection("ask_nature_strategy")]
		[MmName("strategies")]
		private List<AskNatureStrategy> strategies;

		public AskNatureFunction()
		{ }

		public AskNatureFunction(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString GroupId
		{
			get{return groupId;}
			set
			{
				if (this.groupId != value)
				{
					this.groupId = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString SubgroupId
		{
			get{return subgroupId;}
			set
			{
				if (this.subgroupId != value)
				{
					this.subgroupId = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString FunctionId
		{
			get{return functionId;}
			set
			{
				if (this.functionId != value)
				{
					this.functionId = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<AskNatureStrategy> Strategies
		{
			get{return strategies;}
			set
			{
				if (this.strategies != value)
				{
					this.strategies = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
