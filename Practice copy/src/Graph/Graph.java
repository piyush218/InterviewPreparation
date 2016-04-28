package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private final int MAX_VERTICES = 20;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int numVertices;
	
	public Graph(){
		vertexList = new Vertex[MAX_VERTICES];
		adjMat = new int[MAX_VERTICES][MAX_VERTICES]; //all elements are already set to zero
		numVertices = 0;
	}
	
	public void addVertex(char label)
	{
		vertexList[numVertices++] = new Vertex(label);
	}
	
	public void addEdge(int startV, int endV) //get the startV and endV from vertexList's corresponding index for the vertex label
	{
		adjMat[startV][endV] = 1;
		adjMat[endV][startV] = 1;
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label + " ");
	}
	
	public void dfs(){
		Stack<Integer> myStack = new Stack<>();
		
		vertexList[0].visited = true;
		displayVertex(0);
		myStack.push(0);
		
		while(!myStack.isEmpty()){
			
			int v = getUnvisitedNeighbor(myStack.peek());
			if(v == -1)
				myStack.pop();
			else
				{
					vertexList[v].visited = true;
					displayVertex(v);
					myStack.push(v);
					
				}
			
		}
		
		//reset the visited flags of all the vertices to false
		for(int i=0; i<numVertices; i++)
		{
			vertexList[i].visited = false;
		}
		
	}
	
	public void bfs(){
		Queue<Integer> myQueue = new LinkedList<>();
		vertexList[0].visited = true;
		displayVertex(0);
		myQueue.add(0);
		int v1, v2;
		while(!myQueue.isEmpty())
		{
			 v1 = myQueue.poll();
			 
			while((v2 = getUnvisitedNeighbor(v1)) != -1)
			{
				vertexList[v2].visited = true;
				displayVertex(v2);
				myQueue.add(v2);
			}
		}
		
		//reset the visited flags of all the vertices to false
				for(int i=0; i<numVertices; i++)
				{
					vertexList[i].visited = false;
				}
	}

	private int getUnvisitedNeighbor(Integer v) {
		for(int i=0; i<numVertices; i++)
		{
			if(adjMat[v][i] == 1 && !vertexList[i].visited){
				return i;
			}
		}
		return -1;
	}
	
	public void mst(){
		Stack<Integer> myStack = new Stack<>();
		
		vertexList[0].visited = true;
		displayVertex(0);
		myStack.push(0);
		
		while(!myStack.isEmpty()){
			
			int currentV = myStack.peek();
			int v = getUnvisitedNeighbor(currentV);
			if(v == -1)
				myStack.pop();
			else
				{
					vertexList[v].visited = true;
					
					displayVertex(currentV);
					System.out.print("-->");
					displayVertex(v);
					System.out.println();
					myStack.push(v);
					
				}
			
			
		}
		
		//reset the visited flags of all the vertices to false
		for(int i=0; i<numVertices; i++)
		{
			vertexList[i].visited = false;
		}
		
	}
	

}
