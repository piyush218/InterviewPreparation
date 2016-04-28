package Sorting;

public class CountSort {

	public static void main(String[] args)
	{
		int[] nums = {20,25,27,40,56,34,20,44,59,23,45,43,24,23,45,45,37,26, 18};
		sortNums(nums);
		for(int i = 0; i<nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	private static void sortNums(int[] nums) {
		int max = 255;// some max range of  number given
		int[] counts = new int[max];
		for(int i =0; i<nums.length; i++)
		{
			counts[nums[i]]++;
		}
		
		//putting all the ages in sorted order using ageCounts:
		for(int i=0, j=0; i<counts.length; i++)
		{
			while(counts[i] != 0)
			{
				nums[j] = i + 18;
				j++;
				counts[i]--;
			}
		}
		
	}

}
