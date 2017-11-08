import java.io.*;
import java.util.*;

public class countwords02 {

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
		
		OrderedPair[] opArray = new OrderedPair[allKeys.size()];
		int index = 0;

		while (ki.hasNext()) {
			key = ki.next();
			value = tm.get(key);
			opArray[index++] = new OrderedPair(key, value);
		}
		
		java.util.List<OrderedPair> opList = Arrays.asList(opArray);
		Collections.sort(opList);
		System.out.println("Frequency of your text in Descending Order");
		System.out.println(opList);
	}
}
