package info.chenli.druglit.util;

/**
 * This utility for computing <a
 * href="http://en.wikipedia.org/wiki/Levenshtein_distance">Levenshtein
 * Distance</a> takes code from
 * http://en.wikibooks.org/wiki/Algorithm_Implementation
 * /Strings/Levenshtein_distance#Java .
 * 
 * @author Chen Li
 *
 */
public class LevenshteinDistance {

	private int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	/**
	 * Calculates the similarity (a number within 0 and 1) between two strings.
	 */
	public double similarity(String s1, String s2) {

		String longer = s1, shorter = s2;

		if (s1.length() < s2.length()) { // longer should always have greater
											// length
			longer = s2;
			shorter = s1;
		}
		int longerLength = longer.length();
		if (longerLength == 0) {
			return 0; /* both strings are zero length */
		}

		return (longerLength - computeLevenshteinDistance(longer, shorter))
				/ (double) longerLength;

	}

	public int computeLevenshteinDistance(String str1, String str2) {

		int[][] distance = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0; i <= str1.length(); i++)
			distance[i][0] = i;
		for (int j = 1; j <= str2.length(); j++)
			distance[0][j] = j;

		for (int i = 1; i <= str1.length(); i++)
			for (int j = 1; j <= str2.length(); j++)
				distance[i][j] = minimum(
						distance[i - 1][j] + 1,
						distance[i][j - 1] + 1,
						distance[i - 1][j - 1]
								+ ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0
										: 1));

		return distance[str1.length()][str2.length()];
	}

	public static void main(String[] args) {

		LevenshteinDistance ld = new LevenshteinDistance();

		System.out.println(ld.computeLevenshteinDistance(args[0], args[1]));
		System.out.println(ld.similarity(args[0], args[1]));
	}
}