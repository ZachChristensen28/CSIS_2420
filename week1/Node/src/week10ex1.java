
import java.util.*;
import java.io.*;

public class week10ex1 {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);
		TreeSet<String> setB = new TreeSet<String>(wordList);
		TreeSet<String> setC;
		TreeSet<String> setD;
		TreeSet<String> setE;
		Iterator<String> it;

		it = setA.iterator();

		System.out.println("setA starts with this many elments: " + setA.size());

		while (it.hasNext()) {
			if (cond(it.next())) {
				it.remove();
			}
		}

		System.out.println("setA after selecting words that start with a, b, c, d: " + setA.size());
		it = setB.iterator();

		System.out.println("setB starts with this many elements: " + setB.size());

		while (it.hasNext()) {
			if (cond2(it.next())) {
				it.remove();
			}
		}

		System.out.println("setB after selecting words that start with c, d, e, f: " + setB.size());

		setC = union(setA, setB); 
		System.out.println("setC, the union: " + setC.size());
		
	}

	public static boolean cond(String str) {
		String a = str.substring(0, 1);
		return (!(a.compareToIgnoreCase("a") == 0 || a.compareToIgnoreCase("b") == 0 || a.compareToIgnoreCase("c") == 0
				|| a.compareToIgnoreCase("d") == 0));
	}

	public static boolean cond2(String str) {
		String a = str.substring(0, 1);
		return (!(a.compareToIgnoreCase("c") == 0 || a.compareToIgnoreCase("d") == 0 || a.compareToIgnoreCase("e") == 0
				|| a.compareToIgnoreCase("f") == 0));
	}

	/*
	 * @Param TreeSet<String>
	 * 
	 * See matching values between two sets
	 */

	public static TreeSet<String> intersection(TreeSet<String> A, TreeSet<String> B) {
		TreeSet<String> Acopy = A; // Good programming practice. (Not changing input values)
		TreeSet<String> Bcopy = B;

		Acopy.retainAll(Bcopy);
		return Acopy;
	}
	
	/*
	 * difference
	 */
	public static TreeSet<String> difference(TreeSet<String> A, TreeSet<String> B) {
		TreeSet<String> Acopy = A;
		
		Acopy.removeAll(B);
		return Acopy;
	}
	
	/*
	 * Union
	 */
	public static TreeSet<String> union(TreeSet<String> A, TreeSet<String> B) {
		TreeSet<String> Acopy = A;
		
		Acopy.containsAll(B);
		return Acopy;
	}
}
