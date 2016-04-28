package OtherPrograms;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = scan.nextInt();
		System.out.println();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		int lcm = 0;
		if(a == 0 || b == 0)
		{
			lcm = 0;
		}
		else if(a<b)
		{	
			int i=2;
			while(true)
			{
				if((b*i)%a == 0)
				{
					lcm = b*i;
					break;
				}
				i++;
			}
		}
		else if(a>b)
		{
			int i=2;
			while(true)
			{
				if((a*i)%b == 0)
				{
					lcm = a*i;
					break;
				}
				i++;
			}
		}
		else
		{
			lcm = a;
		}
		
		System.out.println("LCM is " + lcm);
	}
}
