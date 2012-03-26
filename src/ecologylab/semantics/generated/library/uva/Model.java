package ecologylab.semantics.generated.library.uva;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.uva.TopicCluster;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Model extends Metadata
{
	@simpl_collection("topic_cluster")
	@mm_name("topic_clusters")
	private List<TopicCluster> topicClusters;

	public Model()
	{ super(); }

	public Model(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<TopicCluster> getTopicClusters()
	{
		return topicClusters;
	}

  // lazy evaluation:
  public List<TopicCluster> topicClusters()
  {
    if (topicClusters == null)
      topicClusters = new ArrayList<TopicCluster>();
    return topicClusters;
  }

  // addTo:
  public void addToTopicClusters(TopicCluster element)
  {
    topicClusters().add(element);
  }

  // size:
  public int topicClustersSize()
  {
    return topicClusters == null ? 0 : topicClusters.size();
  }

	public void setTopicClusters(List<TopicCluster> topicClusters)
	{
		this.topicClusters = topicClusters;
	}
}
