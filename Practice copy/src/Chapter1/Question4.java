package Chapter1;

public class Question4 {

	public static void main(String[] args)
	{
		String str = "Mr John Smith    ";
		System.out.println("Resultant String: " + result(str));
	}

	private static String result(String str) {
		int left = str.length()-1, right = str.length()-1;
		//finding left position
		System.out.println(str.charAt(right) == ' ');
		while(str.charAt(left) == ' ' )
		{
			left--;
		}
//		System.out.println("left at: " + left + "--> "+str.charAt(left));
		char[] strArray = str.toCharArray();
		while(left >0)
		{
			if(strArray[left] == ' ')
			{
				strArray[right--]='0';
				strArray[right--] = '2';
				strArray[right]='%';
			}
			else
			{
				strArray[right] = strArray[left];
				
			}
			left--;
			right--;
			
		}
		str = new String(strArray);
		return str;
	}
}
