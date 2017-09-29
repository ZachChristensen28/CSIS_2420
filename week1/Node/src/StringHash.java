
public class StringHash {

	public static void main(String[] args) {
		String[] names = { "josh", "Anna", "jeff", "theobald", "leet", "thom", "phil", "carls", "said",
				"courtney", "kevin", "cj", "kayd", "trav", "zach" };
		int primeNumber = 31;
		List[] hashTable = new List[primeNumber];
		int key;
		int value;

		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new List();
		}

		for (int i = 0; i < names.length; i++) {
			value = (int)(names[i].hashCode());
			key = (int)(value % primeNumber);
			hashTable[key].insertAtFront(value);
		}
		
		for(int i = 0; i < hashTable.length; i++) {
			System.out.println("index " + i + ": " + hashTable[i].print());
		}

		/*
		 * System.out.println("The Java hashcode for the string '" + example7 + "' is: "
		 * + example7.hashCode());
		 * 
		 * 
		 * manual hash code function
		 * 
		 * for (int i = 0; i < length; i++) { a = (int) (example7.charAt(i)); myHash +=
		 * a * ((int) (Math.pow(31, (length - 1 - i)))); } System.out.println(myHash);
		 */
	}

}
