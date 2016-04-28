package Arrays;

/*Given an array of ints (positive numbers) find out the index that balances the array. 
 * If no such index exists, return the index that minimizes the difference. 

How can you do it by touching each element only once.
 * */

public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {12, 1, 4, 6, 8};
		int balance = findBalance(myArray);
		System.out.println("Balancing Index: " + balance);
	}

	private static int findBalance(int[] myArray) {
		// TODO Auto-generated method stub
		if(myArray.length == 1)
		{
			System.out.println("Array length 1");
			return 0;
		}
		
		int right = myArray.length-1;
		int left = 0;
		int rSum = myArray[right], lSum = myArray[left];
		
		while(right != left)
		{
			
			System.out.println("LSum: " + lSum + "  RSum: " + rSum);
			if(rSum <= lSum)
			{
				right--;
				rSum += myArray[right];
			}
			else
				{
					left++;
					lSum += myArray[left];
				}
		}
		return right;
	}

}
