package stack;
//error....
public class StackUsing2Queues {

	static int size = 5;
	static int[] queue1 = new int[size];
	static int[] queue2 = new int[size];
	static int[] temp;
	static int front1 =-1, front2=-1, rear1=-1, rear2=-1;
	
	public static void main(String[] args)
	{
		//push(5);
		push(4);
		push(3);
		pop();
		pop();
	}

	private static void pop() {
		while(rear1 != front1)
		{
			if(front2 == -1)
			{
				front2++;
				rear2++;
				queue2[front2] = queue1[rear1];
				rear1++;
			}
			else
			{
				front2++;
				queue2[front2] = queue1[rear1];
				rear1++;
			}
			
		}
		System.out.println("Popping " + queue1[rear1]);
		rear1++;
		temp = queue2;
		queue2 = queue1;
		queue1 = temp;
	}

	private static void push(int val) {
		if(front1 == -1)
		{
			System.out.println("pushing " + val);
			front1++;
			rear1++;
			queue1[front1] = val;
		}
	else if(front1>-1 && front1 < size)
		{
		System.out.println("pushing " + val);
			front1++;
			queue1[front1] = val;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
}
