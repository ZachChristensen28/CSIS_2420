import java.math.BigInteger;

/**
 * 
 * @author zacharychristensen
 *
 */
public class StackSecureTest {

	public static void main(String[] args) {
		
		Character ch = new Character('$');
		BigInteger bi = new BigInteger("1111111111111111111111111111111111");
		
		StackSecure ssObj = new StackSecure();
		
		ssObj.push(ch);
		ssObj.push(bi);
		
		System.out.println(ssObj.print());
		System.out.println("peeking at the top: " + ssObj.peek() + "\n");
		
		ssObj.pop();
		System.out.println(ssObj.print());
		ssObj.pop();
		System.out.println(ssObj.print());
		

	}

}
