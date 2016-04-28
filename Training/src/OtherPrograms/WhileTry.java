package OtherPrograms;
//Using break as GoTo
public class WhileTry {

	public static void main(String[] args)
	{
		int a = 1;
		int b = 0;
		A:
		while(a<10)
		{
			while(true)
			{
				b++;
				if(a == b)
				{
					System.out.println("breaking");
					break A;
				}
				System.out.println("Hello");
			}
			//a++;
			//System.out.println("a= " + a);
		}
		System.out.println("a= "+ a + "b= " + b);
	}
}
