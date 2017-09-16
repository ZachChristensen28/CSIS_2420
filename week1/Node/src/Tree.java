
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
		if(d < t.getKey()) {
			if(t.getLeft() == null) {
				t.setLeft(new TreeNode(d));
			} else {
				insertNode(t.getLeft(), d);
			}
		} else if(d > t.getKey()) {
			if(t.getRight() == null) {
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
		if(node == null) {
			return ;
		}
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}
}
