
/*
 * TreeSets will give unique values and sort them
 */
import java.io.*;
import java.util.*;

public class week10ex5 {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> ts = new TreeSet<String>(wordList);
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		String key;
		Integer value;
		
		long start = System.currentTimeMillis();
		
		for (String s : ts) {
			key = s;
			value = 0;
			for (int i = 0; i < wordArray.length; i++) {
				if (s.compareTo(wordArray[i]) == 0) {
					value++;
				}
			}
			tm.put(key, value);
		}
		java.util.Set<String> allKeys = tm.keySet();
		Iterator<String> ki = allKeys.iterator();
		
		OrderedPair[] opArray = new OrderedPair[allKeys.size()];
		int index = 0;

		while (ki.hasNext()) {
			key = ki.next();
			value = tm.get(key);
			opArray[index++] = new OrderedPair(key, value);
		}
		
		java.util.List<OrderedPair> opList = Arrays.asList(opArray);
		Collections.sort(opList);
		Collections.reverse(opList);
		Object[] x = opList.toArray();
		System.out.println("Top Ten Frequencies:");
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ": " + x[i]);
		}
		//System.out.println("Frequency of your text in Descending Order");
		//System.out.println(opList);

	}

}
