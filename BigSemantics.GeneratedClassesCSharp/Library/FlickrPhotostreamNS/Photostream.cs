//
// Photostream.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.FlickrPhotoPostNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.FlickrPhotostreamNS 
{
	/// <summary>
	/// All flickr photos of a particular user
	/// </summary>
	[SimplInherit]
	public class Photostream : RichDocument
	{
		/// <summary>
		/// Collection of all images of a user
		/// </summary>
		[SimplCollection("flickr_photo")]
		[MmName("stream")]
		private List<FlickrPhoto> stream;

		public Photostream()
		{ }

		public Photostream(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<FlickrPhoto> Stream
		{
			get{return stream;}
			set
			{
				if (this.stream != value)
				{
					this.stream = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
