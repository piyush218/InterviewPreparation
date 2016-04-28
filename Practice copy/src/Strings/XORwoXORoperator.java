package Strings;

public class XORwoXORoperator {

	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		xorNums1(a, b);
		xorNums2(a, b);
	}

	private static void xorNums1(int a, int b) {
		
		String bin1 = Integer.toBinaryString(a);
		String bin2 = Integer.toBinaryString(b);
		StringBuffer sb = new StringBuffer();
		int i = 0;
		
		
		if(bin1.length() != bin2.length())
		{
			int diff = bin1.length() - bin2.length();
			StringBuffer diffBinary = new StringBuffer();
			
			if (diff < 0) {
				while (diff < 0) {
					diffBinary.append(0);
					diff++;
				} 
				bin1 = diffBinary + bin1;
			}
			
			if (diff > 0) {
				while (diff > 0) {
					diffBinary.append(0);
					diff--;
				} 
				bin2 = diffBinary + bin2;
			}
		}
		System.out.println("bin1: " + bin1);
		System.out.println("bin2: " + bin2);
		
		
		while(i < bin1.length())
		{
			if(bin1.charAt(i) == bin2.charAt(i))
				{
					//System.out.println("same");
					sb.append('0');
				}
			else
				{
					//System.out.println("diff");
					sb.append('1');
				}
			
			i++;
		}
		//String result = sb.toString();
		System.out.println("Result: " + sb);
		int c = Integer.parseInt(sb.toString(), 2);
		System.out.println(c);
		
	}
	
	private static void xorNums2(int a, int b)
	{
		int result = (a | b) & (~a | ~b);
		System.out.println("Result: " + result);
	}
	
	
}
