import java.math.BigInteger;

public class NodeTest {

	public static void main(String[] args) {
		
		
		Character ch = new Character('$');
		BigInteger bi = new BigInteger("1234567891011121314151617181920");
		
		Node n1 = new Node(bi);
		Node n2 = new Node(ch, n1);
		
		for(int i = 99; i > 0; i--) {
			
		}
		
		System.out.println(n2.getObject());
		System.out.println(n1.getObject());
		System.out.println(n2.getNext().getObject());
	}
}
