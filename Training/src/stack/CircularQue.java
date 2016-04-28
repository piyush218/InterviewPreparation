package stack;

public class CircularQue {

	int max = 5;
	int[] myQue = new int[max];
	int front = 0;
	int rear = 0;
	int len = 0;
	public boolean isEmpty()
	{
		return len == 0;
	}
	public boolean isFull()
	{
		return len == max;
	}
	public void push(int val)
	{
		if(!isFull())
		{
			len++;
			myQue[rear] = val;
			rear = (rear+1) % max;
			
		}
		else
		{
			System.out.println("Queue Overflow for " + val);
		}
	}
	public void pop()
	{
		if(!isEmpty())
		{
			len--;
			System.out.println("Deque " + myQue[front]);
			front = (front + 1) % max;
		}
		else
		{
			System.out.println("Queue Underflow");
		}
	}
	
	public static void main(String[] args)
	{
		CircularQue q = new CircularQue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(100);
		//q.push(6);
		q.pop();
		q.pop();
		q.pop();
		System.out.println("---------------");
//		q.pop();
//		q.pop();
//		q.pop();
//		q.pop();
		q.push(6);
		q.push(7);
		q.pop();//4
		q.pop();//5
		q.pop();//6
		q.pop();//7
		q.push(100);
		q.pop();
		q.pop();
		
				
		
	}
}
