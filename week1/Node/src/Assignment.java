
/**
 * 
 * @author Zach Christensen
 * @version 11/10/2017
 *
 */
import java.io.*;
import java.util.*;

public class Assignment {

	public static void main(String[] args) throws IOException {

		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> wordSet = new TreeSet<String>(wordList);

		Iterator<String> iterator = wordSet.iterator();
		TreeSet<String> setA = new TreeSet<String>();
		while (iterator.hasNext()) {
			String x = iterator.next();
			if (setACondition(x)) {
				setA.add(x);
			}
		}

		Iterator<String> it = wordSet.iterator();
		TreeSet<String> setB = new TreeSet<String>();
		while (it.hasNext()) {
			String e = it.next();
			if (setBCondition(e)) {
				setB.add(e);
			}
		}

		/*
		 * Difference
		 */
		TreeSet<String> differenceAB = difference(setA, setB);
		System.out.println("setA size: " + setA.size() + ", setB size: " + setB.size() + ", difference size: "
				+ differenceAB.size());

		/*
		 * Union
		 */
		TreeSet<String> unionAB = union(setA, setB);
		System.out.println(
				"setA size: " + setA.size() + ", setB size: " + setB.size() + ", union size: " + unionAB.size());

		/*
		 * Intersection
		 */
		TreeSet<String> intersectionAB = intersection(setA, setB);
		System.out.println("setA size: " + setA.size() + ", setB size: " + setB.size() + ", intersection size: "
				+ intersectionAB.size());
	}

	/*
	 * Conditions
	 */
	public static boolean setACondition(String str) {
		return (str.length() < 8);
	}

	public static boolean setBCondition(String str) {
		return (str.length() > 3);
	}

	public static TreeSet<String> union(TreeSet<String> treeSetIn, TreeSet<String> treeSet2In) {

		TreeSet<String> aCopy = new TreeSet<String>(treeSetIn);
		TreeSet<String> bCopy = new TreeSet<String>(treeSet2In);
		TreeSet<String> union = aCopy;
		union.addAll(bCopy);

		return union;
	}

	public static TreeSet<String> intersection(TreeSet<String> treeSet, TreeSet<String> treeSet2) {

		TreeSet<String> aCopy = new TreeSet<String>(treeSet);
		TreeSet<String> bCopy = new TreeSet<String>(treeSet2);
		TreeSet<String> intersection = aCopy;
		intersection.retainAll(bCopy);

		return intersection;
	}

	public static TreeSet<String> difference(TreeSet<String> treeSet, TreeSet<String> treeSet2) {

		TreeSet<String> aCopy = new TreeSet<String>(treeSet);
		TreeSet<String> bCopy = new TreeSet<String>(treeSet2);
		TreeSet<String> difference = aCopy;
		difference.removeAll(bCopy);

		return difference;
	}
}
