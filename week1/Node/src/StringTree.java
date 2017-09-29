
public class StringTree {
	public TreeNodeString root;

	public StringTree (String key) {
			root = new TreeNodeString(key);
		}

	public void insertNode(TreeNodeString t, String d) {
		if (d.compareTo(t.getKey()) < 0) {
			if (t.getLeft() == null) {
				t.setLeft(new TreeNodeString(d));
			} else {
				insertNode(t.getLeft(), d); // recursive call
			}
		} else if (d.compareTo(t.getKey()) > 0) {
			if (t.getRight() == null) {
				t.setRight(new TreeNodeString(d));
			} else {
				insertNode(t.getRight(), d);
			}
		}
	}

	// One of the most powerful algorithms you ever see
	public void inOrderTraversal(TreeNodeString node) {
		if (node == null) {
			return;
		}

		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey() + " ");
		inOrderTraversal(node.getRight());

	}
}
