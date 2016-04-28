package Strings;

public class OnesTwosComplement {
	
	public static void main(String[] args)
	{
		String myString = "0000";
		getComplement(myString);
	}

	private static void getComplement(String myString) {
		
		char[] stringArray = myString.toCharArray();
		String onesComp = null;
		String twosComp = null;
//		
//		for(int k=0; k<stringArray.length; k++)
//		{
//			System.out.print(stringArray[k] + "  ");
//		}
		
		for(int i=stringArray.length-1; i>=0; i--)
		{
			if(stringArray[i] == '0')
			{
				stringArray[i] = '1';
			}
			else
			{
				stringArray[i] = '0';
			}
		}
		
//		for(int k=0; k<stringArray.length; k++)
//		{
//			System.out.print(stringArray[k] + "  ");
//		}
		
		onesComp = new String(stringArray);
		System.out.println("Ones Complement: " + onesComp);
		
		//Twos complement
		boolean flag = false;
		int i=stringArray.length-1;
		
		for(; i>=0; i--)
		{
			if(stringArray[i] == '0')
			{
				stringArray[i] = '1';
				flag = true;
				break;
			}else{
				stringArray[i] = '0';
			}
			
		}
//		for(int k=0; k<stringArray.length; k++)
//		{
//			System.out.print(stringArray[k] + "  ");
//		}
		twosComp = new String(stringArray);
		
		if(!flag && i <= 0)
		{
			twosComp = "1" + twosComp;
		}
		
		System.out.println("Twos Complement: " + twosComp);
	}

}
