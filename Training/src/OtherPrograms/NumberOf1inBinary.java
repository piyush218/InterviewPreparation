package OtherPrograms;

import java.util.Scanner;

public class NumberOf1inBinary {

	public static void main(String[] args) {
		int n=11;
		String s = Integer.toBinaryString(n);
		//System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
		int ones = count1s(n);
		System.out.println("Number of 1s: " + ones);
		
		//Power product of 2:
		int p = 16;
		System.out.println("Is power product of 2: " + isPwrProductof2(p));
    }

	private static boolean isPwrProductof2(int p) {
		int x = (p-1) & p;
		//System.out.println(String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0') + "++++ " + String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0'));
		return (p!=0 &&  x==0);
	}

	private static int count1s(int n) {
		int count = 0;
		while(n != 0)
		{
			//System.out.println("** " +String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
			++count;
			//System.out.println(String.format("%8s", Integer.toBinaryString(n-1)).replace(' ', '0'));
			n = (n-1) & n;
			System.out.println("$$ "+String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
		}
		return count;
	}
}
