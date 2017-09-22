/**
 * 
 * @author zacharychristensen
 *
 */
public class TreeTest {

	public static void main(String[] args) {
		
		int n;
		Tree myTree = new Tree(500000);
		
		for (int i = 1; i < 1000000; i++) {
			n = (int)(Math.random()*1000000000);
			//System.out.println(n + " ");
			myTree.insertNode(myTree.getRoot(), n);
		}
		
		myTree.max(myTree.getRoot(), myTree.getRoot().getKey());
		myTree.min(myTree.getRoot(), myTree.getRoot().getKey());
		
		
		
		
		
		
		//System.out.println(myTree.getRoot().getKey());
		
/*		System.out.println("inOrderTraversal");

		long start = System.currentTimeMillis();
		myTree.inOrderTraversal(myTree.getRoot());
		long end = System.currentTimeMillis();
		
		System.out.println("Total Time: " + (end - start) + "ms");*/
		
		
	}

}
