/*
 * STACKS
 * 
 * Used in compilers, operating systems and is the basis for compound data structures
 * Last in First out (LIFO)
 * --Primary Methods--
 * -push something on to the stack
 * -pop something off
 * -isEmpty
 * -peek at the top element
 * --Abstract--
 * Abstract data type: push, pop, isEmpty
 * 
*/
public class Stack extends List {
	
	public Stack() {
		super("The Stack");
	}
	
	public void push(Object obj) {
		super.insertAtFront(obj);
	}
	
	public Object pop() {
		return super.removeFromFront();
	}
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	/*
	 * Temp print statement that needs to be removed
	 */
	public String print() {
		return super.print();
	}
}
