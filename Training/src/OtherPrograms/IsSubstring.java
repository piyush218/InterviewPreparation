package OtherPrograms;
//This program check only the sequence and not exactly if it is
//a substring or not.
public class IsSubstring {

	public static void main(String[] args)
	{
		String str1 = "pqr";
		String str2 = "ppqr";
		System.out.println(isSubsequence(str1, str2));
		System.out.println(isSubseqRec(str1, str2, str1.length(), str2.length()));
		System.out.println(isStr(str1, str2));
		
	}

	private static boolean isSubsequence(String str1, String str2) {
		boolean isSubstr = true;
		int i=0;
		for(int j=0; i<str1.length() && j<str2.length();)
		{
			if(str1.charAt(i) == str2.charAt(j))
				{
					i++;
				}
			
			j++;
		}
		if(i!=str1.length())
			isSubstr = false;
		return isSubstr;
	}
	
	private static boolean isSubseqRec(String str1, String str2, int size1, int size2) {
		if(size1==0)//string to be checked is null
			return true;
		if(size2 == 0)
			return false;
		if(str1.charAt(size1-1) == str2.charAt(size2-1))
			return isSubseqRec(str1, str2, size1-1, size2-1);
		else
			return isSubseqRec(str1, str2, size1, size2-1);
		
	}
	
	private static boolean isStr(String str1, String str2) {
		boolean isSubstr = true;
		int i=0;
		for(int j=0; i<str1.length() && j<str2.length();)
		{
			if(str1.charAt(i) == str2.charAt(j))
			{
				int help = j;
				while(i<str1.length())
				{
					if(str1.charAt(i) != str2.charAt(help))
						break;
					i++;
					help++;
				}
				if(i >= str1.length())
					break;
				else
					i = 0;
			}
			j++;
		}
		if(i!=str1.length())
			isSubstr = false;
		return isSubstr;
	}
	
}
