/**
 * 
 * Graphs: Model relationships
 * 
 * Df. An undirected graph consists of elements called vertices and a set of
 * unordered pairs called edges(lines). Df. Two vertices are adjacent if they
 * form an edge. Dr. A Graph is complete if all the vertices are adjacent. Df. A
 * path is a sequence of vertices s.t. consecutive vertices are adjacent. Df. A
 * circuit is a closed path. Df. A graph is connected if there is a path from
 * any vertex to any other. Df. A node whose removal would disconnect the rest
 * of the graph is called an articulation point. Df. An edge(line) whose removal
 * would disconnect the rest of the graph is called a bridge. Df. The number of
 * edges incident to a vertex is called the degree of that vertex. Df. A
 * spanning tree of a graph is a minimal set of edges that keep the graph
 * connected. Df. A network is a graph with weighted edges(lines).
 * 
 * Mileage map is an example of a network: -Nodes: Locations -Edges: Roads
 * -Weights: Number of miles between two locations
 * 
 * Representing graphs in computers: 1. Adjacency matrix -Use with not many
 * vertices, and a lot of edges. (<10,000 vertices) 2. Adjacency List -Use with
 * many vertices, and few edges.
 * 
 * Df. A dense graph has a lot of edges relative to the number of vertices. Df.
 * A sparse graph has a relatively large number of vertices with small average
 * degree.
 * 
 * The Web Graph (Google makes billions by doing this) -Vertices: Web Pages (10
 * billion) -Edges: Links between pages (10) **this is a sparse graph
 * 
 * If we use adj. matrix: 10^10 * 10^10 * 1 = 10^20 bytes. 10 million terabyte
 * drives
 * 
 * If we use an adj. list: -10^10 * 10 * 1 = 10^11. One Drive
 * 
 * Df. Directed graphs consist of vertices and directed edges.
 * 
 * Df. The shortest path from A to B in a weighted graph is the path with the
 * least weight.
 *
 */
public class Graph {
	private int maxVerts = 20;
	private Vertex vertexList[];
	private int nVerts;
	private int adjMat[][];

	public Graph() {
		vertexList = new Vertex[maxVerts];
		adjMat = new int[maxVerts][maxVerts];
		nVerts = 0;

		for (int i = 0; i < maxVerts; i++) {
			for (int j = 0; j < maxVerts; j++) {
				adjMat[i][j] = 0;
			}
		}
	}

	public void addVertex(String label) {
		vertexList[nVerts++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void displayVertices() {
		System.out.println("Here are the vertices: ");

		for (int i = 0; i < nVerts; i++) {
			System.out.println(vertexList[i].getLabel());
		}
	}

	public void displayEdges() {
		System.out.println("Here are the edges:");

		for (int i = 0; i < nVerts; i++) {
			for (int j = 0; j < nVerts; j++) {
				if (adjMat[i][j] == 1) {
					System.out.println(vertexList[i].getLabel() + " -- " + vertexList[j].getLabel());
				}
			}
		}
	}
}
