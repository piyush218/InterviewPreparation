package OtherPrograms;
/*Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can only move in two directions: right and down. How many possible paths are there for the robot?
FOLLOW UP
Imagine certain squares are “off limits”, such that the robot has to avoid them
|1 0 0 1|      The path is |
|1 1 0 0|                  |_
|0 1 1 0|                    |_
|0 0 1 1|                      |_
 * */
public class MatrixTraversalRecur {
	
	int[][] probMatrix = {{1,1,0,1},{0,1,1,1},{0,1,0,1},{0,0,0,1}};
	int[][] solMatrix = new int[probMatrix.length][probMatrix[0].length];
	int n = probMatrix.length;
	
	public boolean isSafe(int i, int j)
	{
		if(i>=0 && i<n && j>=0 && j<n && probMatrix[i][j]==1)
		{
			return true;
		}
		return false;
	}
	
	public boolean solveMatrix(int i, int j)
	{
		if(i == n-1 && j == n-1)
		{
			solMatrix[i][j] = 1;
			System.out.println("Reached destination");
			return true;
		}
		
		if(isSafe(i, j) == true)
		{
			System.out.println("making one");
			solMatrix[i][j] =1;
			if(solveMatrix(i+1, j)) 
				return true;
			else if(solveMatrix(i, j+1)) 
				return true;
			else{
			System.out.println("making zero");
			solMatrix[i][j] = 0;// it checks if the down of x,y is 1 if not then check if right is 1 if both no then it marks x,y	//as zero and backtracks
			return false;
			}
		}
		return false;
	}
	
	public void displaySolution()
	{
		System.out.println("Solution Matrix");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(solMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void displayProblem()
	{
		System.out.println("Problem Matrix");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(probMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		MatrixTraversalRecur m = new MatrixTraversalRecur();
		m.solveMatrix(0, 0);
		m.displayProblem();
		m.displaySolution();
	}
}
