package OtherPrograms;

import java.util.Arrays;

public class Abc {

	public static void main(String[] args)
	{
		String a= "aab";
		String b = "baa".toLowerCase();
		System.out.println(countSwaps(b, a, 0));
	}

	private static int countSwaps(String b, String a, int count) {
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();
		char[] C = new char[a.length()];
		for(int i=0; i<A.length; i++)
		{
			if(A[i] != B[i])
			{
				count++;
				
			}
		}
		
		return count;
		
	}
}
