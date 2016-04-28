package OtherPrograms;

public class SrchInRotatedArray {

	public static void main(String[] args)
	{
		int[] a = {8,1,2,3,4,5,6,7};
		//int pos = rotatedBinarySearch(a, 3);
		//System.out.println("Desired position is: " + pos);
		int minElement = findMin(a, 0, a.length-1);
		System.out.println("Min Element is: " + minElement);
		int maxElement = findMax(a, 0, a.length-1);
		System.out.println("Max Element is: " + maxElement);
	}

	
	private static int findMax(int[] a, int start, int end) {
		if(end < start)
			return a[a.length -1];
		if(end == start)
			return a[end];
		int mid = start + (end - start)/2;
		if(end > mid && a[mid] < a[mid+1])
			return a[mid+1];
		if(start < mid && a[mid-1]<a[mid])
			return a[mid];
		//Finding out which subarray to choose next right or left
		if(a[mid] > a[end])
			return findMax(a, mid+1, end);
		else
			return findMax(a, start, mid-1);
	}


	private static int findMin(int[] a, int start, int end) {
		if(end < start)
			return a[0];
		if(end == start)
			return a[start];
		int mid = start + (end-start)/2;
		//check is next to mid is minimum
		//System.out.println(a[start] + " " + a[mid] +" " +a[end]);
			if (mid < end && a[mid + 1] < a[mid])
				return a[mid + 1];
			//check if mid itself is the min
			if (mid > start && a[mid] < a[mid - 1])
				return a[mid];
			//if min is still not found then we have to decide whether we go to the left of right subarray.
			if (a[end] > a[mid])
				return findMin(a, start, mid - 1);
			else
				return findMin(a, mid + 1, end);
		
	}



	private static int rotatedBinarySearch(int[] a, int val) {
		int pos = -1;
		int start = 0, mid;
		int end = a.length-1;
		while(start <= end)
		{
			mid = start + (end-start)/2;
			if(a[mid] == val)
			{
				pos =mid;
				break;
			}
			if(a[start]<a[mid])
			{
				if(a[start]<= val && a[mid]>val)
				{
					end = mid-1;
				}
				else
				{
					start = mid+1;
				}
			}
			else
			{
				if(a[mid]<val && a[end]>=val)
				{
					start = mid+1;
				}
				else
					{
					end = mid-1;
					}
			}
		}
		
		return pos;
	}


}
