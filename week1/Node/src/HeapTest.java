
public class HeapTest {

	public static void main(String[] args) {
		int size = 31;
		Heap myHeap = new Heap(size);
		int key;
		
		for(int i = 0; i < size; i++) {
			key = (int)(Math.random()*1000);
			myHeap.insert(key);
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(myHeap.remove() + " ");
		}

	}

}
