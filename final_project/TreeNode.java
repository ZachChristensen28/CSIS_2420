
public class TreeNode {
	private String key;
	private TreeNode left;
	private TreeNode right;

	/*
	 * One Argument Constructor
	 */
	public TreeNode (String key) {
		this.key = key;
		left = right = null;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
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
