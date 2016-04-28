package stack;
import java.util.*;
public class stackOverProblem {
	int top=-1;
	int stackNo = -1;
	int max = 5;
	//int[] helper = new int[max];
	ArrayList<int[]> myStacks = new ArrayList<int[]>();
	
	public void push(int val)
	{
		if(top == -1)
		{
			int[] stack = new int[max];
			top++;
			stack[top] = val;
			stackNo++;
			myStacks.add(stackNo, stack);
			System.out.println("Pushing " + val + " in " + " StackNo.: " + stackNo);
			
		}
		else if(top >= max-1)
		{
			System.out.println("stack Overflow");
			System.out.println("Creating New Stack");
			int[] stack = new int[max];
			top = 0;
			stack[top] = val;
			stackNo++;
			myStacks.add(stackNo, stack);
			System.out.println("Pushing " + val + " in " + " StackNo.: " + stackNo);
			
		}
		else
		{
			int[] helper = new int[max];//Then we get the current stack into the helper array, the current stack can be found using static stackNo
			helper = myStacks.get(stackNo);
			top++;
			System.out.println("Pushing " + val + " in " + " StackNo.: " + stackNo + " at " + top);
			helper[top] = val;
			myStacks.add(stackNo, helper);
		}
	}
	
	public void pop()
	{
		if(stackNo == -1)
		{
			System.out.println("Stack Underflow");
		}
		else if(top == 0)
		{
			int[] helper = new int[max];
			helper = myStacks.get(stackNo);
			System.out.println("Popping " + helper[top] + " in Stack: " + stackNo);
			top = max-1;
			myStacks.remove(stackNo);
			stackNo--;
		}
		else
		{
			int[] helper = new int[max];
			helper = myStacks.get(stackNo);
			System.out.println("Popping " + helper[top] + " in Stack: " + stackNo);
			top--;
			myStacks.add(stackNo, helper);
		}
	}
	public void popAt(int n)
	{	
		int stackNopop = n%max;
		int toppop = max + stackNopop;
		if(stackNopop > max/2)
		{
			stackNopop = max - n%max;
			toppop = max - stackNopop;
		}
		System.out.println(stackNopop);
		System.out.println(toppop);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		stackOverProblem stack = new stackOverProblem();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.popAt(9);
		stack.popAt(2);
		stack.popAt(12);
		stack.popAt(5);
	}
	
}
