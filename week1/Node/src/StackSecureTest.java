import java.math.BigInteger;

/**
 * 
 * @author zacharychristensen
 *
 */
public class StackSecureTest {

	public static void main(String[] args) {
		
		/*Character ch = new Character('$');
		BigInteger bi = new BigInteger("1111111111111111111111111111111111");
		
		StackSecure ssObj = new StackSecure();
		
		ssObj.push(ch);
		ssObj.push(bi);
		
		System.out.println(ssObj.print());
		System.out.println("peeking at the top: " + ssObj.peek() + "\n");
		
		ssObj.pop();
		System.out.println(ssObj.print());
		ssObj.pop();
		System.out.println(ssObj.print());*/
		
		// Push 10 string onto stack
		StackSecure zachsStack = new StackSecure();
		
		System.out.println("Push Strings:");
		for(int i = 1; i < 11; i++) {
			String s = "String" + i;
			zachsStack.push(s);
			System.out.println(zachsStack.print());
		}
		//Peek
		System.out.println("Peeking into stack");
		System.out.println(zachsStack.peek() + "\n");
		
		
		/*// pops strings off stack
		System.out.println("Pop strings:");
		for(int i = 1; i < 11; i++) {
			zachsStack.pop();
			System.out.println(zachsStack.print());
		}		*/
	}
	
	

}
