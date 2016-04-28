package Chapter1;

public class Question8 {

	public static void main(String[] args)
	{
		String s1 = "waterbottle";
		String s2 = "erbottlewdt";
		System.out.println(isRotationalSubstring(s1, s2));
	}

	private static boolean isRotationalSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() != s2.length())
			return false;
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb.append(s1);
		String s1s1 = new String(sb);
		return s1s1.contains(s2);
	}
}
