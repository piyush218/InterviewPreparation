package Strings;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args)
	{
		String str1  ="aac";
		String str2 = "xxz";
		System.out.println(isIso(str1, str2));
	}

	private static boolean isIso(String str1, String str2) {
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		HashMap<Character, Character> map = new HashMap<>();
		int i =0;
		while(i < str1.length())
		{
			
		}
		
		return true;
	}
}
