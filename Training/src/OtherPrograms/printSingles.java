package OtherPrograms;
/*Given an array which contain repeated element in consecutive order.
 * Now write a recursive function which remove consecutive elements from array.
 * */
public class printSingles {

	public static void main(String[] args)
	{
		int[] nums = {1,1,1,2,3,3,4,4,5};
		print(nums);
	}

	private static void print(int[] nums) {
		int current = nums[0];
		System.out.println(current);
		int i = 1;
		while(i<nums.length)
		{
			if(current != nums[i])
			{
				current = nums[i];
				System.out.println(nums[i]);
			}
			i++;
		}
	}
}
