package Others;
/*Count set (=1) bits in an integer
 * */
public class Count1s {
	
	public static void main(String[] args)
	{
		int num = 2;
		int result = count(num);
		System.out.println("Result: " + result);
	}

	private static int count(int num) {
		
		int count = 0;
		while(num > 0)
		{
			count++;
			num &= num - 1;
		}
		return count;
	}

}
