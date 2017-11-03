
import java.io.IOException;
import java.util.*;

public class Week9FileToString03 {

	public static void main(String[] args) throws IOException {
		/*
		 * Calls no arg constructor with default file of awmt.txt
		 */
		Week9Utilities util = new Week9Utilities();
		util.fileToString();
		String str = util.cleanText();
		String[] wordArray = str.split(" ");
		for (String s : wordArray) {
			System.out.println(s);
		}

		/**
		 * Priority Queue
		 */
		java.util.List<String> wordList = Arrays.asList(wordArray);
		PriorityQueue<String> pq = new PriorityQueue<String>(wordList);

		pq.add("Hello Zach");
		System.out.println("Peeking " + pq.peek());
		System.out.println("Size " + pq.size());
		Object a = "test";
		if (pq.contains(a)) {
			System.out.println("file contains " + a);
		} else {
			System.out.println("file does not contain " + a);
		}
		pq.remove("Hello Zach");
		pq.clear();
		System.out.println("Size " + pq.size());

		/**
		 * Array List
		 */
		java.util.List<String> wordList2 = Arrays.asList(wordArray);
		ArrayList<String> ar = new ArrayList<String>(wordList2);
		ar.contains("test");
		ar.remove(200);
		ar.clear();
		if (ar.isEmpty()) {
			System.out.println("Oh no! It's empty");
		}

		/*
		 * SUU Public Meetings Policy
		 */
		Week9Utilities suu = new Week9Utilities("./suuPublic.txt");
		suu.fileToString();
		String str2 = suu.cleanText();
		String[] wordArray2 = str2.split(" ");
		int count = 0;
		;
		for (String s : wordArray2) {
			System.out.println(s);
			count++;
		}
		System.out.println("There are " + count + " real words in this file");

	}
}
