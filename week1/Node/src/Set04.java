
import java.util.*;
import java.io.*;

/**
 * 
 * @author retupmoc
 */
public class Set04 {

	public static void main(String[] args) throws IOException {
		String[] wordArray = utilities.fileToStringArray("./awmt.txt");
		java.util.List<String> wordList = Arrays.asList(wordArray);
		TreeSet<String> setA = new TreeSet<String>(wordList);
		TreeSet<String> setB = new TreeSet<String>(wordList);
		TreeSet<String> setC;
		Iterator<String> it;

		it = setA.iterator();

		System.out.println("setA starts with this many elments: " + setA.size());

		while (it.hasNext()) {
			if (cond(it.next())) {
				it.remove();
			}
		}

		System.out.println("setA starafter applying the filter has this many elments: " + setA.size());
		it = setB.iterator();

		System.out.println("setB starts with this many elements: " + setB.size());

		while (it.hasNext()) {
			if (cond2(it.next())) {
				it.remove();
			}
		}

		System.out.println("setB starafter applying the filter has this many elments: " + setB.size());

		setC = intersection (setA, setB); // See matching values between two sets
		System.out.println("setC, the intersection of above is this big: " + setC.size());
	}

	public static boolean cond(String str) {
		return (str.length() > 5);
	}

	public static boolean cond2(String str) {
		return (str.length() < 3);
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

}
