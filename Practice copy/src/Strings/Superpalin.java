package Strings;

import java.io.*;

class Superpalin {
	public static void main(String agrs[]) throws IOException {
		Long num = 9999999999999999L;
		getSuperPalin(num);
	}

	private static void getSuperPalin(Long num) {

		Long numCopy = num, mod, reverseNum=0L;
		Long square = 0L, revSqNum = 0L, squareCopy;
		
		//Reverse the number
		while(numCopy != 0) 
		{
			mod = numCopy % 10;
			reverseNum = reverseNum * 10 + mod;
			numCopy = numCopy / 10;
		}
		
		System.out.println(reverseNum.equals(num));
		System.out.println(num);
		System.out.println(reverseNum);
		
		if (reverseNum.equals(num)) // if the number is a palindrome
		{
			square = numCopy * numCopy;
			squareCopy = square;
			//find reverse of square
			while (squareCopy != 0) {
				mod = squareCopy % 10;
				revSqNum = revSqNum * 10 + mod;
				squareCopy = squareCopy / 10;
			}
			
			if (revSqNum.equals(square)) {
				System.out.println(num + " is a super palindrome as well as palindrome no.");
			} else {
				System.out.println(num + " is only a palindrome no.");
			}
		} else {
			System.out.println(num + " is niether a super palindrome nor palindrome no.");
		}
	}

}
