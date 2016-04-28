package OtherPrograms;

import java.util.Hashtable;

/*Design an algorithm to find all pairs of integers within an array which sum to a specified value
 * */
public class PairsEqualToSum {

	public static void main(String[] args)
	{
		int[] a ={-2, -1, 0, 3, 5, 6, 7, 9, 13, 14};
		int sum = 12;
		findPairsUsingHash(a,sum);
		findPairsWOHash(a,sum);
	}

	
	// Method-1 Using Hash Table:
	private static void findPairsUsingHash(int[] a, int sum) {
		Hashtable<Integer, Integer> pairStore = new Hashtable<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
			pairStore.put(a[i], 0);
		}
		for(int i=0; i<a.length;i++)
		{
			if(pairStore.containsKey(sum-a[i]))
			{
				pairStore.put(a[i], sum-a[i]);
			}
		}
		System.out.println(pairStore);
	}
	
	//Method-2 Without using hash ******Important*************
	private static void findPairsWOHash(int[] a, int sum) {
		// First Sort the array so, O(n logn)
		int head = 0;
		int end = a.length-1;
		while(head < end)
		{
			if(a[head]+a[end] == sum)
			{
				System.out.println(a[head] + " : " + a[end]);
				head++;
				end--;
			}
			else if(a[head]+a[end] > sum)
				end--;
			else
				head++;
		}
	}
	
}
