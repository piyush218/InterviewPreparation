package Strings;

public class LexicSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ssat";
		String subStr = findSubStr(str);
		System.out.println(subStr);

	}

	private static String findSubStr(String str) {
		
		if(str.length() <= 1)
		{
			return str;
		}
		int sum1=0, sum2=0;
		int start = 1;
		for(int i=0, j=start; j<str.length();)
		{
			if(str.charAt(i) > str.charAt(j))
			{
				j++;
				start = j;
			}else{
				j++;
				i++;
			}
		}
	
		return str.substring(start);
	}

}
