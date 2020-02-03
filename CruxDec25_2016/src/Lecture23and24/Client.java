package Lecture23and24;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g = new Graph();

		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");

		// System.out.println(g.numVertices());

		g.addEdge("A", "B", 10);
		g.addEdge("A", "D", 40);
		g.addEdge("C", "D", 10);
		g.addEdge("B", "C", 10);
		g.addEdge("D", "E", 2);
		g.addEdge("E", "F", 8);
		g.addEdge("F", "G", 3);
		g.addEdge("E", "G", 3);

		// System.out.println(g.numEdges());
		//
		// g.display();
		// System.out.println(g.hasPath("A", "G"));
		// System.out.println("************************************");
		// g.removeEdge("D", "E");
		// g.display();
		// System.out.println(g.hasPath("A", "G"));

		// g.bft();
		// g.dft();

		// System.out.println(g.isConnected());
		// g.removeEdge("D", "E");
		// System.out.println(g.isConnected());

		// System.out.println(g.gcc());
		// g.removeEdge("D", "E");
		// System.out.println(g.gcc());

		// System.out.println(g.isBipartite());
		System.out.println(g.isAcyclic());
		g.removeEdge("E", "F");
		g.removeEdge("C", "D");
		// System.out.println(g.isBipartite());
		System.out.println(g.isAcyclic());

		System.out.println(g.isTree());
	}

}
