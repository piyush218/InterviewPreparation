package OtherPrograms;
/*1 ^ 0 =1 and 0^0 =0 and 1^1 = 0
 * 
 * */
public class findingOne {

	public static void main(String[] args)
	{
		int nums[] = {2,5,6,2,5};
		int lonely = findLonely(nums);
		System.out.println(lonely);
	}

	private static int findLonely(int[] nums) {
		int ret = 0;
		for(int i=0; i<nums.length; i++)
		{
			ret = ret ^ nums[i];//2^5^6^2^5 = 6
			System.out.println(ret);
		}
		return ret;
	}
}
