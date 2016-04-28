package stack;

import java.util.Stack;

//Basically if an operator of higher or equal precednce is encoutered than the one at the top, operator sits onto the stack vala operator.
// If a lower precedence operator is encountered, the higherprecednce operator says, "I cant sit below a lower precedence operator- pop me."
public class InfixToPostfix {
	
	char[] operators;
	String result = "";
	int top = -1;
	
	public void converter(String str)
	{
		operators = new char[str.length()];
		for(int i=0; i<=str.length(); i++)
		{
			if(i>=str.length())//if i reaches the last character all the operators in operators[] should get popped int the result
			{
				while(top !=-1)
				{
					pop();
				}	
			}
			
			else if(top<str.length() && str.charAt(i) == '(')// if ( is encountered simply push it in the stack
			{
				top++;
				operators[top] = str.charAt(i);
			
			}
			
			else if(str.substring(i, i+1).matches("[a-z]"))
			{//is an operand like a or A is encountered append it to result
				result += str.charAt(i);
				//System.out.println(result);
				
			}
			
			else if(top == -1 || (prec(str.charAt(i)) >= prec(operators[top])))
			{// if a+b is the string and hence top will b -1 so we can cant compare str.charAt(i) and operators[top] hence we
			//include the condition top ==-1. Further if str.char is * and op[top] is + then * will simply get pushed into stack.
				top++;
				operators[top] = str.charAt(i);
			}
			
			else if(prec(str.charAt(i)) < prec(operators[top]))
			{//if str.char is - and op[top] is * then pop the op till the following condition
				while(prec(str.charAt(i)) >= prec(operators[top]))
				{
					pop();
				}
			}
			
			else if(str.charAt(i) == ')')
			{// pop till opening bracket not encountered
				while(operators[top] != '(')
				pop();
			}
			
		}
	}
	
	public int prec(char op)
	{	
		int prec = 0;
		switch(op)
		{
		case '+':
		case '-':
			prec = 1;
			break;
		case '*':
		case '/':
			prec = 2;
			break;
		}
		return prec;
	}
	
	public void pop(){
		if(top == -1)
		{
			System.out.println("Stack Underflow");
			
		}
		else 
		{
			if(operators[top] != '(')
			result += operators[top];
			top--;
		}
	}
	public static void main(String[] args)
	{
		InfixToPostfix itp = new InfixToPostfix();
		String str = "z-a+b*(c-d)";
		itp.converter(str);
		System.out.println("Result is: " + itp.result);
	}
}
