package OtherPrograms;

public class FiboRecur {

	public static void main(String[] args)
	{
		for(int i=0; i<=5; i++)
		System.out.println(fibo(i));
		//System.out.println(fibo(5));
	}
	public static int fibo(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
			//System.out.println(n);
		}
		else
		{
			//System.out.println(fibo(n-1) + fibo(n-2));
			return (fibo(n-1) + fibo(n-2));
		}
	}
}
