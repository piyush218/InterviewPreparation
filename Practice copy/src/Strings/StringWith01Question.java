package Strings;
/*A string consists of ‘0’, ‘1’ and '?'. 
 * The question mark can be either '0' or '1'. Find all possible combinations for a string.
 * */
public class StringWith01Question {
	public static void main(String[] args)
	{
		String binString = "0010?0100?1100?0";
		printAll(binString);
	}

	private static void printAll(String binString) {
		int qs = 0;
		for(int i=0; i<binString.length(); i++)
		{
			if(binString.charAt(i) == '?')
				qs++;
		}
		
		for(int i=0; i <= qs*2; i++)
		{
			String helper = Integer.toBinaryString(i);
			//System.out.println(helper);
			char[] temp = binString.toCharArray();
			for(int j=0, k=helper.length()-1; j<temp.length; j++)
			{
				if(temp[j] == '?'){
					if(k < 0)
					{
						temp[j] = 0;
					}else{
						temp[j] = helper.charAt(k);
						k--;
					}
				}
			}
			
			String finalString = new String(temp);
			System.out.println(finalString + "  -> Length: " + finalString.length());
		}
		
	}
}
