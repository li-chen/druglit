package info.chenli.druglit;

import info.chenli.druglit.util.Clusterer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class DrugNameComparator {

	private static final Logger logger = Logger
			.getLogger(DrugNameComparator.class.getName());

	private List<Drug> drugs = null;
	private int threshold = 5;

	public DrugNameComparator(String file) {

		try {

			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();

			drugs = new ArrayList<Drug>();

			while (line != null) {

				Drug drug = new Drug();
				StringTokenizer st = new StringTokenizer(line, ",");
				drug.setName(st.nextToken().trim());
				drug.setEarlyCount(Integer.parseInt(st.nextToken().trim()));
				drug.setLateCount(Integer.parseInt(st.nextToken().trim()));
				drug.setLateEarlyRatio(Double.parseDouble(st.nextToken()));
				drugs.add(drug);

				line = br.readLine();
			}

		} catch (FileNotFoundException e) {

			logger.severe(e.getMessage());
			throw new RuntimeException(e);

		} catch (IOException e) {

			logger.severe(e.getMessage());
			throw new RuntimeException(e);
		}
	}

	public void cluster(List<Drug> drugs) {
		Clusterer cl = new Clusterer();
		Set<String> drugNames = new HashSet<String>();
		for (Drug drug : drugs) {
			if (!drugNames.contains(drug.getName())) {
				drugNames.add(drug.getName());
			}
		}

		Clusterer.completeLinkClusterer(drugNames, drugNames.size()/2);
	}

	static public void main(String[] args) {
		DrugNameComparator dnc = new DrugNameComparator("results/frequency_ratios.text");
		dnc.cluster(dnc.drugs);
	}
}
