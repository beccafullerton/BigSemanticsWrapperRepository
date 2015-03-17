//
// Periodical.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	/// <summary>
	/// An issue of a periodical.
	/// </summary>
	[SimplInherit]
	public class Periodical : BasicPublication
	{
		/// <summary>
		/// All the issues of a periodical.
		/// </summary>
		[SimplComposite]
		[MmName("archive")]
		private RichDocument archive;

		[SimplScalar]
		private MetadataString volume;

		[SimplScalar]
		private MetadataString issue;

		/// <summary>
		/// Publication Date
		/// </summary>
		[SimplScalar]
		private MetadataDate date;

		public Periodical()
		{ }

		public Periodical(MetaMetadataCompositeField mmd) : base(mmd) { }


		public RichDocument Archive
		{
			get{return archive;}
			set
			{
				if (this.archive != value)
				{
					this.archive = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Volume
		{
			get{return volume;}
			set
			{
				if (this.volume != value)
				{
					this.volume = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Issue
		{
			get{return issue;}
			set
			{
				if (this.issue != value)
				{
					this.issue = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate Date
		{
			get{return date;}
			set
			{
				if (this.date != value)
				{
					this.date = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
