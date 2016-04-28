package Strings;

/*Given a string that represents an integer with no upper bound (billions, trillions, etc..), 
 * write a function "convert" that returns the integer value of the string. 
 * For example: "1000322" returns 1000322.
 * Try to do this in O(1) space, and O(n) time. Better if possible.
 * 
 * */

public class StringToNum {
	
	public static void main(String[] args)
	{
		String numString = "1000322";
		long num = convert(numString);
		System.out.println(num);
	}

	private static long convert(String numString) {
		
		long num = 0;
		int i=1, pos = numString.length(), helper=0;
		
		
		while(pos > 0)
		{
			pos -= 1;
			helper = Integer.parseInt(numString.substring(pos, pos+1));
			if(helper != 0)
			{
				num += helper * (Math.pow(10, i-1));
			}
			i++;
		}
		
		return num;
	}

}
