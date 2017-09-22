
public class QueueSecure {
	private List l;
	
	public QueueSecure () {
		l = new List("my queue");
	}
	/*
	 * inserts queue at back of list
	 */
	public void enqueue (Object obj){
		l.insertAtBack(obj);
	}
	/*
	 * Removes queue from front of list
	 */
	public Object dequeue () {
		if(isEmpty()) {
			return null;
		}
		return l.removeFromFront();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
	}
	/*
	 * Remove following method when done
	 */
	public String print() {
		return l.print();
	}
	/**
	 * Peek Method
	 */
	public Object peek() {
		return l.getFirstNode().getObject();
	}
}
