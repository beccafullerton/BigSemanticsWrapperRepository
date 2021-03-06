//
// YahooMediaRss.cs
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
	/// <summary>
	/// News feeds.
	/// </summary>
	[SimplInherit]
	public class YahooMediaRss : Dc
	{
		[SimplComposite]
		[MmName("media_content")]
		private MediaContent mediaContent;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		private MetadataString mediaDescription;

		public YahooMediaRss()
		{ }

		public YahooMediaRss(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MediaContent MediaContent
		{
			get{return mediaContent;}
			set
			{
				if (this.mediaContent != value)
				{
					this.mediaContent = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString MediaDescription
		{
			get{return mediaDescription;}
			set
			{
				if (this.mediaDescription != value)
				{
					this.mediaDescription = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
