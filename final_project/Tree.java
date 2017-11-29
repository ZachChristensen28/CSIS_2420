
public class Tree {

	public TreeNode root;

	public Tree(String key) {
		root = new TreeNode(key);
	}

	public void insertNode(TreeNode t, String d) {
		if (d.compareTo(t.getKey()) < 0) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNode(d));
			} else {
				insertNode(t.getLeft(), d); // recursive call
			}
		} else if (d.compareTo(t.getKey()) > 0) {
			if (t.getRight() == null) {
				t.setRight(new TreeNode(d));
			} else {
				insertNode(t.getRight(), d);
			}
		}
	}

	// One of the most powerful algorithms you ever see
	public void inOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}

	public String search(TreeNode node, String find) {
		String result;

		if (find.compareTo(node.getKey()) == 0) {
			result = "Found " + node.getKey();
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
			result = "no String Found";
		}
		return result;
	}
}
