package info.chenli.druglit.util;

import java.util.Set;

import com.aliasi.cluster.CompleteLinkClusterer;
import com.aliasi.cluster.Dendrogram;
import com.aliasi.cluster.HierarchicalClusterer;
import com.aliasi.cluster.SingleLinkClusterer;
import com.aliasi.spell.EditDistance;
import com.aliasi.util.Distance;

public class Clusterer {

	private static int maxDistance = Integer.MAX_VALUE;
	static final Distance<CharSequence> EDIT_DISTANCE = new EditDistance(false);

	public static Set<Set<String>> singleLinkClusterer(Set<String> tokens, int k) {

		// Single-Link Clusterer
		HierarchicalClusterer<String> slClusterer = new SingleLinkClusterer<String>(
				maxDistance, EDIT_DISTANCE);

		// Hierarchical Clustering
		Dendrogram<String> slDendrogram = slClusterer
				.hierarchicalCluster(tokens);

		return slDendrogram.partitionK(k);
	}

	public static Set<Set<String>> completeLinkClusterer(Set<String> tokens, int k) {

		// Complete-Link Clusterer
		HierarchicalClusterer<String> clClusterer = new CompleteLinkClusterer<String>(
				maxDistance, EDIT_DISTANCE);

		Dendrogram<String> clDendrogram = clClusterer
				.hierarchicalCluster(tokens);
		System.out.println(clDendrogram.prettyPrint());

		return clDendrogram.partitionK(k);

//		// Dendrograms to Clusterings
//		System.out.println("\nComplete Link Clusterings");
//		for (int k = 1; k <= clDendrogram.size(); ++k) {
//			Set<Set<String>> clKClustering = clDendrogram.partitionK(k);
//			System.out.println(k + "  " + clKClustering);
//		}
//
//		System.out.println("\nSingle Link Clusterings");
//		for (int k = 1; k <= slDendrogram.size(); ++k) {
//			Set<Set<String>> slKClustering = slDendrogram.partitionK(k);
//			System.out.println(k + "  " + slKClustering);
//		}
//
//		Set<Set<String>> clClustering = clClusterer.cluster(inputSet);
//		System.out.println("\n\nComplete Link Clustering");
//		System.out.println(clClustering);
//
//		Set<Set<String>> slClustering = slClusterer.cluster(inputSet);
//		System.out.println("\nSingle Link Clustering");
//		System.out.println(slClustering);
//
	}

	public static void main(String[] args) {

		

	}
}