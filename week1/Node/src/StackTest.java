import java.math.BigInteger;

/**
 * 
 * @author zacharychristensen
 *
 */
public class StackTest {

	public static void main(String[] args) {
		
		Character ch = new Character('$');
		BigInteger bi = new BigInteger("1111111111111111111111111111111111111111");
		
		Stack stackObj = new Stack();
		
		stackObj.push(ch);
		stackObj.push(bi);
		
		System.out.println(stackObj.print());
		
		stackObj.pop();
		
		System.out.println(stackObj.print());

	}

}
