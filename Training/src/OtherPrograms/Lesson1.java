package OtherPrograms;
import java.util.*;
import java.math.*;

enum word{million, lakh, tenthousand, thousand, hundreds};
public class Lesson1 {

	public static void main(String[] args)
	{
		//spaceReplace();
		compress();
		//inWords();
//		spaceReplace1();
		
	}
	
	public static void inWords()
	{
		int num = 123;
		//counting the number of digits:
		String numLen = "" + num;
		System.out.println(numLen.length());
		int m = (int)Math.pow(10,3);
		System.out.println(m);
		int r;
		Stack<Integer> myStack = new Stack<Integer>();
		while(num*10/10 == 10)		{
			r =num%m;
			myStack.push(r);
			num = num/m;
			m=m/10;			
		}
	}
	public static void spaceReplace()
	{
		String str = "Mr Smith Jackson";
		//String strReplaced = str.replaceAll(" ", "%20");
		//System.out.println("String is: " + strReplaced);
		char[] charArray = new char[str.length() + 4];
		//System.out.println(str.charAt(0));
		for(int i=0, k=0; i<str.length() && k<str.length()+4; i++, k++)
		{
			if(str.charAt(i) == ' ')
			{
				charArray[k] = '%';
				charArray[k+1] = '2';
				charArray[k+2] = '0';
				k += 2;
			}
			else
			{
				charArray[k] = str.charAt(i);
			}
		}
		String strReplaced = new String(charArray);
		System.out.println("Here is the final string:" + strReplaced);
	
	}
	
	public static void spaceReplace1()
	{
		String str = "Mr Smith Jackson";
		char[] charArray = new char[str.length() + 4];
		for(int p=charArray.length-1, q=str.length()-1; p>=0 && q>=0;)
		{
			if(str.charAt(q) == ' ')
			{
				charArray[p--] = '0';
				charArray[p--] = '2';
				charArray[p--] = '%';
				q--;
			}
			else
			{
				charArray[p] = str.charAt(q);
				p--;
				q--;
			}
		}
		String strReplaced = new String(charArray);
		System.out.println("Here is the final string:" + strReplaced);
	
	}
	
	public static void compress()
	{
		String str = "a";
		String compressedStr;
		char[] charArray = new char[str.length()];
		int count,j;
		for(int i=0, k=0; i<str.length(); i++,k++)
		{
			count = 1;
			charArray[k] = str.charAt(i);
			k++;
			
			j = i+1;
		
			if(j<str.length() && str.charAt(i) == str.charAt(j))
			{
				while(j <str.length() && str.charAt(i) == str.charAt(j))
				{
					count++;
					j++;
				}
				charArray[k] = Character.forDigit(count, 10);
				i =j;
			}
		}
		
		compressedStr = new String(charArray);
		System.out.println(compressedStr);
	}
}
/*for(int i=0, k=0; i<str.length(); i++,k++)
{
	count = 0;
	charArray[k] = str.charAt(i);
	k++;
	
	j = i+1;
	if(str.charAt(i) == str.charAt(j))
	{
		while(str.charAt[i] == str.charAt[j])
		{
			count++;
			j++;
		}
		charArray[k] = Character.forDigit(count, 10);
		i =j;
	}
}
*/