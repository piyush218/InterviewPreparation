package stack;
// Implement 2 stacks in a single array
// We intialize top1=-1 and top2=2*size, and when the two tops meet, that condition is overflow.
public class Stack2InAnArray {

	static int[] myStack;
	static int size = 5;
	static int top1 = -1;
	static int top2 = 2 * size;
	
	public static void main(String[] args)
	{
		myStack = new int[2*size];
		push1(5);
		push2(11);
		push1(3);
		push1(4);
		push1(1);
		push1(2);
		push1(6);
		push1(8);
		push2(16);
		push2(19);
		push2(12);
		pop1();
		pop2();
		int i = 0;
		for(i=0; i<myStack.length-1; i++)
		{
			System.out.print(myStack[i] + ",");
		}
		System.out.print(myStack[i]);
	}

	private static void pop2() {
		if(top2 > 2*size-1)
		{
			System.out.println("Stack2 Underflow at " + top2);
		}
		else
		{
			System.out.println("Popping " + myStack[top2]);
			top2++;
		}
	}

	private static void pop1() {
		if(top1 < 0)
		{
			System.out.println("Stack1 Underflow");
		}
		else
		{
			System.out.println("Popping " + myStack[top1]);
			top1--;
		}
	}

	private static void push2(int val) {
		if(top2-1 > top1)
		{
			top2--;
			myStack[top2] = val;
			System.out.println("Pushing in stack2: " + myStack[top2]);
		}
		else
		{
			System.out.println("Stack2 overflow");
		}
	}

	private static void push1(int val) {
		if(top1 < top2-1)
		{
			top1++;
			myStack[top1] = val;
			System.out.println("Pushing in stack1: " + myStack[top1]);
		}
		else
		{
			System.out.println("Stack1 overflow");
		}
	}
}
