package Sorting;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		int[] nums = Utility.nums;
		sort(nums);
		Utility.display(nums);
	}

	private static void sort(int[] nums) {
		for(int i=0; i < nums.length-1; i++)
		{
			for(int j=i+1; j< nums.length; j++)
			{
				if(nums[i]>nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
