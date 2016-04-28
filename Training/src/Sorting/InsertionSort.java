package Sorting;

public class InsertionSort {
	
	public static void main(String[] args)
	{
		int[] nums = Utility.nums;
		sort(nums);
		Utility.display(nums);
	}

	private static void sort(int[] nums) {
		//int i = 0;
		int k;
		for(int i=1; i<nums.length; i++)
		{	
			k=i;
			for(int j=k-1; j>=0; j--,k--)
			{
				if(nums[j]>nums[k]){
					int temp = nums[k];
					nums[k]=nums[j];
					nums[j]=temp;
					
				}
			}
				
		}
	}
	
}
