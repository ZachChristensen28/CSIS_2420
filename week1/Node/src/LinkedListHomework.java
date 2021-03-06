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
		for (Integer i : myList1) {
			System.out.println(i);
		}

		System.out.println("\naddLast:");
		for (Integer i : myList2) {
			System.out.println(i);
		}

		myList1.clear();
		System.out.print("\nclear: myList1");
		for (Integer i : myList1) {
			System.out.println(i);
		}
		System.out.println("\nget: " + myList2.get(8));
		System.out.println("\ngetFirst: " + myList2.getFirst());
		System.out.println("\ngetLast: " + myList2.getLast());
		System.out.println("\nindexOf: " + myList2.indexOf(100));
		System.out.println("\npeek: " + myList2.peek());
		System.out.println("\npoll: " + myList2.poll());
		System.out.println("\npop: " + myList2.pop());
		myList2.push(500);
		System.out.println("\npush: ");
		for (Integer i : myList2) {
			System.out.println(i);
		}
		System.out.println("\nremoveFirst: " + myList2.removeFirst());
		System.out.println("\nremoveLast: " + myList2.removeLast());
		System.out.println("\nsize: " + myList2.size());
		System.out.println();
		
		/*
		 * Week 2 ex 3 list
		 */
		LinkedList<Integer> zachsList = new LinkedList<Integer>();
		
		for(int i = 1; i <= 100; i++) {
			int x = i * i;
			zachsList.addLast(x);
		}
		System.out.println("Printing Zachs Linked List, size: " + zachsList.size());
		for(Integer i : zachsList) {
			System.out.println(i);
		}
	}

}
