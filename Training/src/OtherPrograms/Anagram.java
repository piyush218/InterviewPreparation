package OtherPrograms;

import java.util.Hashtable;

public class Anagram {

	public static void main(String[] args)
	{
		String s1 = "abcabsj";
		String s2 = "bacsjab";
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		Hashtable<Character, Integer> myTable = new Hashtable<Character, Integer>();
		boolean f = true;
		int value;
		if(s1.length() != s2.length())
		{
			f=false;
			return f;
		}
		for(int i=0; i<s1.length();i++){
			value = 0;
			System.out.println(s1.charAt(i) + "  " + s2.charAt(i));
			if(myTable.containsKey(s1.charAt(i)))
			{
				System.out.println("hello");
				value = myTable.get(s1.charAt(i));
			}
				myTable.put(s1.charAt(i), value + 1);
				
			value = 0;
			if(myTable.containsKey(s2.charAt(i)))
			{
				value = myTable.get(s2.charAt(i));
			}
			myTable.put(s2.charAt(i), value - 1);
			
		}
		
		for(int p : myTable.values())
		{
			if(p!=0)
			{
				f=false;
			}
		}
		return f;
	}
	
}
