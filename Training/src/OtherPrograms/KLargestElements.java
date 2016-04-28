package OtherPrograms;
//Print the K largest Elements from a given array:
//There are multiple methods to solve this:
//1. BubbleSort till k, O(nk)
//2. Sort the entire array and then print the last k elements, O(nlogn)
//3. 


public class KLargestElements {

	public static void main(String[] args)
	{
		int[] a = {3,4,1,6,2,5,7,9,6,2};
		BubbleK(a, 5);
		
	}

	private static void BubbleK(int[] a,  int k) {
		//unordered output....output= 6,7,9,6,5
		int temp;
		for(int i=0; i<k; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=k; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
