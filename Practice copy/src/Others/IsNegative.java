package Others;

public class IsNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		boolean result = isNeg(num);
		System.out.println("num is negative: " + result);
	}

	private static boolean isNeg(int num) {
		// TODO Auto-generated method stub
		if(num >> 31 != 0)
			return true;
		else 
			return false;
	}

}
 