
public class FindMax {

	public static void main(String[] args)
	{
		int[] A = {4,8,9,11,2^32};
		int[] B = {2,10,2^32};
		int n = 2;
		int[] C = new int[3*n];
		int j = 0;
		int k = 0;
		//A[(2*n) + 1] = 2^32;
		//B[(2*n) + 1] = 2^32;
		for(int i=0; i<3*n; i++)
		{
			if(A[j] < B[k])
			{
				C[i] = A[j];
				j++;
				System.out.println("Entered " + C[i]);
			}
			else
			{
				C[i] = B[k];
				k++;
				System.out.println("Entered " + C[i]);
			}
		}
		for(int i=0; i<3*n; i++)
		{
			System.out.println(C[i] + ",");
		}
	}
	
}
