package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PalindromePermutation {

	public static void main(String[] args) {
		String myString = "aabbcaabb";
		printPalinPerm(myString);
	}

	private static void printPalinPerm(String myString) {
		// TODO Auto-generated method stub

		int[] freq = new int[myString.length()];
		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < myString.length(); i++) {
			if (!charList.contains(myString.charAt(i))) {
				
				
				charList.add(myString.charAt(i));
				freq[charList.indexOf(myString.charAt(i))] = 1;
				System.out.println(charList.get(charList.indexOf(myString.charAt(i))) + " , " + freq[charList.indexOf(myString.charAt(i))]);

			} else {

				freq[charList.indexOf(myString.charAt(i))]++;
				System.out.println(charList.get(charList.indexOf(myString.charAt(i))) + " , " + freq[charList.indexOf(myString.charAt(i))]);
			}
			
		}
		
		if(charList.size() <= 1)
		{
			
		}
		
		System.out.println("---------");
		for(int j=0; j<charList.size(); j++)
		{
			System.out.println(charList.get(j));
			System.out.println(freq[j]);
		}

		if (isPalindromic(freq)) {
			
			//lets create a substring of all the chars occurring twice and another for odd occurrence
			
			StringBuilder evenChars = new StringBuilder();
			char singleChar = '\0';
			for(int i=0; i< freq.length && freq[i] > 0; i++)
			{
				if(freq[i]%2 == 0 && freq[i] > 0)
				{
					for(int k=1; k<= freq[i]/2; k++)
					evenChars.append(charList.get(i));
				}
				else if(freq[i]%2 != 0 && freq[i] > 0)
				{
					singleChar = charList.get(i);
				}
			}
			System.out.println(evenChars);
			String tempEvenChars = new String(evenChars);
			char[] evenCharsArray = tempEvenChars.toCharArray();
			printPerms(evenCharsArray, singleChar, 0, evenChars.length());
		}

	}

	private static void printPerms(char[] evenCharsArray, char singleChar, int start, int length) {
		
		if(start >= length)
		{
			String tempPermuted = new String(evenCharsArray);
			StringBuilder permutedString = new StringBuilder(tempPermuted);
			StringBuilder reversablePermString = permutedString;
			String reverse = new String(reversablePermString.reverse());
			String finalPerm = tempPermuted + singleChar + reverse;
			System.out.println(finalPerm);
			return;
			
		}
		
		char temp;
		for(int i=start; i<length; i++)
		{
			temp = evenCharsArray[i];
			evenCharsArray[i] = evenCharsArray[start];
			evenCharsArray[start] = temp;
			
			printPerms(evenCharsArray, singleChar, start+1, length);
			
			temp = evenCharsArray[i];
			evenCharsArray[i] = evenCharsArray[start];
			evenCharsArray[start] = temp;
		}
		
	}

	

	private static boolean isPalindromic(int[] freq) {
		// TODO Auto-generated method stub
		Boolean isPalin = true;
		int oddOcc = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] % 2 != 0 && oddOcc >= 1) {
				return false;
			}
		}

		return isPalin;
	}

}
