
public class TreeNodeString {
	private String key;
	private TreeNodeString left;
	private TreeNodeString right;
	//private Record myRecord;
	
	/*
	 * One Argument Constructor
	 * @param int
	 */
	public TreeNodeString (String key) {
		this.key = key;
		left = right = null;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public TreeNodeString getLeft() {
		return left;
	}

	public void setLeft(TreeNodeString left) {
		this.left = left;
	}

	public TreeNodeString getRight() {
		return right;
	}

	public void setRight(TreeNodeString right) {
		this.right = right;
	}
}
