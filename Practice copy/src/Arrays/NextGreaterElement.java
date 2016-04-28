package Arrays;

import java.util.HashMap;

public class NextGreaterElement {
	
	public static void main(String[] args)
	{
		int[] num = {4, 5, 2, 12, 1, 18};
		findGreaterSimple(num);
		
	}
	
	public static void findGreaterSimple(int[] num)
	{
		int diff = Integer.MAX_VALUE; 
		int next, current;
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		for(int i=0; i<num.length; i++)
		{
			next = -1;
			for(int j=0; j<num.length; j++)
			{
				current = num[j];
				System.out.println("i: " + num[i] + " j: " + current + " diff: " + diff + " actualDiff: " + (current - num[i]));
				if(diff >= current-num[i] && current-num[i]>0)
				{
					diff = num[j]-num[i];
					next = num[j];
					System.out.println("next is" + next);
				}
			}
			result.put(num[i], next);
			diff = Integer.MAX_VALUE; 
		}
		
		System.out.println(result);
	}

}
