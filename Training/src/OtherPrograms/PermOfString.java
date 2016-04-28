package OtherPrograms;
// Write a method to compute all permutations of a string
public class PermOfString {
	
	public static void main(String[] args)
	{
		String str = "abcd";
		char[] strArray = str.toCharArray();
		perm(strArray, 0, strArray.length);
	}

	private static void perm(char[] strArray, int start, int len) {
		if(start>=len)
		{
			String permutatedString = new String(strArray);
			System.out.println(permutatedString);
			return;
		}
		else
		{
			char temp;
			for(int i=start; i<len; i++)
			{
				//swap strArray[i] & strArray[start]
				temp = strArray[i];//System.out.println("----temp" + temp);
				strArray[i] = strArray[start];
				strArray[start] = temp;
				//recur perm with incremented start
				perm(strArray, start+1, len);
				//swap strArray[i] & strArray[start] again
				temp = strArray[i];//System.out.println("$$temp" + temp);
				strArray[i] = strArray[start];
				strArray[start] = temp;
				
			}
		}
	}
	
}
