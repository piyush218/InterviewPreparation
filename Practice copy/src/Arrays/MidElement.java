package Arrays;

/*Find the element before which all the elements are smaller than it, 
 * and after which all are greater
 * 
 * */

public class MidElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		System.out.println(findMid(nums));
		

	}

	private static int findMid(int[] nums) {
		// TODO Auto-generated method stub
		boolean manager = false, keeper = true;
		int mid = -1, current;
		for(int i=0; i<nums.length; i++)
		{
			if(mid != -1)
				break;
			manager = false;
			keeper = true;
			current = nums[i];
			//System.out.println("current = " + current);
			for(int j=0; j<nums.length; j++)
			{
				//System.out.println("nums[j] = " + nums[j]);
				if(current == nums[j])
				{
					//System.out.println("current = nums[j] and keeper = " + keeper);
					manager = true;
					//break;
				continue;
				}
				else
				{
					if(!manager)
					{
						//code for smaller values
						if(nums[j] > current)
						{
							keeper = false;
						//	System.out.println("nums[j] is greater than current and keeper = " + keeper);
							break;
						}
						
					}
					else
					{
						//code for larger values
						if(nums[j] < current)
						{
							keeper = false;
							//System.out.println("nums[j] is smaller than current and keeper = " + keeper);
							break;
						}
					}
					if(j==nums.length-1 && keeper)
					{
						//System.out.println("found");
						mid = current;
						break;
					}
						
				}
			}
		}
		return mid;
	}

}
