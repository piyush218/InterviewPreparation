package OtherPrograms;
import java.math.*;

public class Subsets {

	public static void main(String[] args)
	{
		String set = "1234";
		String subset="";
		String binary;
		int n=4;
		for(int i=0; i<Math.pow(2, n); i++)
		{
			binary =String.format("%4s", Integer.toBinaryString(i)).replace(' ', '0');
			//System.out.println(binary);
			subset = "";
			
			for(int j=0; j<n; j++)
			{
				if(binary.charAt(j) == '1')
				{
					subset+= set.charAt(j);
				}
			}
			if(subset == "")
			{
				System.out.println("[ ]");
			}
			else
			System.out.println("[" + subset + "]");
		}
	}
}
