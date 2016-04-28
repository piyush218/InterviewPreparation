package Arrays;

public class MaxSubSeqSumKadane {
	
	public static void main(String[] args)
	{
		int[] nums = {-2, 5, -1, 7, -3};
		findSubSeq(nums);
	}

	private static void findSubSeq(int[] nums) {
		if(nums.length <= 0)
			return;
		
		int sum = 0, start = 0, end = 0;
		int maxSum = Integer.MIN_VALUE, maxStart = 0, maxEnd = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] > sum + nums[i])
			{
				sum = nums[i];
				start = i;
				end = i;
			}else{
				sum += nums[i];
				end = i;
			}
			
			if(maxSum < sum)
			{
				maxSum = sum;
				maxStart = start;
				maxEnd = end;
			}
		}
		
		System.out.print("{ ");
		for(int i=maxStart; i<maxEnd; i++)
		{
			System.out.print(nums[i] + ", ");
		}
		System.out.println(nums[maxEnd] + " }");
		
		System.out.println("Max Sum: " + maxSum);
		
	}

}
