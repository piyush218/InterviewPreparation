package OtherPrograms;

import java.util.HashMap;

public class AnagramArraySort {

	public static void main(String[] args)
	{
		String[] anaArray = {"abc","ljk", "erg", "bca", "jkl", "gre"};
		sort(anaArray);
		//System.out.println(isAnagram("aabc", "baca"));//correct
	}

	private static void sort(String[] anaArray) {
		int j = 0;
		String temp;
		for(int i=0; i<anaArray.length-1;)
		{
			j = findAna(anaArray[i], i, anaArray);//looking for a[i]'s anagram
			temp = anaArray[i+1];
			anaArray[i+1] = anaArray[j];
			anaArray[j] = temp;
			i=i+2;
		}
		for(int i=0; i<anaArray.length; i++)
		{
			System.out.println(anaArray[i]);
		}
	}

	private static int findAna(String str, int i, String[] a) {
		int j=i+1;
		
		for(; j<a.length;j++)
		{
			
			boolean b=isAnagram(str, a[j]);
			
			if(b)
			{
				
				
				break;
			}
			
		}
		return j;
	}

	private static boolean isAnagram(String str, String compare) 
	{
		
		boolean f = true;
		int[] check = new int[256];
		for(int i=0; i<str.length(); i++)
		{
			check[str.charAt(i)]++;
			check[compare.charAt(i)]--;
		}
		
		for(int i = 0; i<str.length(); i++)
		{
			if(check[str.charAt(i)] !=0)
			{				f=false;
				break;
			}
		}
		return f;
	}
	
	private static boolean isAnagramWHash(String str, String compare)
	{
		boolean isAna = true;
		HashMap<Character, Integer> myHash = new HashMap<Character, Integer>();
		if(str.length() != compare.length())
		{
			isAna = false;
			return isAna;
		}
		for(int i=0; i<str.length();i++)
		{
			if(!myHash.containsKey(str.charAt(i)))
			{
				myHash.put(str.charAt(i), 1);
			}
			
		}
		return isAna;
	}
	
	/* function to check whether two strings are anagram of each other */
	public static boolean isAnagram3(String str1, String str2)
	{
		
		if (str1.length() != str2.length())
		      return false;
	    // Create two count arrays and initialize all values as 0
	    int[] count1 = new int[str1.length()];
	    int[] count2 = new int[str2.length()];
	    int i;
	 
	    // For each character in input strings, increment count in
	    // the corresponding count array
	    for (i = 0; i < str1.length();  i++)
	    {
	        count1[i]++;
	        count2[i]++;
	    }
	 
	    // Compare count arrays
	    for (i = 0; i < str1.length(); i++)
	        if (count1[i] != count2[i])
	            return false;
	 
	    return true;
	}
}
