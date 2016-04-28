package OtherPrograms;
/*Given an array and a value, how do you implement a function to remove all instances of that
value in place and return the new length of the array? It is not required that you keep the order of the remaining
numbers. It doesn't matter what you leave beyond the new length.
For example, if the input array is {4, 3, 2, 1, 2, 3, 6}, the resulting array after removing value 2 contains the
numbers {4, 3, 1, 3, 6}, and the new length of the remaining array is 5.*/
public class RemoveElemFromArray {

	public static void main(String[] args)
	{
		int[] a = {2,2};
		int elementToBeRemoved = 2;
		removeAllInstances(a, elementToBeRemoved);
	}

	private static void removeAllInstances(int[] a, int elementToBeRemoved) {
		System.out.println("Welcome");
		int low = 0;
		int high = a.length - 1;
		if(low == high)
		{
			if(a[0] == elementToBeRemoved) 
				{
				System.out.println("a is null now");
				return;
				}
			else
				{
				System.out.println(a[0]);
				return;
				}
			
		}
		int size = a.length;
		int temp;
		while(low <= high)
		{
			//System.out.println("Loop");
			if(a[low] == elementToBeRemoved && a[high] == elementToBeRemoved)//both are elementTobeRemoved
			{
				//System.out.println("Found Low");
				high--;				
			}
			else if(a[low] == elementToBeRemoved && a[high] != elementToBeRemoved)//swap
			{
				//System.out.println("in between");
				temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
			}
			else if(a[low] != elementToBeRemoved)//if both are not elementTobeRemoved
			{
				//System.out.println("found high");
				low++;
			}
			
		}
		if(high == -1)
		{
			System.out.println("a is null");
			return;
		}
		for(int i =0; i<=high; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
