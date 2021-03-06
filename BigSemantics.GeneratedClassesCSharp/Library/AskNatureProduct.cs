//
// AskNatureProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class AskNatureProduct : RichDocument
	{
		[SimplScalar]
		private MetadataString company;

		[SimplScalar]
		private MetadataString productPhase;

		[SimplScalar]
		private MetadataString explanation;

		[SimplScalar]
		private MetadataString challengesSolved;

		[SimplScalar]
		private MetadataString differencesFromExistingProducts;

		[SimplCollection("ask_nature_strategy")]
		[MmName("inspiring_strategies")]
		private List<AskNatureStrategy> inspiringStrategies;

		[SimplScalar]
		private MetadataString biomimicryStory;

		public AskNatureProduct()
		{ }

		public AskNatureProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Company
		{
			get{return company;}
			set
			{
				if (this.company != value)
				{
					this.company = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ProductPhase
		{
			get{return productPhase;}
			set
			{
				if (this.productPhase != value)
				{
					this.productPhase = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Explanation
		{
			get{return explanation;}
			set
			{
				if (this.explanation != value)
				{
					this.explanation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ChallengesSolved
		{
			get{return challengesSolved;}
			set
			{
				if (this.challengesSolved != value)
				{
					this.challengesSolved = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DifferencesFromExistingProducts
		{
			get{return differencesFromExistingProducts;}
			set
			{
				if (this.differencesFromExistingProducts != value)
				{
					this.differencesFromExistingProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<AskNatureStrategy> InspiringStrategies
		{
			get{return inspiringStrategies;}
			set
			{
				if (this.inspiringStrategies != value)
				{
					this.inspiringStrategies = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString BiomimicryStory
		{
			get{return biomimicryStory;}
			set
			{
				if (this.biomimicryStory != value)
				{
					this.biomimicryStory = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
