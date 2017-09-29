
public class StringTest {
	public static void main (String[] args) {
		String [] a = {"From","its","founding","in","1897,","Southern","Utah","University",
		"has","evolved","from","a","teacher","training","institution","to","now","becoming",
		"Utah's","designated"};
		
		StringTree myTree = new StringTree(a[0]);
		
		System.out.println("The root node is \""+a[0]+"\"");
		
		for (int i =1; i<=a.length-1; i++) {
			System.out.println("inserting \"" + a[i]+"\"");
			myTree.insertNode(myTree.root, a[i]);
		}

		System.out.println();
		System.out.println("After inOrderTraversal");
		
		long startTime = System.currentTimeMillis();
		myTree.inOrderTraversal(myTree.root);
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
}
