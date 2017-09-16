/**
 * 
 * @author zacharychristensen
 *
 */
public class NodeTest {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		
		Character ch = new Character('$');
		BigInteger bi = new BigInteger("1234567891011121314151617181920");
		
		Node n1 = new Node(ch);
		Node n2 = new Node(bi, n1);
		
		/*for(int i = 99; i > 0; i--) {
			new Node(ch);
		}*/
		
		System.out.println(n1.getObject());
		System.out.println(n2.getObject());
		System.out.println(n2.getNext().getObject());
=======

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
>>>>>>> e96d0db1670441ddb3c08ea799baf3cb2e2ccf40
	}
}
