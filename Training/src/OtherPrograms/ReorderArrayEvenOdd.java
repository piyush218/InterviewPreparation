package OtherPrograms;
/*Please reorder an input array to place all odds before evens. For example, after numbers in the
array {1, 2, 3, 4, 5} are reordered, it looks like {1, 5, 3, 4, 2}. The result is not unique, and 
there are multiple arrays meeting the reordering criteria.*/
public class ReorderArrayEvenOdd {

	public static void main(String[] args)
	{
		int[] a = {1,3,2,4};
		reOdrerOddEven(a);
		for(int i=0; i<a.length; i++)
		System.out.print(a[i] + " ");
	}

	private static void reOdrerOddEven(int[] a) {
		System.out.println("welcome");
		int low = 0;
		int high = a.length-1;
		int temp;
		int count =0;
		while(low <= high)
		{
			count ++;
			if(a[low] %2 !=0 && a[high]%2 == 0)//both odd
			{
				low++;
				high--;
			}
			else if(a[low] %2 !=0 && a[high]%2 == 0)
			{
				low++;
			}
			else if(a[low]%2 == 0 && a[high]%2 !=0)//even at low and odd at high so swap
			{
				temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
			}
			else if(a[low]%2 == 0 && a[high]%2 ==0)//if both even
			{
				high--;
			}
		} System.out.println(count);
	}
}
