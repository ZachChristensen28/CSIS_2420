/**
 * 
 * @author zacharychristensen
 *
 */
public class TreeNodeTest {

	public static void main(String[] args) {
		
		int key1 = 1000;
		int key2 = 2000;
		int key3 = 3000;
		
		TreeNode child1 = new TreeNode(key1);
		TreeNode root = new TreeNode(key2);
		TreeNode child2 = new TreeNode(key3);
		
		root.setLeft(child1);
		root.setRight(child2);
		
		System.out.println("Root: " + root.getKey());
		System.out.println("Left: " + root.getLeft().getKey());
		System.out.println("Right: " + root.getRight().getKey());
	}

}
