package ecologylab.bigsemantics.generated.library.researchgateArticle;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ResearchGateStats extends RichDocument
{
	@simpl_scalar
	private MetadataString publicationCount;

	@simpl_scalar
	private MetadataString views;

	@simpl_scalar
	private MetadataString downloads;

	@simpl_scalar
	private MetadataString citations;

	@simpl_scalar
	private MetadataString impactPoints;

	@simpl_scalar
	private MetadataString avgImpactPoints;

	@simpl_scalar
	private MetadataString memberCount;

	@simpl_scalar
	private MetadataString rgScore;

	public ResearchGateStats()
	{ super(); }

	public ResearchGateStats(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	publicationCount()
	{
		MetadataString	result = this.publicationCount;
		if (result == null)
		{
			result = new MetadataString();
			this.publicationCount = result;
		}
		return result;
	}

	public String getPublicationCount()
	{
		return this.publicationCount == null ? null : publicationCount().getValue();
	}

	public MetadataString getPublicationCountMetadata()
	{
		return publicationCount;
	}

	public void setPublicationCount(String publicationCount)
	{
		if (publicationCount != null)
			this.publicationCount().setValue(publicationCount);
	}

	public void setPublicationCountMetadata(MetadataString publicationCount)
	{
		this.publicationCount = publicationCount;
	}

	public MetadataString	views()
	{
		MetadataString	result = this.views;
		if (result == null)
		{
			result = new MetadataString();
			this.views = result;
		}
		return result;
	}

	public String getViews()
	{
		return this.views == null ? null : views().getValue();
	}

	public MetadataString getViewsMetadata()
	{
		return views;
	}

	public void setViews(String views)
	{
		if (views != null)
			this.views().setValue(views);
	}

	public void setViewsMetadata(MetadataString views)
	{
		this.views = views;
	}

	public MetadataString	downloads()
	{
		MetadataString	result = this.downloads;
		if (result == null)
		{
			result = new MetadataString();
			this.downloads = result;
		}
		return result;
	}

	public String getDownloads()
	{
		return this.downloads == null ? null : downloads().getValue();
	}

	public MetadataString getDownloadsMetadata()
	{
		return downloads;
	}

	public void setDownloads(String downloads)
	{
		if (downloads != null)
			this.downloads().setValue(downloads);
	}

	public void setDownloadsMetadata(MetadataString downloads)
	{
		this.downloads = downloads;
	}

	public MetadataString	citations()
	{
		MetadataString	result = this.citations;
		if (result == null)
		{
			result = new MetadataString();
			this.citations = result;
		}
		return result;
	}

	public String getCitations()
	{
		return this.citations == null ? null : citations().getValue();
	}

	public MetadataString getCitationsMetadata()
	{
		return citations;
	}

	public void setCitations(String citations)
	{
		if (citations != null)
			this.citations().setValue(citations);
	}

	public void setCitationsMetadata(MetadataString citations)
	{
		this.citations = citations;
	}

	public MetadataString	impactPoints()
	{
		MetadataString	result = this.impactPoints;
		if (result == null)
		{
			result = new MetadataString();
			this.impactPoints = result;
		}
		return result;
	}

	public String getImpactPoints()
	{
		return this.impactPoints == null ? null : impactPoints().getValue();
	}

	public MetadataString getImpactPointsMetadata()
	{
		return impactPoints;
	}

	public void setImpactPoints(String impactPoints)
	{
		if (impactPoints != null)
			this.impactPoints().setValue(impactPoints);
	}

	public void setImpactPointsMetadata(MetadataString impactPoints)
	{
		this.impactPoints = impactPoints;
	}

	public MetadataString	avgImpactPoints()
	{
		MetadataString	result = this.avgImpactPoints;
		if (result == null)
		{
			result = new MetadataString();
			this.avgImpactPoints = result;
		}
		return result;
	}

	public String getAvgImpactPoints()
	{
		return this.avgImpactPoints == null ? null : avgImpactPoints().getValue();
	}

	public MetadataString getAvgImpactPointsMetadata()
	{
		return avgImpactPoints;
	}

	public void setAvgImpactPoints(String avgImpactPoints)
	{
		if (avgImpactPoints != null)
			this.avgImpactPoints().setValue(avgImpactPoints);
	}

	public void setAvgImpactPointsMetadata(MetadataString avgImpactPoints)
	{
		this.avgImpactPoints = avgImpactPoints;
	}

	public MetadataString	memberCount()
	{
		MetadataString	result = this.memberCount;
		if (result == null)
		{
			result = new MetadataString();
			this.memberCount = result;
		}
		return result;
	}

	public String getMemberCount()
	{
		return this.memberCount == null ? null : memberCount().getValue();
	}

	public MetadataString getMemberCountMetadata()
	{
		return memberCount;
	}

	public void setMemberCount(String memberCount)
	{
		if (memberCount != null)
			this.memberCount().setValue(memberCount);
	}

	public void setMemberCountMetadata(MetadataString memberCount)
	{
		this.memberCount = memberCount;
	}

	public MetadataString	rgScore()
	{
		MetadataString	result = this.rgScore;
		if (result == null)
		{
			result = new MetadataString();
			this.rgScore = result;
		}
		return result;
	}

	public String getRgScore()
	{
		return this.rgScore == null ? null : rgScore().getValue();
	}

	public MetadataString getRgScoreMetadata()
	{
		return rgScore;
	}

	public void setRgScore(String rgScore)
	{
		if (rgScore != null)
			this.rgScore().setValue(rgScore);
	}

	public void setRgScoreMetadata(MetadataString rgScore)
	{
		this.rgScore = rgScore;
	}
}
