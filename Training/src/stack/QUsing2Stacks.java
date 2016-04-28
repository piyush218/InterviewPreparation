package stack;

import java.util.Scanner;

public class QUsing2Stacks {
	static int size = 5;
	static int[] stack1 = new int[5];
	static int[] stack2 = new int[5];
	static int top1 = -1, top2 = -1;
	
	public static void main(String[] args)
	{
		System.out.println("welcome");
		push(5);
		push(4);
		pop();
		pop();
		pop();
	}

	private static void pop() {
		if(top1==-1 && top2==-1)
		{
			System.out.println("Queue underflow");
		}
		else if(top2 != -1)
		{
			System.out.println(stack2[top2]);
			top2--;
		}
		else if(top2 == -1 && top1 != -1)
		{
			while(top1 != -1)
			{
				//Reversing the values of stack1 using stack2
				top2++;
				stack2[top2] = stack1[top1];//popping from stack1 and pushing in stack2
				top1--;
			}
			//popping the top of stack2 which is ideally the poll of queue
			System.out.println(stack2[top2]);
			top2--;
		}
	}

	private static void push(int val) {
		
		if(top1 < size)
		{
			System.out.println("Pushing " + val );
			top1++;
			stack1[top1] = val;
		}
		else
		{
			System.out.println("Queue overflow");
		}
	}
	
	
}
