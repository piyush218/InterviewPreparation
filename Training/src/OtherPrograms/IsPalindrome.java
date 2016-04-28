package OtherPrograms;

public class IsPalindrome {
	public static int[] main(String[] args)
	{
		String str = "level";
		int start = 0;
		int end = str.length() - 1;
		char s,e;
		while(start < end)
		{
			s = str.charAt(start);
			e = str.charAt(end);
			if(s != e)
			{
				System.out.println("Not Palindrome");
				break;
			}
			start++;
			end--;
		}
		if(start == end)
		{
			System.out.println("It is Palindrome");
			System.out.println(str.substring(1, str.length()-1));
		}
		return new int[5];
	}
}
