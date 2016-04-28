package Chapter3SnQ;

public class MinStack {

	static int size = 5;
	static int[] stack = new int[size];
	static int[] minStack = new int[size];
	static int top = -1;
	static int topMin = -1;
	public static void main(String[] args)
	{
		push(5);
		push(6);
		push(3);
		push(4);
		getMin();
		pop();
		pop();
		getMin();
		
	}
	private static void pop() {
		// TODO Auto-generated method stub
		if(top == -1)
		{
			System.out.println("Stack Underflow");
		}
		System.out.println("Popped: " + stack[top] + " | Min: " + minStack[topMin]);
		top--;
		topMin--;
		
		
	}
	
	private static void getMin() {
		// TODO Auto-generated method stub
		if(topMin > -1)
			System.out.println("Min: " + minStack[topMin]);
		else
			System.out.println("Min Stack Underflow");
		return;
	}
	
	private static void push(int val) {
		// TODO Auto-generated method stub
		System.out.println("pushing: "+ val);
		if(top >= size-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		System.out.println("top: " + top);
		pushMin(val);
		System.out.println("calling minStack");
		stack[top] = val;
		
	}
	private static void pushMin(int val) {
		// TODO Auto-generated method stub
		if(topMin == -1)
		{
			topMin++;
			minStack[topMin] = val;
			return;
		}
		
		int currentMin = minStack[topMin];
		topMin++;
		if(currentMin > val)
		{
			minStack[topMin] = val;
			return;
		}
		minStack[topMin] = currentMin;
		
	}
	
}
