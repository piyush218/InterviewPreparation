package Hackathon;

import java.util.Scanner;

public class MagicString {
	final static String str = "122112122122112112";

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, lim;
		while(n!=0)
		{
			a= sc.nextInt();
			lim = sc.nextInt();
			System.out.println(findResult(a, lim));
			n--;
		}
	}

	private static int findResult(int a, int lim) {
		// TODO Auto-generated method stub
		char req = (char) ('0' + a);
		int count=0, i=0;
		while(i < lim)
		{
			if(str.charAt(i) == req)
			{
				count++;
			}
			i++;
		}
		return count;
	}
}
