package OtherPrograms;

public class findReapeating {

	public static void main(String[] args)
	{
		int[] nums = {1,2,4,5,2,4,1};
		printRepeating(nums);
	}

	private static void printRepeating(int[] nums) {
		for(int i=0; i<nums.length; i++)
		{
			if(nums[Math.abs(nums[i])] > 0)
				nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
			else
				System.out.println(Math.abs(nums[i]));
		}
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
	
}
