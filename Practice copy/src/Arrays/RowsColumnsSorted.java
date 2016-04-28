package Arrays;

import java.util.HashMap;

public class RowsColumnsSorted {

	static int[][] myArr = {{4, 4, 6, 2}, {1, 2, 0, 5}, {0, 1, 7, 3}, {2, 3, 7, 4}, {1, 2, 8, 6}};
	public static void main(String[] args) {
		// TODO Auato-generated method stub
		sortMatrix();
		//print matrix
		
		for(int i=0; i<myArr.length; i++)
		{
			for(int j=0; j<myArr[0].length; j++)
			{
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

	private static void sortMatrix() {
		int[] sorted = new int[myArr[0].length * myArr.length];
		//HashMap<Integer, Integer> tracker = new HashMap<>();
		int count=0;
		int k=0;
		for(int i=0; i<myArr.length; i++)
		{
			for(int j=0; j<myArr[0].length; j++)
			{
				sorted[k] = myArr[i][j];
				k++;
			}
		}
//		for(int i=0; i<sorted.length; i++)
//			System.out.println(sorted[i]);
		sort(sorted, 0, sorted.length-1);
		//System.out.println("--------------");
//		for(int i=0; i<sorted.length; i++)
//			System.out.println(sorted[i]);
//		for(int i=0; i<sorted.length; i++)
//		{
//			if(tracker.containsKey(sorted[i]))
//			{
//				count = tracker.get(sorted[i]) + 1;
//				//System.out.println(sorted[i] + " ---> " + count);
//				tracker.put(sorted[i], count);
//			}else{
//				tracker.put(sorted[i], 1);
//			}
//		}
//		System.out.println(tracker);
		alignColumnWise(sorted);
		//align(tracker);
		
	}

	

	private static void alignColumnWise(int[] sorted) {
		int k=0;
		for(int j=0; j<myArr[0].length; j++)
		{
			for(int i=0; i<myArr.length; i++)
			{
				myArr[i][j] = sorted[k];
				k++;
			}
		}
		
	}

	private static void align(HashMap<Integer, Integer> tracker) {
		 
		
	}

	private static void sort(int[] sorted, int start, int end) {
		if(start < end){
			int pIndex = partition(sorted, start, end);
			sort(sorted, start, pIndex-1);
			sort(sorted, pIndex+1, end);
			
		}
		
	}

	private static int partition(int[] sorted, int start, int end) {
		int pIndex = start;
		int pivot = sorted[end];
		int i = start;
		
		while(i <= end-1)
		{
			if(sorted[i] < pivot){
				int temp = sorted[pIndex];
				sorted[pIndex] = sorted[i];
				sorted[i] = temp;
				pIndex++;
			}
			i++;
		}
		//swap pivot and sorted[pIndex]
		
		int temp = sorted[pIndex];
		sorted[pIndex] = sorted[end];
		sorted[end] = temp;
		
		return pIndex;
	}

}
