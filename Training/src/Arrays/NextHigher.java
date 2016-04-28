package Arrays;
/*Replace all the elements in the array with its next highest element to its right
Expected O(n) Solution.
 * */
public class NextHigher {

	public static void main(String[] args)
	{
		int[] nums = {12,6,7,11,25,10};//Output={25,7,10,25,-1,-1}
		replaceWithHigher(nums);
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i] + " ");
	}

	private static void replaceWithHigher(int[] nums)
	{
		int j, minDiff, next;
		for(int i=0; i<nums.length; i++)
		{
			minDiff = Integer.MAX_VALUE;
			next = Integer.MIN_VALUE;
			j=i+1;
			while(j<nums.length)
			{
				if(nums[j]>nums[i] && minDiff > nums[j] - nums[i])
				{
					minDiff = nums[j]-nums[i];
					next = nums[j];
				}
				j++;
			}
			if(next >= nums[i])
				{
				nums[i] = next;
				}
			else
				{
				nums[i] = -1;
				}
		}
	}
	
	private static void replaceUsingStack(int[] nums)
	{
		
	}
}
