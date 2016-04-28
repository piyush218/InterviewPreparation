package Chapter1;

import java.util.HashMap;

public class Question7 {

	public static void main(String[] args){
		int[][] mat = {{1,2,0,4},{5,6,7,8},{0,2,8,6},{4,5,6,3}};
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		modify(mat);
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat.length; j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void modify(int[][] mat) {
		// TODO Auto-generated method stub
//		int[] row = new int[mat.length * mat[0].length];
//		int[] col = new int[mat.length * mat[0].length];
		HashMap<Integer, Integer> map = new HashMap<>();
		int k = 0;
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[0].length; j++)
			{
				if(mat[i][j] == 0)
				{
//					row[k] = i;
//					col[k] = j;
					map.put(i, j);
					k++;
				}
				
			}
		}
		
		for(int i: map.keySet())
		{
			int j = 0;
			while(j<mat.length)
			{
				mat[i][j] = 0;
				mat[j][map.get(i)]= 0;
				j++;
			}
		}
	}
}
