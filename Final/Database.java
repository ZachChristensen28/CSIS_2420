
public class Database {
	private int size;
	private int[] id;
	private String[] name;
	private int[] rate;

	/**
	 * Constructor
	 * 
	 * @param int
	 */
	public Database(int size) {
		setDatabase(size);
	}

	/**
	 * Set Database
	 * 
	 * @param int
	 */
	public void setDatabase(int size) {
		if (size > 0 && size <= 10000000) {
			this.size = size;
			this.id = new int[size];
			this.name = new String[size];
			this.rate = new int[size];
		} else {
			setDatabase(5);
		}
	}

	/**
	 * Populates Database
	 */
	public void populateDatabase() {
		for (int i = 0; i < size; i++) {
			id[i] = i;
		}

		for (int i = 0; i < size - 1; i++) {
			int x = (int) (Math.random() * 1000);
			String s = "Friend" + x;
			name[i] = s;
		}
		name[size - 1] = "Zach";

		for (int i = 0; i < size; i++) {
			int x = (int) (Math.random() * 5 + 1);
			rate[i] = x;
		}
	}

	/**
	 * Get Name
	 * 
	 * @return String
	 */
	public String[] getName() {
		return name;
	}

	/**
	 * Slow Search
	 */
	public void slowSearch() {
		for (int i = 0; i < size; i++) {
			String s = "Zach";
			if (s.compareTo(name[i]) == 0) {
				System.out.println("Found " + s + " at row: " + i);
				break;
			}
		}
	}

	/**
	 * Print
	 * 
	 * @exception Prints
	 *                database only if it is smaller than 10 records
	 */
	public void print() {
		if (size <= 10) {
			System.out.println("Printing Database:");
			System.out.printf("%-15s%4s%17s", "FRIEND_ID", "FRIEND_NAME", "FRIEND_RATING");
			System.out.println();
			for (int i = 0; i < size; i++) {
				System.out.printf("%-25d%4s%20d%n", id[i], name[i], rate[i]);
			}
			System.out.println();
		} else {
			System.out.println("Database too large to print.\n");
		}
	}
}
