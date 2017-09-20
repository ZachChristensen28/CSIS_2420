
public class StringHash {

	public static void main(String[] args) {
		String s1 = "Zebra";
		String s2 = "Antelope";
		int a;
		int myHash = 0;
		int length = s1.length();
		
		System.out.println("The Java hashcode for the string " + s1 + " is: " + s1.hashCode());
		
		/*
		 * manual hash code function
		 */
		for(int i = 0; i < length; i++) {
			a = (int)(s1.charAt(i));
			myHash += a*(int)(Math.pow(31, (length - 1 - i)));
		}
		System.out.println(myHash);
	}

}
