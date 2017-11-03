
/**	
 * Iterators and Filters
 * 
 * Iterator: an object capable of traversing an entire data structure
 * Filter: a boolean function that selects a subset of your data.
 */

import java.util.*;
import java.io.*;

public class Set03 {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		ArrayList<String> aL = new ArrayList<String>(wordList);

		System.out.println("aL starts with this many elments: " + aL.size());

		Iterator<String> it = aL.iterator();

		while (it.hasNext()) {
			if (cond(it.next())) {
				it.remove();
			}
		}

		for (String s : aL) {
			System.out.println(s);
		}

		System.out.println("aL now has " + aL.size() + " elements");
	}

	public static boolean cond(String str) {
		return (str.length() > 5);
	}
}
