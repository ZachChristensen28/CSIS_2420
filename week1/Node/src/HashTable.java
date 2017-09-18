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
public class HashTable {
	
}
