package Hackathon;

import java.util.Scanner;

public class ChemicalLocha {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		
		System.out.println(findResult(T, N));
	}

	private static int findResult(int t, int n) {
		// TODO Auto-generated method stub
		int res = 0;
		int block =0;
		for(int k=1; k<=n; )
		{
			int i = k;
			if(i%2 == 0)
			{
				block = i/2;
				
			}
			else
				block = i/2 + 1;
			
			
			if(block%2 == 0)
			{
				
				t = t + i/2 + 1;
				
				if(k==n)
					break;
				k++;
				//i++;
				//System.out.println("at " + i + ": t: " + t);
				t = t + i/2 + 1;
				
				if(k==n)
					break;
				//System.out.println("at " + (i+1) + ": t: " + t);
				i = i+2;
				k++;
			}
			else
			{
				
				t = t - i/2 -1;
				//System.out.println("at " + i + ": t: " + t);
				
				if(k==n)
					break;
				
				k++;
				t = t - i/2 - 1;
				//System.out.println("at " + (i+1) + ": t: " + t);
				
				if(k==n)
					break;
				i = i+2;
				k++;
			}
			
		
			
		}
		

		return t;
	}

}
