/*
 * ADT for a queue:
 * enqueue
 * dequeue
 * isEmpty
 * peek?
 * 
 * _____________insecure way______________
*/
public class Queue extends List {
	
	public Queue () {
		super("my queue");
	}
	/*
	 * inserts queue at back of list
	 */
	public void enqueue (Object obj){
		super.insertAtBack(obj);
	}
	/*
	 * Removes queue from front of list
	 */
	public Object dequeue () {
		if(isEmpty()) {
			return null;
		}
		return super.removeFromFront();
	}
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	/*
	 * Remove following method when done
	 */
	public String print() {
		return super.print();
	}
}
