package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*Given an array of words (i.e. ["ABCW", "BAZ", "FOO", "BAR", "XTFN", "ABCDEF"]), 
 * find the max value of length(s) * length(t), where s and t are words from the array. 
 * The catch here is that the two words cannot share any characters. 
 * */
public class WordLengthMultiply {

	public static void main(String[] args) {
		String[] words = {"ABCW", "BAZ", "FOO", "BAR", "XTFN", "ABCDEF"};
		int result = getMaxMultiple(words);
		System.out.println(result);

	}

	private static int getMaxMultiple(String[] words) {
		ArrayList<boolean[]> mesh = new ArrayList<>();
		int x = 'A';
		System.out.println(x);
		for(int i=0; i<words.length; i++)
		{
			boolean[] tracker = new boolean[26];
			for(int j=0; j<words[i].length(); j++)
			{
				int val = words[i].charAt(j);
				tracker[val - 65] = true;
			}
			mesh.add(tracker);
			
		}
		
		System.out.println(mesh);
		
		int maxMul = 0;
		int maxTemp = 0;
		boolean appropriate = true;
		
		for(int i=0; i<words.length; i++)
		{
			for(int j=1; j<words.length; j++)
			{
				appropriate = true;
				for(int k=0; k<words[j].length(); k++)
				{
					if(mesh.get(i)[words[j].charAt(k) - 65] == true )
					{
						appropriate = false;
					}
				}
				if(appropriate && maxMul < words[i].length() * words[j].length())
				{
					maxMul = words[i].length() * words[j].length();
				}
			}
		}
		
		return maxMul;
	}

}
