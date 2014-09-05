﻿using System;
using Ecologylab.BigSemantics.Generated.Library.PrimitivesNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Simpl.Serialization;

namespace Ecologylab.BigSemantics.Generated
{
    public class RichArtifactsTypeScope
    {
        public const string ScopeName = "rich_artifacts_scope";

        protected static readonly Type[] Translations =
            {
                typeof (RichArtifact<>),
                typeof (Clipping<>),
                typeof (ImageClipping),
                typeof (TextClipping),
                typeof (VideoClipping),
                typeof (ImageSelfmade),
                typeof (TextSelfmade),
                typeof (WebVideo),
                typeof (HtmlText),
                typeof (Image),
                typeof (Video),
                typeof (Audio)
            };

        public static SimplTypesScope Get()
        {
            return SimplTypesScope.Get(ScopeName, Translations);
        }
    }
}
