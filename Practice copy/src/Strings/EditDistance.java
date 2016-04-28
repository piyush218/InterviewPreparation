package Strings;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "peaks";
		String str2 = "geeks";
		
		int distance = getEditDistanceRecur(str1, str2, str1.length(), str2.length());
		int distanceDP = getEditDistanceDP(str1, str2);
		System.out.println("Min Edit Distance using Recursion: " + distance);
		System.out.println("Min Edit Distance using Dynamic Programming: " + distanceDP);

		
	}
	
	private static int getEditDistanceRecur(String str1, String str2, int m, int n) {
		// TODO Auto-generated method stub
		if(str1 == null || m == 0)
			return n;
		else if(str2 == null || n == 0)
			return m;
		else if(str1.charAt(m - 1) == str2.charAt(n - 1))
			return getEditDistanceRecur(str1, str2, m-1, n-1);
		else
			return 1 + Math.min(getEditDistanceRecur(str1, str2, m-1, n), Math.min(getEditDistanceRecur(str1, str2, m, n-1), getEditDistanceRecur(str1, str2, m-1, n-1)));
		
	}
	
	//Dynamic Programming

	private static int getEditDistanceDP(String str1, String str2) {
		int[][] temp = new int[str1.length()+1][str2.length()+1];
		
		//if str2 is null
		for(int i=0; i<temp[0].length; i++){
			temp[0][i] = i;
		}
		//if str1 is null
		for(int i=0; i<temp.length; i++){
			temp[i][0] = i;
		}
		
		for(int i=1; i<=str1.length(); i++)
		{
			for(int j=1; j<=str2.length(); j++)
			{
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					temp[i][j] = temp[i-1][j-1];
				}
				else{
					temp[i][j] = 1 + Math.min(temp[i-1][j], Math.min(temp[i][j-1], temp[i-1][j-1]));
				}
			}
		}
		printEdits(temp, str1, str2);
		return temp[str1.length()][str2.length()];
	}

	private static void printEdits(int[][] temp, String str1, String str2) {
		// TODO Auto-generated method stub
		int i= temp.length;
		
		
	}

	
	

}
