package Chapter1;
//assuming the character set was ASCII 
public class Question3 {

	public static void main(String[] args)
	{
		String str1 = "";
		String str2 = "";
		System.out.println("Is a permutation: " + isPermute(str1 , str2));
	}

	private static boolean isPermute(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length())
			return false;
		
		boolean isPermutation = true;
		int[] charCounter = new int[256];
		int i=0;
		int ascii1, ascii2;
		while(i<str1.length())
		{
			ascii1 = str1.charAt(i);
			ascii2 = str2.charAt(i);
			charCounter[ascii1]++;
			charCounter[ascii2]--;
			i++;
		}
		i=0;
		while(i < charCounter.length)
		{
			if(charCounter[i] != 0)
			{
				isPermutation = false;
				break;
			}
			i++;
		}
		return isPermutation;
	}
}
