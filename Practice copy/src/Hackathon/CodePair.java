package Hackathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodePair {

	static int[] arrayA;
	static int[]  arrayB;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		arrayA = new int[n];
		arrayB = new int[5];
		int i= 0;
		while(i<m)
		{
			arrayB[i] = i+1;
			i++;
		}
		
		i=0;
		while(i < n)
		{
			arrayA[i] = sc.nextInt();
			i++;
		}
		
		while(q!=0)
		{
			
			int query=0, int1, int2;
			query = sc.nextInt();
			int1 = sc.nextInt();
			int2 = sc.nextInt();
			
			switch(query)
			{
			case 1: update(int1, int2);
					break;
					
			case 2: System.out.println(distinctPairs(int1, int2));
					break;
					
			case 3:  reverse(int1, int2);
					break;
			
			}
			q--;
		}
		
	}

	private static void reverse(int int1, int int2) {
		// TODO Auto-generated method stub
		int i = int1-1;
		int j = int2-1;
		int temp;
		//System.out.println("hiii: " + int1 + "  " + int2 + " " + arrayB[i] + " " + arrayB[j]);
		while(i<j)
		{
			//System.out.println(arrayB[i] + " X " + arrayB[j]);
			temp = arrayB[j];
			arrayB[j] = arrayB[i];
			arrayB[i] = temp;
			i++;
			j--;
		}
		

	}

	private static int distinctPairs(int int1, int int2) {
		if(int1 > int2)
			return 0;
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<arrayA.length; i++)
		{
			for(int j=0; j<arrayB.length; j++)
			{
				sum = arrayA[i] + arrayB[j];
				if(sum >=int1 && sum<=int2)
				{
					count++;
				}
			}
		}
		return count;
	}

	private static void update(int int1, int int2) {
		// TODO Auto-generated method stub
		//System.out.println(int1 + "---" + int2);
		arrayA[int1-1] = int2;
		
	}
}
