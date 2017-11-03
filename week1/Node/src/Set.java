/**
 * a SET  is a collection of things that are unique
 * 
 * HashSets will give unique values unsorted
 */

import java.io.*;
import java.util.*;

public class Set {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		HashSet<String> hs = new HashSet<String>(wordList);
		
		
		for (String s : hs) { 
			System.out.println(s);
		}
	System.out.println("Our set has this many elements: " + hs.size());
	}

}
