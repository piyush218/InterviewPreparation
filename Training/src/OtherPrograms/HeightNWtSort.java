package OtherPrograms;

import java.util.ArrayList;

public class HeightNWtSort {

	public static void main(String[] args)
	{
		//ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		Integer[][] list = {{65,100},{70,100},{56,90},{75,190},{60,95},{68,110}};
		sort(list);
		//list.add(e);
	}

	private static void sort(Integer[][] list) {
		
		Integer[] min = list[0];
		Integer[] temp;
		for(int i=0; i<list.length; i++)
		{	
			min = list[i];
			for(int  j=i+1; j<list.length; j++)
			{	
				System.out.println("min[0]= "+ min[0] + "list[j][0]" + list[j][0]);
				if(list[i][0] > list[j][0])
				{
					System.out.println("swapping");
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
					
				}
				System.out.println("-------Done with " + list[i][0]);
			}
		}
		//System.out.println(list[0][0]);
		
		for(int i=0; i<list.length; i++)
		{
			System.out.println(list[i][0] + "," + list[i][1]);
		}
		System.out.println("-------------------");
		for(int i=1; i<list.length; i++)
		{
			if(list[i-1][1]>list[i][1])
			{
				list[i][0] = 0;
				list[i][1] = 0;
			}
		}
		for(int i=0; i<list.length; i++)
		{
			System.out.println(list[i][0] + "," + list[i][1]);
		}
	}
}
