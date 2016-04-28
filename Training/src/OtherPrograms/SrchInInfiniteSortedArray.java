package OtherPrograms;
//Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
//Since the array is sorted we can use Binary Search. But since the upper bound is not given, we have to device out an
//upperbound for the given key(element to be searched).
public class SrchInInfiniteSortedArray {

	public static void main(String[] args)
	{
		int[] a = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int key = 10;
		//preProcessor finds an upper bound for the given infinite array
		int position = preProcessor(a, 100);
		System.out.println("Desired position is: " + position);
	}

	private static int preProcessor(int[] a, int key) {
		int low = 0;
		int high = 1;
		int val = a[0];
		while(val < key )
		{
			low = high;
			high = 2*high;
			if(high >= a.length)
				{
					high = a.length-1;
					val = a[high];
					break;
				}
			val = a[high];
			System.out.println("val= " + val);
		}
		
		return binarySearch(a, low, high, key);
	}

	private static int binarySearch(int[] a, int low, int high, int key) {
		int pos = -1;
		int mid;
		while(low <= high)
		{
			mid = low + (high - low)/2;
			if(a[mid] == key)
			{
				pos = mid;
				break;
			}
			else if(a[mid] < key)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
			
		}
		return pos;
	}
}
