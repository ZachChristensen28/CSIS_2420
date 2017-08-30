
public class Node {

	private Object data;
	private Node next; // self referential
	
	
	public Node (Object obj) {
		setData(obj);
		this.next = null;
	}
	
	public Node (Object obj, Node next) {
		setData(obj);
		setNext(next);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
