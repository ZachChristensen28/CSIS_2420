/**
 * 
 * @author zacharychristensen
 *
 */
public class TreeTest {

	public static void main(String[] args) {
		
		int n;
		Tree myTree = new Tree(4);
		
		for (int i = 1; i < 1000000; i++) {
			n = (int)(Math.random()*6);
			//System.out.println(n + " ");
			myTree.insertNode(myTree.getRoot(), n);
		}
		
		myTree.max(myTree.getRoot(), myTree.getRoot().getKey());
		myTree.min(myTree.getRoot(), myTree.getRoot().getKey());
		
		/*if(myTree.findKey(myTree.getRoot(), 5) == true) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}*/
		
		boolean x = myTree.findKey(myTree.getRoot(), 5);
		
		if(x) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		
		
		
		//System.out.println(myTree.getRoot().getKey());
		
/*		System.out.println("inOrderTraversal");

		long start = System.currentTimeMillis();
		myTree.inOrderTraversal(myTree.getRoot());
		long end = System.currentTimeMillis();
		
		System.out.println("Total Time: " + (end - start) + "ms");*/
		
		
	}

}
