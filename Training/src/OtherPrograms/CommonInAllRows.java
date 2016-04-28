package OtherPrograms;
/*Given a matrix where every row is sorted in increasing order.
 * Write a function that finds and returns a common element in all rows. If there is no common element, then returns -1.
 * */
public class CommonInAllRows {

	public static void main(String[] args)
	{
		int[][] arr = {{1,4,6,8,10},{3,8,9,12,14},{8,10,12,14,16},{1,5,6,7,8}};
		findCommon(arr);
	}

	private static void findCommon(int[][] arr) {
		int col = arr[0].length;
		int row = arr.length;
		while(col!=0)
		{
			
		}
	}
}
