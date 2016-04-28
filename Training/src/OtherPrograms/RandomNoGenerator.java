package OtherPrograms;

public class RandomNoGenerator {

	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			printRandom();
		}
		//System.out.println();
	}

	private static void printRandom() {
		long a = Integer.MAX_VALUE;
		long c = 11;
		long b = System.nanoTime();
		long random = Math.abs(a*b +c);
		//long d = random/1000000000;
		System.out.println(random%10);
	}
}
