package stack;

public class ExpressionEval {
	
	int[] operands;
	InfixToPostfix itp = new InfixToPostfix();
	int top =-1;
	String postfix;
	public void Evaluator(String str)
	{
		itp.converter(str);
		postfix = itp.result;
		System.out.println("Returned String is: " + postfix);
		operands = new int[postfix.length()];
		//pushing all the operands into the stack
		for(int i =0; i<postfix.length(); i++)
		{
			if(postfix.substring(i, i+1).matches("[0-9]"))
			{	
				System.out.println("Pushing operands : " + (postfix.charAt(i)-48));
				push(postfix.charAt(i)-48);
			}
			else{
				System.out.println("Popping Operands");
				int op2 = pop();
				System.out.println("Op2: " + op2);
				int op1 = pop();
				System.out.println("Op1: " + op1);
				int res = 0;
				switch(postfix.charAt(i))
				{
				case '+':
					res = op1 + op2;
					break;
				case '-':
					res = op1 - op2;
					break;
				case '*':
					res = op1 * op2;
					break;
				case '/':
					res = op1 / op2;
					break;
				}
				System.out.println("Pushing Result as: " + res);
				push(res);
			}
		}
	}
	public static void main(String[] args)
	{
		String str = "2+3*(8-2)";
		ExpressionEval ee = new ExpressionEval();
		ee.Evaluator(str);
		System.out.println("Result is: " + ee.pop());
	}
	
	public void push(int val)
	{
		if(top == -1)
		{
			top++;
			operands[top] = val;
		}
		else if(top > postfix.length() -1 )
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			operands[top] = val;
		}
	}
	
	public int pop()
	{
		int res = 0;
		if(top == -1)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			res = operands[top];
			top--;
		}
		return res;
	}
	
}
