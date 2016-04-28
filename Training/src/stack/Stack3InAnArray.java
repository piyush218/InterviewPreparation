package stack;

public class Stack3InAnArray {
	
	int t1=-1, t2=-1, t3=-1;
	int[] myStackArr;
	int size = 4;
	int max = size*3;
	public Stack3InAnArray() {
		myStackArr = new int[max];
	}

	public static void main(String[] args)
	{
		Stack3InAnArray stack = new Stack3InAnArray();
		stack.push('A',4);
		stack.push('A',5);
		stack.push('A', 6);
		stack.push('A', 8);
		stack.pop('A');
		stack.pop('A');
		stack.pop('A');
		stack.pop('A');
		stack.pop('A');
			
	}

	public void pop(char stackName) {
		switch(stackName)
		{
		case 'A':
			if(t1 == -1)
			{
				System.out.println("Stack Underflow");
			}
			else if(t1-1 < 0)
			{
				System.out.println("Popping " + myStackArr[t1]);
				t1 =-1;
			}
			else
			{
				System.out.println("Popping " + myStackArr[t1]);
				t1--;
			}
			break;
			
		case 'B':
			if(t2 == -1)
			{
				System.out.println("Stack Underflow");
			}
			else if(t2-1 < max/3)
			{
				System.out.println("Popping " + myStackArr[t2]);
				t2 =-1;
			}
			else
			{
				System.out.println("Popping " + myStackArr[t2]);
				t2--;
			}
			break;
			
		case 'C':
			if(t3 == -1)
			{
				System.out.println("Stack Underflow");
			}
			else if(t3-1 < 2*max/3)
			{
				System.out.println("Popping " + myStackArr[t3]);
				t3 =-1;
			}
			else
			{
				System.out.println("Popping " + myStackArr[t3]);
				t3--;
			}
			
		}
	}

	public void push(char stackName, int val) {
		switch(stackName)
		{
		case 'A':
			if(t1 == -1)
			{
				t1 = 0;
				myStackArr[t1] = val;
			}
			else if(t1 >=(max/3)-1)
			{	
				System.out.println("Stack overflow");
				//break;
			}
			else{
				t1++;
				myStackArr[t1] = val;
			}
			break;
			
		case 'B':
			if(t2 == -1)
			{
				t2 = max/3;
				myStackArr[t2] = val;
			}
			else if(t2 >=(2*(max/3))-1)
			{
				System.out.println("Stack overflow....B");
				break;
			}
			else{
				t2++;
				myStackArr[t2] = val;
			}
			break;
			
		case 'C':
			if(t3 == -1)
			{
				t3 = 2*(max/3);
				myStackArr[t3] = val;
			}
			else if(t3 >= max-1)
			{
				System.out.println("Stack overflow....C");
				break;
			}
			else{
				t2++;
				myStackArr[t3] = val;
			}
		}
	}
	

	
}
