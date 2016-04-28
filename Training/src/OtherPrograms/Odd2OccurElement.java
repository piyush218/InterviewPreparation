package OtherPrograms;
// Q. Find the number of different bits between 2 numbers. Eg. 010=2 & 101=5, number of different bits: 3
public class Odd2OccurElement {

	public static void main(String[] args)
	{
		// Find the only element occuring odd number of times:
		int[] singleOdd = {2,6,4,8,10,12,6,2,4,12,10};// array with only one element occurring odd no. of times
		int oddElement = findOdd(singleOdd);
		//System.out.println("SingleOdd: " + oddElement);
		
		//Find the 2 elements occuring odd number of times
		int[] doubleOdd = {2,6,4,8,10,12,6,2,4,12};// array with 2 elements occuring odd number of times
		find2Odd(doubleOdd);
		
		//find the number of bits which are different in one element from another.
		int a = 27;
		int b = 45;
		int diff = numberOfDiffBits(a, b);
		System.out.println("Number of different bits: " + diff);
	}

	private static int numberOfDiffBits(int a, int b) {
		int xor = a ^ b;
		int bitCount = 0;//stores the no. of bits
		while(xor != 0)
		{
			bitCount++;
			xor = (xor-1) & xor;

		}
		return bitCount;
	}

	private static void find2Odd(int[] doubleOdd) {
		//find XOR of all elements, which means effectively we are finding XOR of the 2 elements occurring odd number of times
		int xor = 0;
		for(int i=0; i<doubleOdd.length; i++)
		{
			xor ^=doubleOdd[i];
		}
		//to find out the first '1' bit of xor from right we do the following:
		int firstSetBit = xor & ~(xor-1);
		int x=0,y=0; // our two odd occurring elements
		//now we are going to separate the list on the basis of the set bit in xor as that 
		//is the bit that can
		//partition the list with the 2 elements appearing in separate lists and xor 
		//both of them individaully
		for(int i=0;i<doubleOdd.length; i++)
		{
			if((doubleOdd[i] & firstSetBit) != 0)
				x ^= doubleOdd[i];
			else
				y ^= doubleOdd[i];
		}
		System.out.println("The two elements are " + x + " , " + y);
		return;
	}

	private static int findOdd(int[] singleOdd) {
		int oddElement = 0;
		for(int i=0; i<singleOdd.length; i++)
		{
			oddElement ^= singleOdd[i];
		}
		return oddElement;
	}
}
