
import java.math.*;

public class ListTest {

	public static void main(String[] args) {
		
		Character ch = new Character('$');
		BigInteger bi1 = new BigInteger("111111111111111111111111111111111111");
		BigInteger bi2 = new BigInteger("222222222222222222222222222222222222");
		BigInteger bi3 = new BigInteger("333333333333333333333333333333333333");
		
		List myList = new List();
		
		myList.insertAtFront(ch);
		myList.insertAtFront(bi1);
		myList.insertAtFront(bi2);
		myList.insertAtFront(bi3);
		myList.insertAtBack(ch);
		
		System.out.println(myList.print());
		
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
	}

}
