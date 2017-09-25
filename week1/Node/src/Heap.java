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
 * A. Place it in the correct position.
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

}
