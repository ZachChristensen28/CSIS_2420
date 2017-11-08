
/*
 *  Binary to Decimal Conversion
 *  
 *  Using ArrayDeque as a stack
 */

import java.util.*;
import java.io.*;

public class binaryConversion {

	public static void main(String[] args) throws IOException {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		Scanner in = new Scanner(System.in);
		int n;
		int rem;

		while (true) {
			System.out.println("Enter a positive integer to convert");
			n = in.nextInt();

			System.out.println("The decimal number is: " + n);
			
			while (n != 0) {
				rem = n % 2;
				stack.push(rem);
				n = n / 2;
			}
			
			System.out.println("The corresponding binary number is: " + n);
			
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			
			System.out.println();
		}
	}

}
