package stack;

import java.util.Stack;

public class SortedStack {
	int max = 5;
	static Stack<Integer> stack = new Stack<Integer>();
	static int top = -1;
	int n =0;
	int[] auxStack = new int[max];
	int auxTop = -1;
	
	
	
	public static Stack<Integer> sortStack(Stack<Integer> stack)
	{
		System.out.println("Sorting Stack...");
		if (top == -1) {
	        return stack;
	      }
	      int pivot = stack.pop();

	      // partition
	      Stack<Integer> left  = new Stack<Integer>();
	      Stack<Integer> right = new Stack<Integer>();
	      while(top > -1) {
	        int y = stack.pop();
	        if (y < pivot) {
	          left.push(y);
	        } else {
	          right.push(y);
	        }
	      }
	      sortStack(left);
	      sortStack(right);

	      // merge
	      Stack<Integer> tmp = new Stack<Integer>();
	      while(!right.isEmpty()) {
	        tmp.push(right.pop());
	      }
	      tmp.push(pivot);
	      while(!left.isEmpty()) {
	        tmp.push(left.pop());
	      }
	      while(!tmp.isEmpty()) {
	        stack.push(tmp.pop());
	      }
	      
	      return stack;
	}
	
		
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		stack.push(2);
		stack.push(8);
		stack.push(1);
		stack.push(4);
		stack.push(7);
		stack.push(4);
		stack.push(88);
		stack.push(0);
		sortStack(stack);
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop() + " ");
		}
		}
}
