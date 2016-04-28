package OtherPrograms;
//Given an array of integers find the element for which the sum of left = sum of right. example -1 100 1 98 1 should return index of 1 i.e 2
public class Amazon {

	public static void main(String[] args)
	{
		int[] a = {9,3,2,1,1,3,6};
//		int[] a = {1};
		findMid(a);
//		byte b = 000101;
//		byte c = 000100;
//		consecutiveBinary(b,c);
	}

	private static void consecutiveBinary(byte b, byte c) {
		if(b+1 == c)
		{
			System.out.println("True");
		}
		else if (c+1 == b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

	private static void findMid(int[] a) {
		
		int start=0;
		int end = a.length-1;
		int suml = a[start];
		int sumr = a[end];
		boolean f = false;
		if(suml == sumr && end-start==2)
		{
			System.out.println("The required element is: " + a[0] + " at 0 ");
			return;
		}
		
		while(end>start)
		{
			if(suml >sumr)
			{
				end--;
				sumr += a[end];
			}
			else
			{
				start++;
				suml += a[start];
			}
			
			if(suml == sumr && end - start == 2)
			{
				//System.out.println(start + "  " +end);
				System.out.println("The required element is: " + a[++start] + " at " + start);
				f=true;
				break;
			}
			
		}
		
		if(!f){
			System.out.println("No such element!");
		}
	}
}
