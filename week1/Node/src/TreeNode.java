/* NOTES
 * Linear data structures
 * Arrays
 * Lists
 * Stacks
 * Queues
 * 
 * Binary Search Tree: one of the no-linear data structures.
 * Others:
 * Hash Tables
 * Heaps
 * Graphs
*/ 
/*
 * The purpose of the data structures is to store data
 * In a BST we sort on the keys, but there will be some data associated with a given key.
 * 
 * This could be a very complicated record
 */
public class TreeNode {
	private int key;
	private TreeNode left;
	private TreeNode right;
	//private Record myRecord;
	
	/*
	 * One Argument Constructor
	 * @param int
	 */
	public TreeNode (int key) {
		this.key = key;
		left = right = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	
}
