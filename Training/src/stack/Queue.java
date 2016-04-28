package stack;

public class Queue {
	int[] myQue;
	int max = 5;
	int front = -1;
	int rear = -1;
	public void push(int val)
	{
		if(front == -1 || rear == -1)
		{
			myQue = new int[max];
			front++;
			myQue[front] = val;
			rear = front;
		}
		else if(front > max)
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			front++;
			myQue[front] = val;
		}
	}
	public void pop()
	{
		if(rear == -1 || front == -1 || rear>= max)
		{
			System.out.println("Queue Underflow");
		}
		else if(rear <= max-1)
		{
			System.out.println("Popping " + myQue[rear]);
			rear++;
		}
	}
	
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		//q.push(6);
		q.pop();
		q.pop();
		q.pop();
//		q.pop();
//		q.pop();
//		q.pop();
//		q.pop();
		q.push(6);
				
		
	}
}
