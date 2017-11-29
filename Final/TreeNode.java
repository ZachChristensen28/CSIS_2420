public class TreeNode {
	private String key;
	private Object value;
	private TreeNode left;
	private TreeNode right;
	
	/**
	 * Two argument Constructor
	 * @param String
	 * @param Object
	 */
	public TreeNode (String key, Object value) {
		this.key = key;
		this.value = value;
		left = right = null;
	}

	/*
	 * Getters and Setters
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
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


