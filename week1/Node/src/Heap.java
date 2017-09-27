/*
 * HEAP
 * 
 * 1. To implement priority queues.
 * 2. To implement a fast search algorithm.
 * 
 * Def. = A Heap is a binary tree with these properties:
 * A. It's complete. It is completely filled as far as possible. It's balanced. 
 * B. Each node satisfies the "heap" condition: if node x is below node y then its key is <= the key of y. 
 * 
 * When we INSERT values in the heap, we:
 * A. Place it in the correct position. (left to right)
 * B. If necessary, reheapify.
 * 
 *  We represent heaps with arrays. 
 *  
 *  Given index i, the index of its left child is: 2*i + 1
 *  The index of the right child: 2 * i + 2
 *  The index of its parent node is floor((i - 1)/2)
 *  
 *  HEAPSORT: 
 *  Pull off the max value and swap it with the last element in the heap.
 *  Move the pointer at the end of the heap to the left 1.
 *  Reheapify.
 *  Repeat until all values are processed.
 *  
 *  
 */
public class Heap {
	private int heapArray[];
	private int maxSize;
	private int currentSize;

	public Heap(int maxSize) {
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
		while (index > 0 && (heapArray[parent] < bottom)) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent - 1) / 2;
		}
		heapArray[index] = bottom;
	}

	public int remove() {
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

			if ((rightChild < currentSize) && (heapArray[leftChild] < heapArray[rightChild])) {
				largerChild = rightChild;
			} else {
				largerChild = leftChild;
			}
			if (top >= heapArray[largerChild]) {
				break;
			}
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;
	}
}
