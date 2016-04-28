package OtherPrograms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class oddOccurnce {

	public static int lonelyinteger(int[] a) {
	    int res = 0;
	    for(int i = 0; i<a.length; i++)
	        {
	        res = res ^ a[i];
	    }
	return res;

	    }
	public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        int res;
//	        
//	        int _a_size = Integer.parseInt(in.nextLine());
//	        int[] _a = new int[_a_size];
//	        int _a_item;
//	        String next = in.nextLine();
//	        String[] next_split = next.split(" ");
////	        
//	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
//	            _a_item = Integer.parseInt(next_split[_a_i]);
//	            _a[_a_i] = _a_item;
//	        }
		
		//Uncomment the below lines to run lonelyinteger() 
//	        int[] a = {4,5,6,7,6,4,5};
//	        int res = lonelyinteger(a);
//	        System.out.println(res);
//
		String a = "123454"; //Just trying out simple stuff
		String r = "\\d+";
		System.out.println(a.matches(r));
		char c = '2';
		int x = Character.getNumericValue(c);
		System.out.println(x);
		
		//System.out.println(nb.length());
		//System.out.println(nb ^ (int)(Math.pow(2, Math.ceil(Math.log(nb)/Math.log(2))) -1);
//		int mask = (1 << 32) - 1;
//		System.out.println(~n & mask);
		    Scanner scan = new Scanner(System.in);
	        int l = scan.nextInt();
	        while(l!=0)
	        {
	            int n = scan.nextInt();
	            fn(n);
	            l--;
	        }
	        
	    }
	    static void fn(int n)
	        {
	        String nb = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');;
		    char[] nb1 = nb.toCharArray();
			for(int i=nb1.length-1; i>=0; i--)
			{
				if(nb1[i] == '0')
				{
					nb1[i] = '1'; 
				}
				else
				{
					nb1[i] = '0';
				}
			}
			String result = new String(nb1);
			Long i = Long.parseLong(result, 2);
	        System.out.println(i);
	    }
	}
	


