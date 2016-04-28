package OtherPrograms;
/*You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B.
 *  Write a method to merge B into A in sorted order.
 * */
public class MergeArrays {
	
	public static void main(String[] args)
	{
		int[] b = {10,20,30,40,50};
		int[] a = new int[4 + b.length];
		for(int i=0; i<4; i++)
		{
			a[i] = i*10+2;
		}
		merge(a,b,4,5);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void merge(int[] a, int[] b, int m, int n) {
		
		int k = m+n-1;
		int i,j;
		for(i = m-1, j=n-1; i>=0 && j>=0;)
		{
			if(a[i]>=b[j])
			{
				a[k] = a[i];
				k--;
				i--;
			}
			else
			{
				a[k] = b[j];
				k--;
				j--;
			}
		}
		if(j>=0)
		{	
			while(j>=0)
			{
				a[k] = b[j];
				k--;
				j--;
			}
		}
		else if(i>=0)
		{
			while(i>=0)
			{
				a[k] = a[i];
				k--;
				i--;
						
			}
		}
	}
}
