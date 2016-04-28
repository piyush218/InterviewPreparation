package OtherPrograms;

public class SubsetsRecur {
	
	public static void main(String[] args)
	{
		String set = "ABCD";
		int binary[] = new int[set.length()];
		combination(binary, 1, 4, set);
	}
//Does not work*********************************
	private static void combination(int[] binary, int start, int end, String set) {
		if(start == end)
		{
			binary[start] = 0;
			printSubset(binary, end, set);
			binary[start] = 1;
			printSubset(binary, end, set);
			return;
		}
		binary[start] = 0;
		combination(binary, start++, end, set);
		binary[start] = 1;
		combination(binary, start++, end, set);
	}

	private static void printSubset(int[] binary, int end, String set) 
	{
		int sum = 0;
		for(int i=1; i<=end; i++)
		{	
			if(binary[i] == 1)
			{
				System.out.print(set.charAt(i));
				sum++;
			}
			System.out.println();
		}
		if(sum == 0)
		{
			System.out.println("Null Set");
		}
	}
}
