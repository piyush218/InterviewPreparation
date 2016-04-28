package OtherPrograms;
/*Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
EXAMPLE:
input: 3 (e.g., 3 pairs of parentheses)
output: ()()(), ()(()), (())(), ((()))
 * */
public class Parenthesis {
	
	public static void main(String[] args)
	{
		int n = 3;
		char[] res = new char[n*2];
		printParan(n, n, res, 0);
	}
// From cracking the coding interviews yet it doesnot work!!
	private static void printParan(int l, int r,  char[] res, int count) 
	{
		if(l<0 && r<0)
		{
			return;
		}
		else if(l==0 && r==0)
		{
			for(int i=0; i<count; i++)
			System.out.print(res[i]);
			System.out.println();
			return;
		}
		else if(l>0)
		{
			res[count] = '(';
			count++;
			printParan(l-1, r, res, count);
		}
		else if(r>l)
		{
			res[count] = ')';
			count++;
			printParan(l, r-1, res, count);
		}
	}
}
