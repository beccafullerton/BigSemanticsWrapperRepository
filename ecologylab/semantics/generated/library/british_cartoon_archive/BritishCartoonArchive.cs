//
// BritishCartoonArchive.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.british_cartoon_archive 
{
	/// <summary>
	/// This MMD was initially generated by the browser authoring tool
	/// </summary>
	[SimplInherit]
	public class BritishCartoonArchive : Document
	{
		/// <summary>
		/// Name of the artist, and period he lived
		/// </summary>
		[SimplScalar]
		private MetadataString artist;

		/// <summary>
		/// Name of the publication in which the cartoon appeared
		/// </summary>
		[SimplScalar]
		private MetadataString publishedIn;

		/// <summary>
		/// Date of the publication
		/// </summary>
		[SimplScalar]
		private MetadataDate publicationDate;

		/// <summary>
		/// Format of the publication
		/// </summary>
		[SimplScalar]
		private MetadataString publicationFormat;

		/// <summary>
		/// Cartoon Caption
		/// </summary>
		[SimplScalar]
		private MetadataString caption;

		[SimplScalar]
		private MetadataString referenceNumber;

		/// <summary>
		/// url of the image
		/// </summary>
		[SimplScalar]
		private MetadataString imgLocation;

		public BritishCartoonArchive()
		{ }

		public BritishCartoonArchive(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Artist
		{
			get{return artist;}
			set
			{
				if (this.artist != value)
				{
					this.artist = value;
					this.RaisePropertyChanged( () => this.Artist );
				}
			}
		}

		public MetadataString PublishedIn
		{
			get{return publishedIn;}
			set
			{
				if (this.publishedIn != value)
				{
					this.publishedIn = value;
					this.RaisePropertyChanged( () => this.PublishedIn );
				}
			}
		}

		public MetadataDate PublicationDate
		{
			get{return publicationDate;}
			set
			{
				if (this.publicationDate != value)
				{
					this.publicationDate = value;
					this.RaisePropertyChanged( () => this.PublicationDate );
				}
			}
		}

		public MetadataString PublicationFormat
		{
			get{return publicationFormat;}
			set
			{
				if (this.publicationFormat != value)
				{
					this.publicationFormat = value;
					this.RaisePropertyChanged( () => this.PublicationFormat );
				}
			}
		}

		public MetadataString Caption
		{
			get{return caption;}
			set
			{
				if (this.caption != value)
				{
					this.caption = value;
					this.RaisePropertyChanged( () => this.Caption );
				}
			}
		}

		public MetadataString ReferenceNumber
		{
			get{return referenceNumber;}
			set
			{
				if (this.referenceNumber != value)
				{
					this.referenceNumber = value;
					this.RaisePropertyChanged( () => this.ReferenceNumber );
				}
			}
		}

		public MetadataString ImgLocation
		{
			get{return imgLocation;}
			set
			{
				if (this.imgLocation != value)
				{
					this.imgLocation = value;
					this.RaisePropertyChanged( () => this.ImgLocation );
				}
			}
		}
	}
}