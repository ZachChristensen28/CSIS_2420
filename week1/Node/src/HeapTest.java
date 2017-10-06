
public class HeapTest {

	public static void main(String[] args) {
		int size = 31;
		MinHeap myHeap = new MinHeap(size);
		int key;
		
		for(int i = 0; i < size; i++) {
			key = (int)(Math.random()*1000);
			myHeap.insert(key);
		}
		/*System.out.println("Descending Order:");
		for(int i = 0; i < size; i++) {
			System.out.print(myHeap.remove() + " ");
		}*/
		System.out.println("Ascending Order:");
		for(int i = 0; i < size; i++) {
			System.out.print(myHeap.HeapSort() + " ");
		}
	}
}
