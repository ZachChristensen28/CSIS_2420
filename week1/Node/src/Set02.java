/*
 * TreeSets will give unique values and sort them
 */
import java.io.*;
import java.util.*;

public class Set02 {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> ts = new TreeSet<String>(wordList);

		for (String s : ts) {
			System.out.println(s);
		}
		System.out.println("Our set has this many elements: " + ts.size());
	}

}
