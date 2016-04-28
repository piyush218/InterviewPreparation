package Chapter1;

public class Question5 {

	public static void main(String[] args)
	{
		String str = "abccccc";
		System.out.println("Compressed string: " + compress(str));
	}

	private static String compress(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		int count = 0, i=0;
		while(i<str.length())
		{
			
			count++;
			if(i+1<str.length() && str.charAt(i) != str.charAt(i+1))
			{
				sb.append(str.charAt(i));
				sb.append(count);
				count = 0;
			}
			if(i+1>=str.length())
			{
				sb.append(str.charAt(i));
				sb.append(count);
			}
			i++;
			
		}
		
		if(sb.length() < str.length())
			str = sb.toString();
		
		return str;
	}
}
