import java.math.BigInteger;

public class BigFactorial {

	public static void main(String[] args) {
		int n = 1000;
		BigInteger one = BigInteger.ONE;
		BigInteger counter = BigInteger.ZERO;
		BigInteger value = one;
		
		for (int i = 1; i <= n; i++) {
			counter = counter.add(one);
			value = value.multiply(counter);
		}
		
		System.out.println(n + " Factorial = " + value);

	}

}
