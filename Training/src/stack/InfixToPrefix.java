package stack;
// first reverse the infix and then do similar processing like infix to postfix
public class InfixToPrefix {

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
			
			else if(top<str.length() && str.charAt(i) == '(')
			{// pop till closing bracket not encountered
				while(operators[top] != ')')
				pop();
			}
			
			
			else if(top<str.length() && str.charAt(i) == ')')// if ) is encountered simply push it in the stack
			{
				top++;
				operators[top] = str.charAt(i);
			
			}
			
			else if(str.substring(i, i+1).matches("[a-z]"))
			{//is an operand like a or A is encountered append it to result
				result += str.charAt(i);
				
			}
			
			else if(top == -1 || (prec(str.charAt(i)) > prec(operators[top])))
			{// if a+b is the string and hence top will b -1 so we can cant compare str.charAt(i) and operators[top] hence we
			//include the condition top ==-1. Further if str.char is * and op[top] is + then * will simply get pushed into stack.
				top++;
				operators[top] = str.charAt(i);
			}
			
			else if(prec(str.charAt(i)) < prec(operators[top]))
			{//if str.char is - and op[top] is * then pop the op till the following condition
				
				while(prec(str.charAt(i)) < prec(operators[top]))
				{
					pop();
				}
				top++;
				operators[top]= str.charAt(i);
			}
			
			
		}
	}
	
	private String reverse(String str) {
		int i=0, j=str.length()-1;
		char[] c = str.toCharArray();
		char temp;
		while(i < j)
		{
			temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		String s = new String(c);
		return s;
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
			if(operators[top] != ')')
			result += operators[top];
			top--;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		InfixToPrefix itpr = new InfixToPrefix();
		String str = "a+b*(c-d)";
		itpr.converter(itpr.reverse(str));
		System.out.println("Result is: " + itpr.reverse(itpr.result));
	}

}
