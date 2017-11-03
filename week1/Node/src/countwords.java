
/*
 * Count the frequency of words in our files
 * We create a map holding strings as keys and integers as values
 * 
 * Maps: key-> Value pairs
 * 
 * Brute force (NAIVE) algorithm: 
 * 1. Get a list of unique words using HashSet or TreeSet
 * 2. For each word in this list, go through the entire file and count how many times it occurs.
 * 3. Store this number along with the word in some kind of a map.
 * 	
 * 	Complexity:
 * 		As a function of the number of words in the text. 
 * 		-For every unique word, we need to go through the entire text. 
 * 		-Ex. the text we're using has 2112 unique words. We'd have to scan the entire text 2112 times.
 * 
 * Algorithm that requires us to just scan once:
 * 	MAP:
 * 1.Create an empty map. 
 * 2.Look at the words one by one. Is it in our map yet?
 * - if not, add the new word to our map along with the integer 1 (because we've seen it 1 time so far).
 * - if we have seen it, increment the number associated with it. 
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class countwords {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		String key;
		Integer value;
		Iterator<String> it = wordList.iterator();

		while (it.hasNext()) {
			key = it.next();
			value = tm.get(key);
			if (value == null) {
				tm.put(key, 1);
			} else {
				tm.put(key, value + 1);
			}
		}

		java.util.Set<String> allKeys = tm.keySet();
		Iterator<String> ki = allKeys.iterator();

		while (ki.hasNext()) {
			key = ki.next();
			value = tm.get(key);
			if (value > 50) {
				System.out.println(key + " -> " + value);
			}
		}
	}
}
