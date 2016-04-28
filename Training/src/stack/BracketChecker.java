package stack;
import java.util.*;
public class BracketChecker {
	
	char[] mystack;
	int top = -1;
	boolean badString = false;
	
	public void push(String str)
	{
		mystack = new char[str.length()];//initializing myStack with string length
		int i;
		for(i=0; i<str.length(); i++)
		{	
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
			{	//push
				if(top >= str.length())
				{
					System.out.println("stack overflow");
					badString = true;
					break;
				}
				else
				{
					top++;
					mystack[top] = str.charAt(i);
				}
			}
			else if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}')
			{	//pop
				switch(str.charAt(i))
					{
					case ')':
						if(mystack[top] == '(')
							pop();
						else	
							badString = true;
						break;
						
					case '}':
						if(mystack[top] == '{')
							pop();
						else	
							badString = true;
						break;
						
					case ']':
						if(mystack[top] == '[')
							pop();
						else	
							badString = true;
						break;				
						
					}
				}
			if(badString)
				break;
			
		}
		
		if(i == str.length() && top == -1 && !badString)//the string is traversed completely and stack is empty
		{
			System.out.println("Proper String");
		}
		else
		{
			System.out.println("String improper");
		}
			
		
	}
	public void pop()
	{
		if(top == -1)
			{
				System.out.println("Stack UnderFlow");
				badString = true;
			}
		else
			top--;
	}
	public static void main(String[] args)
	{
		String str = "{ jfyjh(";
		BracketChecker checker = new BracketChecker();
		checker.push(str);
		
	}
}
