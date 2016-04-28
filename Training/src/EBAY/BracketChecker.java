package EBAY;

import java.util.Scanner;
import java.io.*;
import java.util.Stack;


public class BracketChecker {

	public static void main(String[] args)
	{
		
			System.out.print(bracketSequence("[]{}"));
		
	}

	private static String bracketSequence(String value) {
		String status = "YES";
		boolean isProper = false;
		Stack<Character> myStack = new Stack<Character>();
		
		for(int i = 0; i < value.length(); i++){
			char ch = value.charAt(i);
			switch (ch) {
			case '{': //opening delimiters
			case '[':
			case '(':
					//push it on the stack
					myStack.push(ch);
				break;
			
			case '}': //closing delimiters
			case ']':
			case ')':
					//pop it from the stack
					if(!myStack.isEmpty()){
						char poppedCharacter = (char)myStack.pop();
						if((ch == '}' && poppedCharacter != '{') ||(ch == ']' && poppedCharacter != '[') ||(ch == ')' && poppedCharacter != '(') ){
							isProper = true;
						}
					}
					else{
						isProper = true;
					}
				break;

			default:// No action on other characters
				break;
			}
		}
		//At this point all the characters are processed
		if(!myStack.isEmpty() && !isProper){
			status = "NO";
		}
		
		return status;
	}

}
