
public class Tree {
	public TreeNode root;

	/**
	 * Two argument Constructor
	 * 
	 * @param String
	 * @param Object
	 */
	public Tree(String key, Object value) {
		root = new TreeNode(key, value);
	}

	public void insertNode(TreeNode t, String d, Object value) {
		if (d.compareTo(t.getKey()) < 0) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNode(d, value));
			} else {
				insertNode(t.getLeft(), d, value); // recursive call
			}
		} else if (d.compareTo(t.getKey()) > 0) {
			if (t.getRight() == null) {
				t.setRight(new TreeNode(d, value));
			} else {
				insertNode(t.getRight(), d, value);
			}
		}
	}

	/**
	 * In Order Traversal
	 * 
	 * @param TreeNode
	 */
	public void inOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}

	/**
	 * Search
	 * 
	 * @param TreeNode
	 * 
	 * @param String
	 */
	public void search(TreeNode node, String find) {
		String result = "";

		if (find.compareTo(node.getKey()) == 0) {
			result = "Found " + node.getKey() + " at row: " + node.getValue();
		} else {
			if (find.compareTo(node.getKey()) < 0) {
				if (node.getLeft() != null) {
					search(node.getLeft(), find);
				}
			} else {
				if (node.getRight() != null) {
					search(node.getRight(), find);
				}
			}
		}
		System.out.print(result);
	}
}
