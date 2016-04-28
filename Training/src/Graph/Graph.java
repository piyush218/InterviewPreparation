package Graph;

import java.util.LinkedList;
import java.util.Queue;

// In this we create an array in which every element is a node or head of a linked list.
public class Graph {

	public static void main(String[] args)
	{
		int v = 6; // No. of vertices in the graph
		AdjList vertex[] = createGraph(v);
		int src = 0;
		int dest = 2;
		addEdge(vertex, src, dest);
		addEdge(vertex, 0, 1);
		addEdge(vertex, 1, 2);
		addEdge(vertex, 0, 3);
		addEdge(vertex, 3, 4);
		addEdge(vertex, 4, 2);
		addEdge(vertex, 3, 2);
		addEdge(vertex, 4, 5);
		addEdge(vertex, 2, 5);
		System.out.println("**Printing the Graph created**");
		printGraph(vertex);
		System.out.println("**Printing BFS Traversal of Graph**");
		BFS(vertex, 0,v);
		DFS(vertex[0], 0, v);
		
	}

	private static void DFS(AdjList vertex, int start, int v) {
		// It also gives the mininmum spanning tree and is good for traversals
		
	}

	private static void BFS(AdjList[] vertex, int start, int v) {
		Queue<Integer> myQueue = new LinkedList<Integer>();
		myQueue.add(start);
		Node temp;
		boolean[] visited = new boolean[v];
		while(!myQueue.isEmpty())
		{
			start = myQueue.poll();
			System.out.println(start);
			visited[start] = true;
			temp = vertex[start].head;
			while(temp!=null)
			{
				if(visited[temp.getData()] == false)
				{
					//System.out.println("pushing "+ temp.getData());
					visited[temp.getData()] = true;
					myQueue.add(temp.getData());
				}
				temp = temp.getNext();
			}
			
		}
		
		
	}

	private static void printGraph(AdjList[] vertex) {
		Node temp;
		for(int i=0; i<5; i++)
		{
			System.out.println("Adjacency Matrix for V" + i);
			temp = vertex[i].head;
			while(temp!=vertex[i].end)
			{
				System.out.print(temp.getData() + "->");
				temp = temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}

	private static void addEdge(AdjList[] vertex, int src, int dest) {
		
		//Since it is an undirected graph so we are goind to add this edge in src AdjList as well as in dest AdjList
		vertex[src].insert(dest);
		vertex[dest].insert(src);
	}

	private static AdjList[] createGraph(int v) 
	{
		AdjList[] vertex = new AdjList[v];
		for(int i=0; i<v ; i++)
		{
			vertex[i] = new AdjList();
		}
		//System.out.println(vertex[0]);
		return vertex;
	}
	
	
	
}
