package Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMax {
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        while(T !=0)
	        {
	            int N = sc.nextInt();
	            int K = sc.nextInt();
	       
	            System.out.println(findMax(N, K));
	            T--;
	        }
	    }

	private static int findMax(int n, int k) {
		// TODO Auto-generated method stub
		List<Integer> ands = new ArrayList<>();
		if(n == k)
		{
			return 0;
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i+1; j<=n; j++)
			{
				int and = i&j;
				if(and < k)
				{
					//System.out.println(and);
					ands.add(and);
				}
			}
		}
		
		return Collections.max(ands);
		
	}

}
