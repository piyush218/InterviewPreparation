package stack;

public class StackImplement {

	int maxSize, top;
	int[] myStack;
	StackImplement()
	{
		maxSize = 0;
		top = -1;
		
	}
	StackImplement(int s)
	{
		top = -1;
		maxSize = s;
		myStack = new int[s];
	}
	
	public void push(int val)
	{
		if(top == -1)//underflow
		{
			System.out.println("Entering 1st value" + val);
			top++;
			myStack[0] = val;
		}
		else if(top >= maxSize)//overflow
		{
			//System.out.println("");
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			System.out.println("Entering "+ val +"at" + top);
			myStack[top]= val;
		}
	}
	public void display()
	{
		if(top == -1)
		{
			System.out.println("underflow");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(myStack[i]);
			}
		}
	}
	public int pop()
	{
		int r = myStack[top];
		top--;
		return r;
		
	}
	
	public static void main(String[] args)
	{
		StackImplement stack = new StackImplement(5);
		stack.push(10);
		stack.push(20);
		stack.push(23);
		stack.display();
		System.out.println("Popping "+stack.pop());
		System.out.println("Popping "+stack.pop());
		stack.display();
	}
}
