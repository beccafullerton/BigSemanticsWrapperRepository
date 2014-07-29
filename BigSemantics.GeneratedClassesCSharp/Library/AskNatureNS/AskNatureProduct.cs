//
// AskNatureProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.AskNatureNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.AskNatureNS 
{
	[SimplInherit]
	public class AskNatureProduct : CompoundDocument
	{
		[SimplComposite]
		[MmName("image")]
		private Image image;

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


		public Image Image
		{
			get{return image;}
			set
			{
				if (this.image != value)
				{
					this.image = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

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