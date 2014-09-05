//
// Periodical.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.BasicPublicationNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.PeriodicalNS 
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
		private Document archive;

		[SimplScalar]
		private MetadataString volumeAndIssue;

		/// <summary>
		/// Publication Date
		/// </summary>
		[SimplScalar]
		private MetadataDate date;

		public Periodical()
		{ }

		public Periodical(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Document Archive
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

		public MetadataString VolumeAndIssue
		{
			get{return volumeAndIssue;}
			set
			{
				if (this.volumeAndIssue != value)
				{
					this.volumeAndIssue = value;
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
