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
 * Depth First Search (DFS)
 * rule 0 {
 * 	1. Pick any vertex as starting point.
 * 	2. 'visitIt', 'markIt'
 * 	3. Push its label onto a stack
 * }
 * rule 1 {
 * 	If possible, visit an unvisited adj. vertex, 'markIt' & push its label onto a stack.
 * }
 * rule 2 {
 * 	If you can't follow rule 1, then, if possible, pop a vertex of the stack.
 * }
 * rule 3 {
 * 	If you can't follow rule 1 or 2, you're done.
 */
public class GraphTest {

	public static void main(String[] args) {
		Graph myGraph = new Graph();

		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		myGraph.addVertex("E");
		myGraph.addVertex("F");
		myGraph.addVertex("G");
		myGraph.addVertex("H");

		myGraph.addEdge(0, 1);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(0, 3);
		myGraph.addEdge(3, 4);
		myGraph.addEdge(3, 5);

		myGraph.displayVertices();
		myGraph.displayEdges();
	}

}
