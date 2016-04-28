package Arrays;

public class RotateMatrix {

	public static void main(String[] args)
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(matrix);
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

	private static void rotateMatrix(int[][] matrix) {
		int temp;
		for(int i=0; i<matrix.length; ++i)
		{
			for(int j=0; j<matrix[0].length/2; ++j)
			{
					temp = matrix[i][j];
					matrix[i][j] = matrix[matrix.length-i-1][j];
					matrix[matrix.length-i-1][j] = temp;
				}
				
				
//				if(i!=j)
//				{
//					temp = matrix[i][j];
//					matrix[i][j] = matrix[j][i];
//					matrix[j][i] = temp;
//				}
			//}
		}
	}
}
