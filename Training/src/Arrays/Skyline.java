package Arrays;
/*Given n rectangular buildings in a 2-dimensional city, computes the skyline of these buildings, eliminating hidden lines.
 * The main task is to view buildings from a side and remove all sections that are not visible.
 * */
public class Skyline {

	public static void main(String[] args)
	{
		int[][] buildings = {{1,11,5}, {2,6,7}, {3,13,9}, {12,7,16}, {14,3,25}, {19,18,22}, {23,13,29}, {24,4,28}};
		//Lets follow divide and conquer technique to get the answer and complexity will be O(nlogn)
		divide(buildings, 0, buildings.length-1);
	}

	private static void divide(int[][] buildings, int start, int end) {
		if(start < end)
		{
			int mid = (start+end)/2;
			divide(buildings, start, mid);
			divide(buildings, mid+1, end);
			merge(buildings, start, mid, end);
		}
	}

	private static void merge(int[][] buildings, int start, int mid, int end) {
		int[][] skyline = new int[buildings.length][2];
		int i = start;
		int j = mid+1;
		int k = start;
		while(i<=mid && j<=end)
		{
			System.out.println("Encountered: " + buildings[i][0] + " , " + buildings[j][0]);
			if(buildings[i][0] < buildings[j][0])
			{//checking on the basis of left
				skyline[k][0] = buildings[i][0];
				skyline[k][1] = buildings[i][2];
				k++;
				
				//checking on the basis of height as well
					//buildings overlap			
	
					if(buildings[i][1] > buildings[j][0] && buildings[i][2] < buildings[j][2])
					{
						skyline[k][0] = buildings[j][0];
						skyline[k][1] = buildings[j][2];
						k++;
					}
					else if(buildings[i][1] > buildings[j][0] && buildings[i][2] > buildings[j][2])
					{
						skyline[k][0] = buildings[i][1];
						skyline[k][1] = buildings[j][2];
					}
				}

			if(buildings[i][1] > buildings[j][1])
			j++;
			else
			i+=2;
		}
		
		for(int m=0; m<skyline.length; m++)
		{
			System.out.println("{ " + skyline[m][0] + " , " + skyline[m][1] + " }");
			
		}
	}
}
