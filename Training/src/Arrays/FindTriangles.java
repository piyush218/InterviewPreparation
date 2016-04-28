package Arrays;
/*Given an unsorted array of positive integers. Find the number of triangles 
 * that can be formed with three different array elements as three sides of triangles.
 * */
public class FindTriangles {

	public static void main(String[] args)
	{
		int[] nums = {10, 21, 22, 100, 101, 200, 300};
		System.out.println("Number of triangles: " + CountTriangles(nums));
	}

	private static int CountTriangles(int[] nums) {
		int triangle = 0;
		for(int i=0; i<nums.length-2; i++)
		{
			for(int j=i+1; j<nums.length-1; j++)
			{
				for(int k = nums.length-1; k>j; k--)
				{
					if(nums[i] + nums[j] > nums[k])
						triangle++;
				}
			}
		}
		return triangle;
	}
}
