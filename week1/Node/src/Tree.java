
public class Tree {

	private TreeNode root;

	public Tree(int key) {
		root = new TreeNode(key);
	}

	public TreeNode getRoot() {
		return root;
	}

	/*
	 * Insert Node
	 */
	public void insertNode(TreeNode t, int d) {
		if (d < t.getKey()) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNode(d));
			} else {
				insertNode(t.getLeft(), d);
			}
		} else if (d > t.getKey()) {
			if (t.getRight() == null) {
				t.setRight(new TreeNode(d));
			} else {
				insertNode(t.getRight(), d);
			}
		}
	}

	/*
	 * Traverse the entire tree
	 */
	public void inOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}

	/*
	 * Maximum value in the tree
	 */
	public void max(TreeNode node, int max) {
		if (node == null) {
			System.out.println("The max value in the tree is: " + max);
			return;
		}
		max(node.getRight(), node.getKey());
	}

	/*
	 * Minimum value in the tree
	 * 
	 * @param TreeNode {node}
	 * 
	 * @param min {int}
	 */
	public void min(TreeNode node, int min) {
		if (node == null) {
			System.out.println("The min value in the tree is: " + min);
			return;
		}
		min(node.getLeft(), node.getKey());
	}

	/**
	 * Find Key Method
	 * 
	 * @return boolean
	 */
	public boolean findKey(TreeNode t, int key) {
		if (key == t.getKey()) {
			return true;
			
		} else {
			if(key < t.getKey()) {
				if(t.getLeft() == null) {
				} else {
					findKey(t.getLeft(), key);
				}
			} else {
				if(t.getRight() == null) {
					return false;
				} else {
					findKey(t.getRight(), key);
				}
			}
			return false;
		}
	}
}
/*
 * 
 * 1. Add a find(key) method to the (integer) Tree class which returns true if
 * the key is in the Tree and false if key is not in the tree (Hint: most of the
 * code you need is in insertNode()).
 */
