package Others;

public class SwapNumsWOTemp {
	
	public static void main(String[] args)
	{
		int a = 2;
		int b = 3;
		swapAddSub(a, b);
		swapBitwise(a, b);
		swapMulDiv(a, b);
	}

	private static void swapMulDiv(int a, int b) {
		// TODO Auto-generated method stub
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a + "  " + b);
		
	}

	private static void swapBitwise(int a, int b) {
		// TODO Auto-generated method stub
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a + "  " + b);
		
	}

	private static void swapAddSub(int a, int b) {
		// TODO Auto-generated method stub
		a = a+b;
		b = a-b; 
		a = a-b;
		System.out.println(a + "  " + b);
		
	}

}
