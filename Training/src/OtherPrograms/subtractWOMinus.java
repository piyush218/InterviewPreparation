package OtherPrograms;
/*Subtract two numbers without using arithmatic subtract operation.	
 * idea revolves around the bit manipulations. The whole idea is the following:
 * x	y	diff	borrower
 * 0	0	0		0
 * 1	0	1		0
 * 0	1	1		1
 * 1	1	0		0
 * */

public class subtractWOMinus {

	public static int subtract(int x, int y){
		while (y != 0) {
			int borrower = (~x) & y;
			x = x ^ y;
			y = borrower << 1;
		}
		return x;
	}
	
	public static int addition(int x, int y){
		while (y != 0) {
			int borrower = x & y;
			x = x ^ y;
			y = borrower << 1;
		}
		return x;
	}
	
	public static void main(String[] args)
	{
		int resultSub = subtract(5,2);
		int resultAdd = addition(5,2);
		System.out.println("Result is Subtration "+ resultSub);
		System.out.println("Result is Addtion "+ resultAdd);
	}
}
