package Others;

public class PalinPartition {

	public static void main(String[] args) {
		String myStr = "geeks";
		printPalins(myStr);

	}

	private static void printPalins(String myStr) {
		
		if(myStr.length() <= 1)
		{
			System.out.println(myStr);
			return;
		}
		
		int windowSize;
		for(int i=1; i<=myStr.length(); i++)
		{
			windowSize = i;
			for(int j=0; j+windowSize <= myStr.length(); j++)
			{
				if(isPalindrome(myStr.substring(j, j+windowSize))){
					System.out.print(myStr.substring(j, j+windowSize) + " ");
				}else
				{
					System.out.println();
				}
			}
			System.out.println();
			
		}
	}

	private static boolean isPalindrome(String subStr) {
		if(subStr.length() <= 1)
			return true;
		
		int start = 0;
		int end = subStr.length()-1;
		while(start < end)
		{
			if(subStr.charAt(start) != subStr.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
