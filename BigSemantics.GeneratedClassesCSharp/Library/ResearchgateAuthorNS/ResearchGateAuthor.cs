//
// ResearchGateAuthor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.AuthorNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateArticleNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateAuthorNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateInstitutionDepartmentNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateInstitutionNS;
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

namespace Ecologylab.Semantics.Generated.Library.ResearchgateAuthorNS 
{
	[SimplInherit]
	public class ResearchGateAuthor : Author
	{
		[SimplComposite]
		[MmName("insitution")]
		private ResearchGateInstitution insitution;

		[SimplComposite]
		[MmName("department")]
		private ResearchGateInstitutionDepartment department;

		[SimplComposite]
		[MmName("stats")]
		private ResearchGateStats stats;

		[SimplCollection("research_gate_article")]
		[MmName("featured_publications")]
		private List<ResearchGateArticle> featuredPublications;

		[SimplCollection("research_gate_author")]
		[MmName("top_coauthors")]
		private List<ResearchGateAuthor> topCoauthors;

		[SimplCollection("skill")]
		[MmName("skills")]
		private List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> skills;

		public ResearchGateAuthor()
		{ }

		public ResearchGateAuthor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public ResearchGateInstitution Insitution
		{
			get{return insitution;}
			set
			{
				if (this.insitution != value)
				{
					this.insitution = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public ResearchGateInstitutionDepartment Department
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

		public ResearchGateStats Stats
		{
			get{return stats;}
			set
			{
				if (this.stats != value)
				{
					this.stats = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ResearchGateArticle> FeaturedPublications
		{
			get{return featuredPublications;}
			set
			{
				if (this.featuredPublications != value)
				{
					this.featuredPublications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ResearchGateAuthor> TopCoauthors
		{
			get{return topCoauthors;}
			set
			{
				if (this.topCoauthors != value)
				{
					this.topCoauthors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> Skills
		{
			get{return skills;}
			set
			{
				if (this.skills != value)
				{
					this.skills = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
