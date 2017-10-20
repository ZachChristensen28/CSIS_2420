import java.util.*;
public class LinkedListHomework {

	public static void main(String[] args) {
		LinkedList<Integer> myList1 = new LinkedList<Integer>(); // Specify which <object> will be in the Linked List
		LinkedList<Integer> myList2 = new LinkedList<Integer>();
		LinkedList<Integer> myList3 = new LinkedList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			myList1.addFirst(i * i);
			myList2.addLast(i * i);
		}
		
		System.out.println("addFirst:");
		for(Integer i : myList1) {
			System.out.println(i);
		}
		
		System.out.println("\n addLast:");
		for(Integer i : myList2) {
			System.out.println(i);
		}
		
		myList1.clear();
		System.out.println("\n clear:");
		for(Integer i : myList1) {
			System.out.println(i);
		}
		
		myList2.get(8);

	}

}
