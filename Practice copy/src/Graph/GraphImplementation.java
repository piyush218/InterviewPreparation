package Graph;

public class GraphImplementation {

	public static void main(String[] args) {
		Graph myGraph = new Graph();
		myGraph.addVertex('A');
		myGraph.addVertex('B');
		myGraph.addVertex('C');
		myGraph.addVertex('D');
		myGraph.addVertex('E');
		
		myGraph.addEdge(0, 1);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(0, 3);
		myGraph.addEdge(3, 4);
		
		System.out.println("DFS Visit: ");
		myGraph.dfs();
		System.out.println();
		
		System.out.println("BFS Visit: ");
		myGraph.bfs();
		System.out.println();
		
		System.out.println("Min. Spanning Tree: ");
		myGraph.mst();
		System.out.println();
	}

}
