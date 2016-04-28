package PracticeSet;

public class Stack {
	
	protected int top = -1;
	protected int max;
	int[] myStack;
	
	public Stack(int size)
	{
		max = size;
		myStack = new int[max];
	}
	
	public void push(int val)
	{
		if(top < max)
		{
			top++;
			myStack[top] = val;
		}
		else
		{
			System.out.println("OverFlow");
		}
		
	}
	
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println("Popping " + myStack[top]);
			top--;
		}
	}
	
	public static void main(String[] args)
	{
		Stack s = new Stack(10);
		s.push(2);
		s.pop();
		s.pop();
	}
}
