/**
 * Final Project
 * 
 * @author Zachary Christensen
 * 
 * @version November 28th, 2017
 *
 */
public class testDriver {

	public static void main(String[] args) {
		int size = 10000000; // How many records in database
		String[] name = new String[size];
		
		Database myDb = new Database(size);
		myDb.populateDatabase();
		myDb.print();

		/**
		 * Slow search method
		 */
		System.out.println("Starting Slow Search:");
		long startTime = System.currentTimeMillis();
		myDb.slowSearch();
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
		System.out.println();

		/**
		 * Binary Search Tree
		 */
		// For inserting same table into BST
		for(int i = 0; i < size; i++) {
			String[] temp = myDb.getName();
			name[i] = temp[i];
		}
		System.out.println("Indexing using a Binary Search Tree");
		Tree myTree = new Tree(name[0], 0);
		System.out.println("The root node is \"" + name[0] + "\"");

		/* Insert into tree */
		for (int i = 1; i <= size - 1; i++) {
			myTree.insertNode(myTree.root, name[i], i);
		}

		// myTree.inOrderTraversal(myTree.root);
		System.out.println("Starting Binary Search: ");
		startTime = System.currentTimeMillis();
		myTree.search(myTree.root, "Zach");
		endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");

	}
}
