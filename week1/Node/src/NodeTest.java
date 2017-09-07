/**
 * 
 * @author zacharychristensen
 *
 */
public class NodeTest {

	public static void main(String[] args) {

		Node n[] = new Node[101];

		for (int i = 100; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				int x = j * j;
				n[j] = new Node(x);
			}
			n[i].setNext(n[i - 1]);
		}
		System.out.println("Node 100: " + n[100].getObject());
		for (int i = 100; i > 1; i--) {
			int counter = i - 1;
			System.out.println("Node " + counter  + ": " + n[i].getNext().getObject());
		}
	}
}
