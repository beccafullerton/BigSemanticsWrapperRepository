//
//  MomaList.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 04/01/11.
//  Copyright 2011 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using Simpl.Serialization.Attributes;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;


namespace ecologylab.semantics.generated.library.artwork 
{
	/// <summary>
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[SimplDescriptorClasses(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[SimplInherit]
	public class MomaList : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[SimplCollection("moma_artwork")]
		[SimplNoWrap]
		[MmName("artworks")]
		private List<MomaArtwork> artworks;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL nextList;

		public MomaList()
		{ }

		public List<MomaArtwork> Artworks
		{
			get{return artworks;}
			set{artworks = value;}
		}

		public MetadataParsedURL NextList
		{
			get{return nextList;}
			set{nextList = value;}
		}
	}
}