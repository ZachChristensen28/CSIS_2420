/*
 * Inheritance gives the user too much information
 * This could be a security nightmare
 * Instead, we need to be reusing by composition
 * The ADT for the stack includes push, pop, isEmpty
 * 
 */
public class StackSecure {
	/*
	 * Declare Private Lists and use only those methods we need.
	 */
	private List s;
	
	public StackSecure() {
		s  = new List("The Secure Stack");
	}
	
	public void push(Object obj) {
		s.insertAtFront(obj);
	}
	
	public Object pop() {
		return s.removeFromFront();
	}
	
	public boolean isEmpty() {
		return s.isEmpty();
	}
	
	public Object peek() {
		return s.getFirstNode().getObject();
	}
	
	/*
	 * Create for temp use
	 */
	public String print() {
		return s.print();
	}
	
}
