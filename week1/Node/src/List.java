/*
 * Simple Linked List
 */
public class List {
	private Node firstNode;
	private Node lastNode;
	private String name;
	private int counter;

	public List() {
		name = "default list";
		firstNode = lastNode = null;
	}

	public List(String name) {
		setName(name);
		firstNode = lastNode = null;
	}

	public List(String name, Node firstNode) {
		setName(name);
		setFirstNode(firstNode);
		lastNode = null;
	}

	public List(String name, Node firstNode, Node lastNode) {
		setList(name, firstNode, lastNode);
	}

	public void setList(String name, Node firstNode, Node lastNode) {
		setName(name);
		setFirstNode(firstNode);
		setLastNode(lastNode);
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

	/*
	 * Check for Empty List
	 */
	public boolean isEmpty() {
		return (firstNode == null);
	}

	/*
	 * Insert Item at Front
	 * 
	 * @param Object
	 */
	public void insertAtFront(Object insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		} else {
			firstNode = new Node(insertItem, firstNode);
		}
	}

	/*
	 * Insert Item at Back
	 * 
	 * @param Object
	 */
	public void insertAtBack(Object insertItem) {
		counter++;
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		} else {
			lastNode.setNext(new Node(insertItem));
			lastNode = lastNode.getNext();
		}
	}

	/*
	 * Remove from front of list
	 * 
	 * @return Object
	 */
	public Object removeFromFront() {
		Object removeItem = null;
		if (isEmpty()) {
			removeItem = "This List is empty.";
			return removeItem;
		}
		removeItem = firstNode.getObject();
		if (firstNode.equals(lastNode)) {
			firstNode = lastNode = null;
		} else {
			firstNode = firstNode.getNext();
		}
		return removeItem;
	}

	/*
	 * Remove from Back of list
	 * 
	 * @return Object
	 */
	public Object removeFromBack() {
		Object removeItem = null;
		if (isEmpty()) {
			removeItem = "This List is empty.";
			return removeItem;
		}
		removeItem = lastNode.getObject();
		if (firstNode.equals(lastNode)) {
			firstNode = lastNode = null;
		} else {
			Node current = firstNode;
			Node before = null;
			while (current.getNext() != null) {
				before = current;
				current = current.getNext();
			}
			before.setNext(current.getNext());
			lastNode = before;
		}
		return removeItem;
	}
	/*
	 * prints the count
	 */
	public String printCount() {
		//counter is global private variable
		return "Number of elements: " + counter;
	}
	/*
	 * Print List
	 * 
	 * @return String
	 */
	public String print() {
		String result = "";
		String newLine = "\n";
		if (isEmpty()) {
			result += name + " is Empty" + newLine;
			return result;
		}
		Node current = firstNode;
		while (current != null) {
			result += current.getObject() + newLine;
			current = current.getNext();
		}
		return result;
	}
}
