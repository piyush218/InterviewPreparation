package Chapter3SnQ;

import java.lang.reflect.Array;

public class StacksInArray {

	static int[] myArray = new int[15];
	static int n = 15;
	static int top1=-1;
	static int top2=-1;
	static int top3=-1;
	
	public static void main(String[] args)
	{
		intializeFixedStack();
		put(20, 'a');
		put(22, 'a');
		put(24, 'a');
		put(26, 'a');
		put(28, 'a');
		put(30, 'a');
		put(32, 'a');
		pop('a');
		pop('a');
		pop('a');
		pop('a');
		pop('a');
		pop('a');
		put(30, 'b');
		put(32, 'b');
		pop('b');
		pop('b');
		pop('b');
	}

	private static void pop(char stackName) {
		// TODO Auto-generated method stub
		switch(stackName){
		case 'a':
				if(top1 == -1)
				{
					System.out.println("Stack-A Underflow");
					return;
				}
				System.out.println("Popped: " + myArray[top1]);
				top1--;
				break;
		case 'b': 
			if(top2 == (n/3)-1)
			{
				System.out.println("Stack-B Underflow");
				return;
			}
			System.out.println("Popped: " + myArray[top2]);
			top2--;
			break;
		case 'c': 
			if(top3 == (2*n/3)-1)
			{
				System.out.println("Stack-C Underflow");
				return;
			}
			System.out.println("Popped: " + myArray[top3]);
			top3--;
			break;
		}
		
	}

	private static void intializeFixedStack() {
		// TODO Auto-generated method stub
		top1 = -1;
		top2 = n/3 -1;
		top3 = 2*n/3 -1;
		
	}

	private static void put(int val, char stackName) {
		// TODO Auto-generated method stub
		switch (stackName){
		case 'a':
				if(top1 >= (n/3)-1)
				{
					System.out.println("Stack-A Overflow");
					return;
				}
				top1++;
				myArray[top1] = val;
				
				break;
		case 'b':
			if(top2 >= (2*n/3)-1)
			{
				System.out.println("Stack-B Overflow");
				return;
			}
			top2++;
			myArray[top2] = val;
			
				break;
		case 'c': 
			if(top3 >= n-1)
			{
				System.out.println("Stack-B Overflow");
				return;
			}
			top3++;
			myArray[top3] = val;
			
				break;
		}
		
	}
}
