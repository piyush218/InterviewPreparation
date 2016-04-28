package OtherPrograms;
//Find the element that occurs in majority in an array
public class MajorityElement {

	public static void main(String[] args)
	{
		int[] nums = {2,5,2,6,2,8,2,7,2,2};
		int majorityElement = findMajority(nums);
		System.out.println(majorityElement);
		//System.out.println(8>>1);
	}

	private static int findMajority(int[] nums) {
		int result = nums[0];
		int times = 1;
		for(int i=1; i<nums.length; i++)
		{
			if(times == 0)
			{
				result = nums[i];
				times = 1;
			}
			if(result == nums[i])
				times++;
			else
				times--;
		}
		if(checkMajority(nums, result))
			return result;
		else
			return -1;
	}

	private static boolean checkMajority(int[] nums, int result) {
		int times = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] == result)
				times++;
		}
		System.out.println("No. of occurrences: "+times);
		return (2*times > nums.length);
	}

}
