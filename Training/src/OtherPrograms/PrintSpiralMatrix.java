package OtherPrograms;

public class PrintSpiralMatrix {

	public static void main(String[] args)
	{
	    int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    printSpiral(a);
	}
	
	static void printSpiral(int nums[][]) 
	{
			int rows = nums.length;
			int columns = nums[0].length;
			int start = 0;
			while(columns > start * 2 && rows > start * 2) 
			{
				printRing(nums, start);
				++start;
			}
	}
	
	static void printRing(int nums[][], int start) {
		int rows = nums.length;
		int columns = nums[0].length;
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		
		// Print a row from left to right
		for(int i = start; i <= endX; ++i) {
		int number = nums[start][i];
		System.out.print(number + " ");
		}
		
		// print a column top down
		if(start < endY) {
		for(int i = start + 1; i <= endY; ++i) {
		int number = nums[i][endX];
		System.out.print(number + " ");
		}
		}
		
		// print a row from right to left
		if(start < endX && start < endY) {
		for(int i = endX - 1; i >= start; --i) {
		int number = nums[endY][i];
		System.out.print(number + " ");
		}
		}
		
		// print a column bottom up
		if(start < endX && start < endY - 1) {
		for(int i = endY - 1; i >= start + 1; --i) {
		int number = nums[i][start];
		System.out.print(number + " ");
		}
		}
		
		}
}
