/*
 * Traversal 
 * 
 * DFS: Depth First Search
 * BFS: Breadth First Search
 * 
 * used in these algorithms:
 * 1. Finding the connected components of a graph
 * 2. Finding the minimal spanning tree
 * 3. Finding the shortest distance between two points
 * 
 * 
 * Depth First Search (DFS) == Uses Stacks ==
 * rule 0 {
 * 	1. Pick any vertex as starting point.
 * 	2. 'visitIt', 'markIt'
 * 	3. Push its label onto a stack
 * }
 * rule 1 {
 * 	If possible, visit an unvisited adj. vertex, 'markIt' & push its label onto a stack.
 * }
 * rule 2 {
 * 	If you can't follow rule 1, then, if possible, pop a vertex off the stack.
 * }
 * rule 3 {
 * 	If you can't follow rule 1 or 2, you're done.
 * }
 * 
 * Breadth First Search (BFS)  == Uses Queues == 
 *  rule 0 {
 * 	1. Pick any vertex as starting point.
 * 	2. 'visitIt'
 * 	3. Make it current, MarkIt
 * }
 *  rule 1 {
 * 	If possible, visit an unvisited adj. vertex, 'markIt' push its label into a queue.
 * }
 * rule 2 {
 * 	If you can't follow rule 1, then, if possible, remove a vertex off the queue and make it current.
 * }
 *  rule 3 {
 * 	If you can't follow rule 1 or 2 because the queue is empty, you're done.
 * }
 * 
 * Computational complexity: How many steps are required by an algorithm?
 * 
 */
/**
 * 
 * @author Zach Christensen
 *
 */
public class GraphTest {

	public static void main(String[] args) {
		Graph myGraph = new Graph();

		myGraph.addVertex("A"); // 0
		myGraph.addVertex("B"); // 1
 		myGraph.addVertex("C"); // 2
		myGraph.addVertex("D"); // 3
		myGraph.addVertex("E"); // 4
		myGraph.addVertex("F"); // 5
		myGraph.addVertex("G"); // 6
		myGraph.addVertex("H"); // 7
		
		myGraph.addEdge(0, 1, 12); // [start][end][weight]
		myGraph.addEdge(0, 2, 3);
		myGraph.addEdge(0, 4, 6);
		myGraph.addEdge(1, 2, 15);
		myGraph.addEdge(1, 3, 5);
		myGraph.addEdge(1, 4, 5);
		myGraph.addEdge(2, 5, 18);
		myGraph.addEdge(3, 5, 4);
		myGraph.addEdge(3, 7, 19);
		myGraph.addEdge(4, 6, 22);
		myGraph.addEdge(5, 7, 10);
		myGraph.addEdge(6, 7, 3);

		myGraph.displayVertices();
		myGraph.displayEdges();
	}

}
