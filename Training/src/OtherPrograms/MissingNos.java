package OtherPrograms;
/*Given an array of integers print the missing elements that lie in range 0-99. 
 * If there are more than one missing, collate them, otherwise just print the number.
Note that the input array may not be sorted and may contain numbers outside the range [0-99], 
but only this range is to be considered for printing missing elements.
 * */
import java.util.PriorityQueue;

public class MissingNos {

	public static void main(String[] args)
	{
		int[] nums = {2,89,7,45,34,66,67,44,200,455,222,15,47};//[2,7,15,34,44,45,66,67,89]=>1-2,4-6,8-14,16-33
		findMissing(nums);
	}

	public static void findMissing(int[] nums) {
		PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] <= 90)
			{
				myQueue.add(nums[i]);
			}
		}
		
		int start = 1;
		while(!myQueue.isEmpty())
		{
			int val = myQueue.poll();
			if(start != val)
			{
				if(val-1 == start)
				{
					System.out.println(start);
				}
				else
				{
					System.out.println(start + " - " + (val-1));
				}
			}
			if(!myQueue.isEmpty())
			start = val + 1;
		}
	}
}
