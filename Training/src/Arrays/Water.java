package Arrays;

public class Water {

	public static void main(String[] args)
	{
		int[] histogram = {3,2,1};
		int water = countWater(histogram);
		System.out.println("Water is " + water);
	}

	private static int countWater(int[] histogram) {
		int count = 0, j, k;
		for(int i=0; i<histogram.length-1;)
		{
			j = i+1;
			if(histogram[i] > histogram[j])
			{
				k = i+1;
				while(j<histogram.length-1 && histogram[j+1] > histogram[j] )
				{
					j++;
				}
				while(k != j)
				{
					if(histogram[i] < histogram[j])
					{
						count += histogram[i]-histogram[k];
						
					}
					else
					{
						count += histogram[j]-histogram[k];
					}
					k++;
				}
				i=j;
			}
			else
			{
				i++;
			}
		}
		return count;
	}
}
