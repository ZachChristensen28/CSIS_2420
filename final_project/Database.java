
public class Database {

	public static void main(String[] args) {
		int size = 3;
		int[] id = new int[size];
		String[] name = new String[size];
		int[] rate = new int[size];

		/*populate database */
		for(int i = 0; i < size; i++) {
			id[i] = i;
		}

		for(int i = 0; i < size -1; i++) {
			int x = (int)(Math.random()*1000);
			String s = "Friend" + x;
			name[i] = s;
		}
		name[size-1] = "Zach";

		for(int i = 0; i < size; i++) {
			int x = (int)(Math.random()* 5 + 1);
			rate[i] = x;
		}

		/* Print database */
		/*System.out.println("Database:");
		System.out.printf("%-15s%4s%17s", "FRIEND_ID", "FRIEND_NAME", "FRIEND_RATING");
		System.out.println();
		for(int i = 0; i < size; i++) {
			System.out.printf("%-25d%4s%20d%n", id[i], name[i], rate[i]);
		}
		*/
		/**
		 * Slow search method
		 */
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
			String s = "Zach";
			if(s.compareTo(name[i]) == 0) {
				System.out.println("Found Zach at row: " + i);
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");

		System.out.println("Indexing using a Binary Search Tree");
		Tree myTree = new Tree(name[0]);
		System.out.println("The root node is \"" + name[0] + "\"");

		/* Insert into tree */
		for (int i =1; i <= size - 1; i++) {
			myTree.insertNode(myTree.root, name[i]);
		}

		myTree.inOrderTraversal(myTree.root);

		System.out.println("Search Results: " + myTree.search(myTree.root, "Zach"));

	}

}
