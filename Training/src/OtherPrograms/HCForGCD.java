package OtherPrograms;

import java.util.Scanner;

public class HCForGCD {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = scan.nextInt();
		System.out.println();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		int hcf = 0;
		if(a == 0 || b == 0)
		{
			hcf = 0;
		}
		else if(a<b)
		{
			for(int i=a; i>0; i--)
			{
				if(a%i == 0 && b%i == 0)
				{
					hcf = i;
					break;
				}
			}
		}
		else if(a>b)
		{
			for(int i=b; i>0; i--)
			{
				if(a%i == 0 && b%i == 0)
				{
					hcf = i;
					break;
				
				}
			}
		}
		else
		{
			hcf = a;
		}
		
		System.out.println("HCF/GCD is " + hcf);
	}
}
