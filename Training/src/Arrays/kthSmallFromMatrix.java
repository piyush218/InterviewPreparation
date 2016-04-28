package Arrays;
/*Given a sorted matrix (row-wise and column wise) , find kth smallest element.
 * */
public class kthSmallFromMatrix {

	public static void main(String[] args)
	{
		int[][] matrix = {{10,20,30},{40,50,60},{70,80,90}};
		int k = 5;
		findKSmallest(matrix, k);
	}

	private static void findKSmallest(int[][] matrix, int k) {
		int colMax = matrix[0].length;
		int rowMax = matrix.length;
		int size = colMax * rowMax;
		if(k < size)
		{
			int row = (k-1)/colMax;
			int col = (k-1)%rowMax;
			if(row < rowMax && col<colMax)
				System.out.println(matrix[row][col]);
		}
	}
}
