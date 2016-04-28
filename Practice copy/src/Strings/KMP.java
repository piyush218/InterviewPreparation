package Strings;

public class KMP {

	public static void main(String[] args) {
		String myStr = "abcxabcdabcdabcy";
		String subStr = "abcdabcy";
		
		boolean result = kmp(myStr.toCharArray(), subStr.toCharArray());
		System.out.println(result);

	}

	private static boolean kmp(char[] actual, char[] pattern) {
		
		int[] tempArray = computeTempArray(pattern);
		int i=0, j=0;
		
		while(i<actual.length && j<pattern.length ){
			if(actual[i] == pattern[j])
			{
				i++;
				j++;
			}
			else{
				if(j!=0)
					j = tempArray[j-1];
				else
					i++;
			}
		}
		
		if(j == pattern.length)
			return true;
		return false;
	}

	private static int[] computeTempArray(char[] pattern) {
		int[] tempArray = new int[pattern.length];
		int index = 0;
		
		for(int i=1; i<pattern.length;)
		{
			if(pattern[i] == pattern[index])
			{
				tempArray[i] = index + 1;
				index++;
				i++;
			}else{
				if(index != 0)
				{
					index = tempArray[index-1];
					
				}else{
					tempArray[i] = 0;
					i++;
				}
			}
		}
		return tempArray;
	}

}
