public class MinHeap {
	private int heapArray[];
	private int maxSize;
	private int currentSize;

	public MinHeap(int maxSize) {
		this.maxSize = maxSize;
		currentSize = 0;
		heapArray = new int[maxSize];
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public boolean insert(int key) {
		if (currentSize == maxSize) {
			System.out.println("No room at the inn");
			return false;
		}
		heapArray[currentSize] = key;
		reHeapifyUp(currentSize++);
		return true;
	}

	public void reHeapifyUp(int index) {
		int parent = (index - 1) / 2;
		int bottom = heapArray[index];

		// This While Loop keeps shoving all the smaller values down.
		while (index > 0 && (heapArray[parent] > bottom)) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent - 1) / 2;
		}
		heapArray[index] = bottom;
	}

	public int HeapSort() {
		if (isEmpty()) {
			return -1;
		}
		int root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		reHeapifyDown(0);
		return root;
	}

	public void reHeapifyDown(int index) {
		int largerChild;
		int top = heapArray[index];
		int rightChild;
		int leftChild;

		while (index < currentSize / 2) {
			leftChild = 2 * index + 1;
			rightChild = 2 * index + 2;

			if ((rightChild < currentSize) && (heapArray[leftChild] > heapArray[rightChild])) {
				largerChild = rightChild;
			} else {
				largerChild = leftChild;
			}
			if (top <= heapArray[largerChild]) {
				break;
			}
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
}
