package Sorting;
//import java.math.*;
//import java.lang.*;
import java.util.*;
public class QuickSort {
	
	public static void main(String[] args)
	{
		int[] nums = Utility.nums;
		sort(nums,0,nums.length-1);
		Utility.display(nums);
	}

	private static void sort(int[] nums, int start, int end) {
		if(start < end){
		//int pIndex = partion(nums, start, end);
		int pIndex = partionMyLogic(nums, start, end);
		sort(nums, start, pIndex - 1);
		sort(nums, pIndex+1, end);
		}
	}
	
	private static int partion(int[] nums, int start, int end) {
		int pIndex = start;
		Random random = new Random();
		int pivot = nums[end];
		int i = start;
	
		while(i <= end-1)
		{	if(nums[i] < pivot)
			{	
				int temp = nums[pIndex];
				nums[pIndex] =nums[i];
				nums[i] = temp;
				pIndex++;
			}
			i++;
		}
		//swapping pivot and nums[pIndex]
		int temp = nums[pIndex];
		nums[pIndex] = nums[end];
		nums[end] = temp;
		
		return pIndex;
	}

	private static int partionMyLogic(int[] nums, int start, int end) {
		int pIndex = start;
		Random random = new Random();
		int t = random.nextInt(end - start +1) + start;
		int pivot = nums[t];
		int temp = pivot;
		pivot = nums[end];
		nums[end] = pivot;
		int i = start;
		//System.out.println("Pivot selected is: " + pivot);
		while(i < end)
		{	if(nums[i] < pivot)
			{	
				temp = nums[pIndex];
				nums[pIndex] =nums[i];
				nums[i] = temp;
				pIndex++;
			}
			i++;
		}
		//swapping pivot and nums[pIndex]
		temp = nums[pIndex];
		nums[pIndex] = nums[end];
		nums[end] = temp;
		//for(i=0;i<end;i++)System.out.print(nums[i] + " ");
		//System.out.println();
		return pIndex;
	}
}
