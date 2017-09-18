
public class StringTree {
private TreeNodeString root;
	
	public StringTree(String key) {
		root = new TreeNodeString(key);
	}

	public TreeNodeString getRoot() {
		return root;
	}
	
	/*
	 * Insert Node
	 */
	public void insertNode(TreeNodeString t, String d) {
		if(d.compareTo(t.getKey())) {
		
		}
	}
	
	/*
	 * Traverse the entire tree
	 */
	public void inOrderTraversal(TreeNodeString node) {
		if(node == null) {
			return ;
		}
		inOrderTraversal(node.getLeft());
		System.out.println(node.getKey() + " ");
		inOrderTraversal(node.getRight());
	}
}
