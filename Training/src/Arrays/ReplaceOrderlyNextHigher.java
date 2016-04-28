package Arrays;
/*Given an array, print the Next Greater Element (NGE) for every element. 
 * The Next greater Element for an element x is the first greater element on the right 
 * side of x in array. 
 * Elements for which no greater element exist, consider next greater element as -1.
 * */
import java.util.Stack;

public class ReplaceOrderlyNextHigher {

	public static void main(String[] args)
	{
		int[] nums = {12,6,7,11,25,10};//Output: {25,7,11,25,-1}
		replace(nums);
	}

	private static void replace(int[] nums) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(nums[0]);
		int top;
		for(int i=1; i<nums.length; i++)
		{
			if(!myStack.isEmpty())
			{
				top = myStack.peek();
				while(top<nums[i])
				{
					top = myStack.pop();
					System.out.println(top + " -> " + nums[i]);
					top = Integer.MAX_VALUE;
					if(!myStack.isEmpty())
						top = myStack.peek();
				}
				myStack.push(nums[i]);
			}
		}
		while(!myStack.isEmpty())
		{
			System.out.println(myStack.pop() + " -> -1");
		}
	}
}
