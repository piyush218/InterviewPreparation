package Others;

public class ConsecutiveSumOfN {
	
	public static void main(String[] args)
	{
		int num = 5;
		getConsecutives(num);
	}

	private static void getConsecutives(int num) {
		// TODO Auto-generated method stub
		int sum = 0, i=0, j=0;
		for(i=0, j=0; sum != num;)
		{
			
			
			if(sum < num)
			{
				j++;
				System.out.println("sum: " + sum + "  adding: " + j);
				sum += j;
				
			}
			else
			{
				i++;
				System.out.println("sum: " + sum + "  subtracting: " + i);
				
				sum -= i;
			}
		}
		System.out.println("The consecutive numbers are: ");
		i++;
		while(i < j)
		{
			System.out.print(i + ", ");
			i++;
		}
		
		System.out.println(j);
	}

}
