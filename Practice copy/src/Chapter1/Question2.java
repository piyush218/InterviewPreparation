package Chapter1;

public class Question2 {

	public static void main(String[] args)
	{
		String str = "a";
		System.out.println("Reversed String: " + rev(str));
	}

	private static String rev(String str) {
		// TODO Auto-generated method stub
		if(str==null || str.length()==1)
			return str;
		
		int start = 0, end = str.length()-1;
		char helper;
		char[] strArray = str.toCharArray();
		while(start < end)
		{
			helper = str.charAt(start);
			strArray[start] = strArray[end];
			strArray[end] = helper;
			start++;
			end--;
		}
		str = new String(strArray);
		return str;
	}
}
