package OtherPrograms;
//recursively derive sum of N integer:
public class RecursiveSumofN {

	public static void main(String[] args)
	{
		int n = 5;
		int sum = recSum(n);
		System.out.println(sum);
	}

	private static int recSum(int n) {
		if(n==0)
			return 0;
		else
		{
			return recSum(n-1);
		}
		//return 0;
	}
}
