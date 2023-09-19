package Graph;

public class GraphMain {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		
		graph.addVertex('A');	// 0
		graph.addVertex('B');	// 1
		graph.addVertex('C');	// 2
		graph.addVertex('D');	// 3
		graph.addVertex('E');	// 4
		
		graph.addEdge(0, 1);	// AB
		graph.addEdge(1, 2);	// BC
		graph.addEdge(0, 3);	// AD
		graph.addEdge(3, 4);	// DE
		
		graph.adjacencyMatrix();
		System.out.println();
		
		Graph Lat6 = new Graph(4);
		Lat6.addVertex('A');	// 0
		Lat6.addVertex('B');	// 1
		Lat6.addVertex('C');	// 2
		Lat6.addVertex('D');	// 3
		
		graph.addEdge(0, 1);	// AB
		graph.addEdge(0, 2);	// AC
		graph.addEdge(0, 3);	// AD
		graph.addEdge(1, 3);	// BD
	}

}
