
/**
 * Test Driver for Java's Lined List Class
 * @author zach
 * 
 * @reference https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
 *
 */
import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> myList1 = new LinkedList<Integer>(); // Specify which <object> will be in the Linked List
		LinkedList<Integer> myList2 = new LinkedList<Integer>();
		LinkedList<Integer> myList3 = new LinkedList<Integer>();

		for (int i = 1; i <= 10; i++) {
			myList1.add(i * i);
			myList2.add(i * i * i);
		}

		for (Integer k : myList1) {
			System.out.println(k);
		}

		System.out.println();

		for (Integer k : myList2) {
			System.out.println(k);
		}

		System.out.println();

		myList3.addAll(myList1); // adds whole list
		myList3.addAll(myList2);

		for (Integer k : myList3) {
			System.out.println(k);
		}

		System.out.println();

		System.out.println("Does the first list contain the value 81? " + myList1.contains(81));
	}

}
