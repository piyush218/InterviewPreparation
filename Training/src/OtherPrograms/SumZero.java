package OtherPrograms;

public class SumZero {

	public static void main(String[] args)
	{
		int[] nums = {4,2,-3,1,6};
		findZeroSum(nums);
	}

	private static void findZeroSum(int[] nums) {
		int i=0, j=1, sum =0;
		while(j<nums.length)
		{
			sum = 0;
			for(i=0; i<nums.length-j; i=i+j)
			{
				
				sum = nums[i];
			}
		}
	}
}
