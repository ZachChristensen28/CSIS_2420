/* ## Hash Tables ##
 * Extremely efficient method for implementing key-value pairs.
 * Operations it's good at: search, insert and delete
 * 
 * Direct Addressing:
 * 	Suppose SSN are used as the key at the DMV
 * 	Just set aside enough memory for 1 billion records.
 * 	Fill out their record and store it in the array index given by their ssn.
 * 	
 * 	Suppose our average record is 100KB.
 * 	10^9 * 10^5 bytes. Need 10^14 bytes. 
 * 	100 Hard drives needed each being 1TB in size. $20,000 is needed for the HDarray.
 * 
 * 	Suppose the DMV has 100,000 records. 10^5 versus 10^9. Only 1/10,000 of our space will be used.
 * 
 * Much Better Strategy:
 * -Pick a prime number (p) no more than twice the largest number of records we will use, and no less than 1.5.
 * -Create an array this big. When someone comes in with their ssn, we take it mod p.
 * -That will be the index for the record
 * 
 * 	Let p = 150,107
 * 
 * ex. ssn = 752 34 5679
 *  752 34 5679 mod 150,107 = result of the index
 * 
 */
/*
 * Collisions:
 * -When two keys hash to the same value.
 * fix: collision resolution by chaining
 * 
 * The hash function always uses mod for ints. Very fast
 */
public class HashTable {
	public static void main (String[] args) {
		int primeNumber = 157;
		List[] hashTable = new List[primeNumber];
		int key;
		int value;
		
		for(int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new List();
		}
		
		for(int i = 0; i < 101; i++) {
			value = (int)(Math.random()*1000000);
			key = value % primeNumber;
			hashTable[key].insertAtFront(value);
		}
		
		for(int i = 0; i < hashTable.length; i++) {
			System.out.println("index " + i + ": " + hashTable[i].print());
		}

/*		int max = Integer.MAX_VALUE;
		for (int i = (max - 1); (i - 10) < max; i++) {
			System.out.println(i);
		}
*/	}
}
