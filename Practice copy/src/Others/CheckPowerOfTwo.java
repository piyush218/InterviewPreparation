package Others;

public class CheckPowerOfTwo {

	public static void main(String[] args)
	{
		int num = -1;
		boolean result = checkForPowTwo(num);
		System.out.println("Result: " + result);
	}

	private static boolean checkForPowTwo(int num) {
		if(num < 0)
		{
			return false;
		}
		int negNum = -1;
		if((num & (num * negNum)) == num)
			return true;
		else
			return false;
	}
}
