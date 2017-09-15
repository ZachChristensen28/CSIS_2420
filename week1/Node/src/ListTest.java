
import java.math.*;

public class ListTest {

	public static void main(String[] args) {
		
		/*Character ch = new Character('$');
		BigInteger bi1 = new BigInteger("111111111111111111111111111111111111");
		BigInteger bi2 = new BigInteger("222222222222222222222222222222222222");
		BigInteger bi3 = new BigInteger("333333333333333333333333333333333333");
		
		List myList = new List();
		
		//Insert At Front
		myList.insertAtFront(ch);
		myList.insertAtFront(bi1);
		myList.insertAtFront(bi2);
		myList.insertAtFront(bi3);
		
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		myList.removeFromFront();
		System.out.println(myList.print());
		
		//Insert At Back
		myList.insertAtBack(ch);
		myList.insertAtBack(bi1);
		myList.insertAtBack(bi2);
		myList.insertAtBack(bi3);
		
		//Remove from back
		System.out.println(myList.print());
		myList.removeFromBack();
		System.out.println(myList.print());
		myList.removeFromBack();
		System.out.println(myList.print());
		myList.removeFromBack();
		System.out.println(myList.print());
		myList.removeFromBack();
		System.out.println(myList.print());*/
		
		//list squares
		List zachsList = new List();
		
		for(int i = 1; i < 101; i++) {
			int x = i * i;
			zachsList.insertAtBack(x);
		}
		
		//System.out.println(zachsList.print());
		
		//First node = last node
	/*	zachsList.getLastNode().setNext(zachsList.getFirstNode());
		System.out.println(zachsList.print()); */
		
		//Counter
		System.out.println(zachsList.printCount());
	}

}
