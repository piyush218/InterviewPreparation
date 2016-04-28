package Strings;

public class MaxRepeat {
	public static void main(String[] args)
	{
		String str = "hdgdhhhhdhdjdhhhh";
		char maxRepeat = maxRepeatingChar(str);
		System.out.println(maxRepeat);
	}

	private static char maxRepeatingChar(String str) {
		char[] strArray = str.toCharArray();
		int count[] = new int[128];
		int max = 0;
		char reqChar = '\n';
		for (int i = 0; i < str.length(); i++) 
		{
		count[strArray[i]]++; 
		if (max < count[strArray[i]]) 
		{
		max = count[strArray[i]];
		reqChar = strArray[i];
		}
		}
 
        return reqChar;
		
	}

}
