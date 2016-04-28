package OtherPrograms;
/*Given a matrix in which each row and each column is sorted, write a method to find an element in it.
 * */
public class SortedMatrix {

	public static void main(String[] args)
	{
		int[][] sortedArray = {{2,4,6},{8,10,12},{14,16,18}};
		int e = 4;
		search(sortedArray, e, sortedArray[0].length, sortedArray.length);
	}

	private static void search(int[][] sortedArray, int e, int maxRow,
			int maxCol) 
	{
		boolean f = false;
		int i = 0;
		int j = maxCol -1;
		while(i<maxRow && j>=0)
		{
			//System.out.println(sortedArray[i][j]);
			if(sortedArray[i][j] == e)
			{
				f = true;
				System.out.println("Found the element at: ["+ i+","+j+"]");
				break;
			}
			else if(sortedArray[i][j] > e)
			{
				j--;				
			}
			else
			{
				i++;				
			}
		}
		if(f == false){
			System.out.println("Not Found");
		}
	}

	}
