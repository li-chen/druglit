package info.chenli.druglit;

import java.io.File;

public class Stat {

	public void compute() {

		int nframes = 0;
		int nwords = 0;
		File output_file = null;

		const Gal_Object *frames = Gal_GetList(database, ":values", &nframes);
		Gal_Object *wordlist = gather_words(frames, nframes, &nwords);
		/* this counts N-1 every time the word occurs on a list */
		int *wordcounts = gather_word_counts(frames, nframes, wordlist, nwords); 

		  fill_word_pairs(frames, nframes, wordlist, nwords);
		  convert_pairs_to_list(wordlist, nwords);

		  /* Compared to the probability that this pair would have shown up together by chance */
		  compute_pair_probs(wordlist, wordcounts, nwords, count_threshold);
		  Gal_Object triples = NULL;
		  Gal_Object quads = NULL;
		  Gal_Object triple_words = NULL;
		  Gal_Object quad_groups = NULL;
		  if(ratio_threshold) {
		    triples = find_triples(wordlist, nwords, ratio_threshold);
		    triple_words = rank_order_words_in_triples (triples);
		    quads = find_quads(wordlist, nwords, ratio_threshold);
		    quad_groups = form_quad_groups(quads); 
		  }
		  Gal_Frame frame = Gal_MakeFrame("pairs", GAL_CLAUSE);
		  Gal_SetProp(frame, ":summary_list", Gal_ListObject(wordlist, nwords));
		  if(triples) Gal_SetProp(frame, ":triples", triples);
		  if(triple_words) Gal_SetProp(frame, ":triple_words", triple_words);
		  if(quads) Gal_SetProp(frame, ":quad_words", quads);
		  if(quad_groups) Gal_SetProp(frame, ":quad_groups", quad_groups);
		  fpout = fopen (outfile, "w");
		  Gal_PPFrameToFile(frame, fpout);
		  fclose(fpout);

	}
}
