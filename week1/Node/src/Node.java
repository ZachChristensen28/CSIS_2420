
public class Node {

	private Object data;
	private Node next; // self referential
	
	
	public Node (Object obj) {
		setObject(obj);
		this.next = null;
	}
	
	public Node (Object obj, Node next) {
		setObject(obj);
		setNext(next);
	}

	public Object getObject() {
		return data;
	}

	public void setObject(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

