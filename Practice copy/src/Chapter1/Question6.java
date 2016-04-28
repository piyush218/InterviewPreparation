package Chapter1;

public class Question6 {

	public static void main(String[] args)
	{
		int[][] mat = {{1,2,0,4},{5,6,7,8},{9,2,8,6},{4,5,6,3}};
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		printRotatedMatrix(mat);
		rotate(mat);
		
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void printRotatedMatrix(int[][] mat) {
		// TODO Auto-generated method stub
		for(int i=0; i<mat.length; i++)
		{
			for(int j=mat.length-1; j>=0; j--)
			{
				System.out.print(mat[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
	}

	private static void rotate(int[][] mat) {
		// TODO Auto-generated method stub
		int n = mat.length;
		int first, last, top, offset;
		for(int layer = 0; layer < n/2; layer++)
		{
			first  =layer;
			last = n - 1- layer;
			
			for(int i = first; i<last; i++)
			{
				offset = i - first;
				
				top = mat[first][i];
				mat[first][i] = mat[last-offset][first];
				mat[last-offset][first] = mat[last][last-offset];
				mat[last][last-offset] = mat[i][last];
				mat[i][last] = top;
			}
		}
		
	}
}
