/*
 * Simple Linked List
 */
public class List {
	private Node firstNode;
	private Node lastNode;
	private String name;
	
	public List () {
		name = "default list";
		firstNode = lastNode = null;
	}
	
	public List (String name) {
		setName(name);
		firstNode = lastNode = null;
	}
	
	public List (String name, Node firtNode) {
		setName(name);
		setFirstNode(firtNode);
		lastNode = null;
	}
	
	public List (String name, Node firstNode, Node lastNode) {
		setNode(name, firstNode, lastNode);
	}
	
	public void setNode(String name, Node firstNode, Node lastNode) {
		setName(name);
		setFirstNode(firstNode);
		setLastNode(lastNode);
	}
	
	/*
	 *  Check for Empty List
	 */
	public boolean isEmpty() {
		return (firstNode == null);
	}
	
	/*
	 * Insert Item at Front
	 */
	public void insertAtFront(Object insertItem) {
		if(isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		} else {
			firstNode = new Node(insertItem, firstNode);
		}
		
	}
	
	public Node getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(Node firstNode) {
		this.firstNode = firstNode;
	}

	public Node getLastNode() {
		return lastNode;
	}

	public void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
