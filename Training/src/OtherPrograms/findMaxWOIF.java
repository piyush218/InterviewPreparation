package OtherPrograms;

public class findMaxWOIF {

	public static void main(String[] args)
	{
		System.out.println(findMax(2,5));
	}

	private static int findMax(int a, int b) {
		int c = a-b;
		int k = Math.abs(c >> 31);
		System.out.println(k);
		return a-k*c;
	}
}
