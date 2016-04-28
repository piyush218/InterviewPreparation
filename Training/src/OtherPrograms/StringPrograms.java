package OtherPrograms;

import java.util.Hashtable;

/*Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
 * Ans- hasDuplicates
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters, including the null character.)
 * Ans-revString
 * 
 */

public class StringPrograms {
	
	public static void main(String[] args)
	{
		//System.out.println("Has dups: "+hasDuplicates("abcd"));
		System.out.println("Has dups Using Hashing : "+hasDuplicatesUsingHash("abcd"));
		//System.out.println("Reverse String: "+revString("abcd "));
		//System.out.println(removeDuplicates("abcdfaderf"));
		//System.out.println("isAnagram: "+isAnagram("abcd", "dcba"));
		//spaceReplace();
		//int[][] myMatrix = {{1,2,0},{4,3,2},{2,4,6}};
		//zeroing(myMatrix, 3, 3);
		//System.out.println(isSubstring("abcd", "cdab"));
	}

	private static boolean isAnagram(String s, String t) {
		boolean ana= true;
		int[] charCount = new int[256];
		if(s.length()  != t.length())
		{	
			
			ana = false;
		}
		else
		{
			for(int i=0; i<s.length(); i++)
			{
				charCount[s.charAt(i)]++;
				charCount[t.charAt(i)]--;
			}
			for(int i=0; i<t.length(); i++)
			{
				if(charCount[s.charAt(i)] != 0)
				{
					ana = false;
					break;
				}
				
			}
			
		}
		return ana;
	}
	
	public static void spaceReplace()
	{
		String str = "Mr Smith Jackson";
		int spaceCount = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				spaceCount++;
			}
		}
		char[] charArray = new char[str.length() + spaceCount*2];
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
	

	private static char[] removeDuplicates(String str) {
		
		int[] charCount = new int[256];
		
		return null;
	}

	private static String revString(String str) {
		char temp;
		String s;
		char[] strArray = str.toCharArray();
		for(int i=0, j=str.length()-2; i<j; i++,j--)
		{
			temp = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] =temp;
			
		}
		s = new String(strArray);
		return s;
	}
	

	private static boolean hasDuplicates(String str) {
		// TODO Auto-generated method stub
		boolean isDup = false;
		boolean[] char_array = new boolean[256];
		for(int i=0; i<str.length(); i++)
		{
			if(!char_array[str.charAt(i)])
			{
				char_array[str.charAt(i)] = true;
			}
			else
			{
				isDup = true;
			}
			
		}
		return isDup;
	}
	
	private static boolean hasDuplicatesUsingHash(String str) {
		boolean hasDups = false;
		Hashtable<Character, Boolean> uniqueHash = new Hashtable<Character, Boolean>();
		for(int i=0; i<str.length(); i++)
		{
			if(uniqueHash.isEmpty())
				uniqueHash.put(str.charAt(i), true);
			else if(uniqueHash.containsKey(str.charAt(i)))
			{
				hasDups = true;
				break;
			}
		}
		return hasDups;
	}
	
	private static void zeroing(int[][] myMatrix, int m, int n)
	{
		int[] row = new int[myMatrix.length];
		int[] col = new int[myMatrix[0].length];
		int k=0;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(myMatrix[i][j] == 0)
				{	
					System.out.println("hello "+ i + " " + j);
					row[i] = 1;
					col[j]= 1;
					//k++;
				}
			}
		}
		//System.out.println(zeroStore);
		
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(row[i] == 1 || col[j] == 1)
				{
					myMatrix[i][j] = 0;
				}
			}
		}
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(myMatrix[i][j] + " ");
				
			}
			System.out.println();
		}
	}
	
	private static boolean isSubstring(String str1, String str2)
	{
		boolean substr = false;
		String doubleStr = str1 + str1;
		if(doubleStr.contains(str2))
		{
			substr = true;
		}
		return substr;
	}
}
