package OtherPrograms;
/*1.) Given an array, find the maximum difference between two array elements given the second element 
 * comes after the first. 
 * For example: array = [1,2,3,4,5,6,7] 
We can take the difference between 2 and 1 (2-1), but not the different between 1 and 2 (1-2)
 * */
public class MaxDiff {

	public static void main(String[] args)
	{
		int[] nums= {1,-2,3,4,-5,6,7};
		System.out.println("The max diff is: " + findDiff(nums));
	}

	private static int findDiff(int[] nums) {
		int maxdiff = 0;
		int min = nums[0];
		for(int i=1; i<nums.length; i++)
		{
			if(nums[i]-min > maxdiff)
				maxdiff = nums[i] - min;
			if(nums[i] < min)
				min = nums[i];
		}
		return maxdiff;
	}
}
