package Strings;
/*
 * Input: str = "GEEKSFORGEEKS"
       n = 3
Output: GSGSEKFREKEOE
Explanation: Let us write input string in Zig-Zag fashion
             in 3 rows.
G       S       G       S
  E   K   F   R   E   K
    E       O       E
Now concatenate the two rows and ignore spaces 
in every row. We get "GSGSEKFREKEOE"

 * */
public class Zigzag {
	
	public static void main(String[] args)
	{
		String myString = "GEEKSFORGEEKS";
		int row = 3;
		
		String finalZigZag = zigZag(myString, row);
		System.out.println("Zigzag is: " + finalZigZag);
	}

	private static String zigZag(String myString, int row) {
		
		
		if(row == myString.length())
			return myString;
		
		
		String[] rowHolder = new String[row]; 
		boolean downIndicator = true;
				
		for(int i=0, j=0; i<myString.length(); i++)
		{
			if(j == row-1 && downIndicator){
				downIndicator = false;
				if(rowHolder[j] != null)
					rowHolder[j] += myString.charAt(i);
				else
					rowHolder[j] = "" + myString.charAt(i);
				j--;
			}
			else if(j == 0 && !downIndicator)
			{
				downIndicator = true;
				if(rowHolder[j] != null)
					rowHolder[j] += myString.charAt(i);
				else
					rowHolder[j] = "" + myString.charAt(i);
				j++;
			}
			else if(!downIndicator){
				if(rowHolder[j] != null)
					rowHolder[j] += myString.charAt(i);
				else
					rowHolder[j] = "" + myString.charAt(i);
				j--;
			}
		else if(downIndicator)
			{
			if(rowHolder[j] != null)
				rowHolder[j] += myString.charAt(i);
			else
				rowHolder[j] = "" + myString.charAt(i);
				j++;
			}
			
		}
		String finalZigZag = "";
		
		for(int i=0; i<rowHolder.length; i++)
		{
			finalZigZag += rowHolder[i];
		}
		
		return finalZigZag;
	}

}
