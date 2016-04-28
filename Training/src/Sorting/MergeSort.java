package Sorting;

public class MergeSort {
	
	public static void main(String[] args)
	{
		int[] nums = Utility.nums;
		sort(nums,0,nums.length-1);
		Utility.display(nums);
	}

	public static void sort(int[] nums, int p, int r) {
		if(p<r){
		int q = (r+p)/2;
		sort(nums, p, q);
		sort(nums, q+1, r);
		merge(nums, p, q, r);
		}
	}
	
	public static void merge(int[] nums, int p, int q, int r) {
		//System.out.println("merger called");
		int l1 = q-p+1;
		int r1 = r-q;
		//System.out.println("l1 is " + l1 + "r1 is " + r1);
		int[] left = new int[l1];
		int[] right = new int[r1];
		int[] helper = new int[l1 + r1];
		for(int i=0; i<left.length; i++)
		{
			left[i] = nums[i+p];
		}
		for(int j=0; j<right.length; j++)
		{
			right[j] = nums[j+q+1];
		}
		
		int i =0,j=0,k=0;
		for(; k<(left.length + right.length) && (i<l1) && (j<r1);k++)
		{	
			if(left[i]<right[j])
			{
				System.out.println("checking " + left[i]);
				helper[k] = left[i];
				i++;
			}
			else
			{
					helper[k] = right[j];
					j++;
				}	
		}
		
		while(i<l1 ){
			helper[k++] = left[i++];
		}
		
		while(j<r1){
			helper[k++] = right[j++];
		}
		k = 0;
		for(i=p; i<=r; i++)
		{
			nums[i] = helper[k];
			k++;
		}
	}
}
