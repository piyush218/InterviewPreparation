package OtherPrograms;
//strings “+100.”, “5e2”, “-.123”, “3.1416”, and “-1E-16” stand for numbers, but “12e”, “1a3.14”,
//“1.2.3”, “+-5”, and “12e+5.4” do not.
public class IsNumeric {

	public static void main(String[] args)
	{
		String str = "12e+5.4";
		System.out.println(isNum(str));
	}

	private static boolean isNum(String str) {
		boolean countSign = false, countDot = false, countE = false, countHyphen = false, isNumeric = true;
		for(int i=0; i<str.length();)
		{
			if((str.charAt(i) == '+'||str.charAt(i)=='-') && i==0 && countSign==false)
			{
				countSign = true;
				i++;
			}
			else if(str.charAt(i)>'0' && str.charAt(i)<'9')
			{
				i++;
			}
			else if(countE == false && i!=str.length()-1 && (str.charAt(i)=='E' || str.charAt(i) == 'e'))
			{
				countE = true;
				i++;
			}
			else if(str.charAt(i)=='-' && countE == true && countHyphen == false && (str.charAt(i-1)=='E' || str.charAt(i-1)=='e'))
			{
				countHyphen = true;
				i++;
			}
			else if(str.charAt(i) == '.' && countDot == false)
			{
				countDot = true;
				i++;
			}
			
			else
			{
				isNumeric = false;
				return isNumeric;
			}
		}
		return isNumeric;
	}
}
