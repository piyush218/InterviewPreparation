package Strings;

/*Find if the characters of the sample string is in the same order in the text string.
 * Give a simple algo.. 
Eg.. TextString: abcNjhgAhGjhfhAljhRkhgRbhjbevfhO 
Sample string :NAGARRO


 * 
 * */
public class OrderInString {
	
	public static void main(String[] args)
	{
		String textString = "abcNjhgAhGjhfhAljhRkhgRbhjbevfhO";
		String myString = "abc";
		
		boolean result = checkOrder(textString, myString);
		System.out.println("Result: " + result);
	}

	private static boolean checkOrder(String textString, String myString) {
		// TODO Auto-generated method stub
		boolean result = true;
		int i=0, j=0;
		for(; i<textString.length() && j<myString.length(); i++)
		{
			if(textString.charAt(i) == myString.charAt(j))
			{
				j++;
			}
		}
		if(i >= textString.length() && j < myString.length())
		{
			result = false;
		}
		return result;
	}

}
