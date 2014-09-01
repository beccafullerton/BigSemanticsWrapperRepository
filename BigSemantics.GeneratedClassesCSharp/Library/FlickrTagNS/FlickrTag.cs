//
// FlickrTag.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.FlickrPhotoPostNS;
using Ecologylab.Semantics.Generated.Library.FlickrTagNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.FlickrTagNS 
{
	/// <summary>
	/// For flickr crawled tags
	/// </summary>
	[SimplInherit]
	public class FlickrTag : RichDocument
	{
		/// <summary>
		/// Collection of all images of a user
		/// </summary>
		[SimplCollection("flickr_photo")]
		[MmName("photos")]
		private List<FlickrPhoto> photos;

		[SimplComposite]
		[MmName("public_tags")]
		private FlickrTag publicTags;

		public FlickrTag()
		{ }

		public FlickrTag(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<FlickrPhoto> Photos
		{
			get{return photos;}
			set
			{
				if (this.photos != value)
				{
					this.photos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public FlickrTag PublicTags
		{
			get{return publicTags;}
			set
			{
				if (this.publicTags != value)
				{
					this.publicTags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
