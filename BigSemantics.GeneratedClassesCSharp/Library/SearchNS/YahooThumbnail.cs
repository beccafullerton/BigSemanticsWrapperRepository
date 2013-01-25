//
// YahooThumbnail.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SearchNS 
{
	[SimplInherit]
	public class YahooThumbnail : Metadata
	{
		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("Url")]
		private MetadataParsedURL thumbUrl;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("Width")]
		private MetadataInteger width;

		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeaf})]
		[SimplTag("Height")]
		private MetadataInteger height;

		public YahooThumbnail()
		{ }

		public YahooThumbnail(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL ThumbUrl
		{
			get{return thumbUrl;}
			set
			{
				if (this.thumbUrl != value)
				{
					this.thumbUrl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Width
		{
			get{return width;}
			set
			{
				if (this.width != value)
				{
					this.width = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Height
		{
			get{return height;}
			set
			{
				if (this.height != value)
				{
					this.height = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}