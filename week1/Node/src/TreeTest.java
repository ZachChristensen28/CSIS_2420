/**
 * 
 * @author zacharychristensen
 *
 */
public class TreeTest {

	public static void main(String[] args) {
		
		int n;
		Tree myTree = new Tree(500);
		
		for (int i = 1; i <= 100; i++) {
			n = (int)(Math.random()*1000);
			System.out.println(n + " ");
			myTree.insertNode(myTree.getRoot(), n);
		}
		
		System.out.println("\n" + myTree.getRoot().getKey());
	}

}
