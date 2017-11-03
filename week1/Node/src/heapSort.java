/**
 * collection classes: you can write code in only a few lines that does a lot of work.
 * 
 */

import java.io.*;
import java.util.*;

public class heapSort {
	public static void main (String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		java.util.Queue<String> queue = new PriorityQueue<String>(wordList);
		
		
		while (!queue.isEmpty()) { //Heap Sort
			System.out.println(queue.poll());
		}
	}
}
