package Sorting;

public class Heaping {
	
	public static void main(String args[])
	{
		//int[] nums = Utility.nums;
		int nums[] = {3,8,5,2,1,6,7,4};
		System.out.println("Extracting smallest 3 elements....");
		int min = 0;
		buildHeaps(nums);
//		Utility.display(nums);
		for(int i=0; i<3; i++)
		{
			min = extractMin(nums.length, nums);
			System.out.println(min);
		}
		System.out.println("The third smallest number is: " + min);
	}

	private static int extractMin(int heapSize, int[] nums) {
		if(heapSize <=0)
		{
			return 0;
		}
		int min = nums[0];
		nums[0] = Integer.MAX_VALUE;
		//nums[heapSize-1] = Integer.MAX_VALUE;
		buildHeaps(nums);
		return min;
		
	}

	private static void buildHeaps(int[] num) {
		int heapSize = num.length;
		for(int i = heapSize/2; i>0; i--)
		{
			min_heapify(num, i-1);
		}
	}

	private static void min_heapify(int[] num, int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int min = i;
		
		if(l<num.length && num[l]<num[min])
		{
			min = l;	
		}
		if(r<num.length && num[r]<num[min])
		{
			min = r;
		}
		if(min != i)
		{
			int temp = num[min];
			num[min] = num[i];
			num[i] = temp;
			min_heapify(num, min);
		}
		
	}

	private static void max_Heapify(int[] num, int i) {
		int l = 2*i +1;
		int r = 2*i + 2;
		int max = i;
		if(l<num.length && num[l]>num[max])
		{
			max = l;
		}
		if(r<num.length && num[r]>num[max])
		{
			max = r;
		}
		if(max != i)
		{
			int temp = num[max];
			num[max] = num[i];
			num[i] = temp;
			max_Heapify(num, max);
		}
	}
}
