package Games;

import java.util.Random;


public class SudokuSolver {

	private static int[] lineArray;
	private static int[][] sudoku = new int[9][9];
	private Random r;
	//private static int shuffleCount = 0;
	
	public SudokuSolver()
	{
		lineArray = new int[9];
		r = new Random();
		createSudoku();
	}

	private void createSudoku() {
		System.out.println("Hello");
		int i = 0, elementGenerated = 0 ;
		
//		while(elementGenerated==0)
//			elementGenerated = r.nextInt(10);//for the first element
//		
//		lineArray[i] = elementGenerated;
//		i++;
		while(i < lineArray.length)//first row
		{
			elementGenerated = r.nextInt(10);//for the rest of the elements
			lineArray[i] = elementGenerated;
			//System.out.println("adding " + line-array[i]);
			i++;		
			for(int j=0; j<i-1; j++)
			{
				if((lineArray[j] == lineArray[i-1] || lineArray[i-1] == 0)){
					i--;
					break;
				}
				
			}
		}
		
		//Adding the line-array to our solution array, my sudoku array
		for(int k=0; k<sudoku.length; k++)
		{
			for(int q=0;q<9;q++)
			{
				sudoku[k][q] = lineArray[q];
			}
			if(k==2 || k==5)
				{
					swapThree();
					swapOne();
				}
			else  
			swapThree();
			
			}
		
	}
	
	private void swapOne() {
	
		for(int i=0; i<9; i = i+3)
		{
			int helper = lineArray[i];
			lineArray[i] = lineArray[i+1];
			lineArray[i+1] = lineArray[i+2];
			lineArray[i+2] = helper;
		}
	}

	private void swapThree() {
		for(int i=0; i<3; i++)
		{
			int helper = lineArray[i];
			lineArray[i] = lineArray[i+3];
			lineArray[i+3] = lineArray[i+6];
			lineArray[i+6] = helper;
		}
		
	}

	public static void main(String[] args)
	{
		SudokuSolver sudoku = new SudokuSolver();
		sudoku.display();
	}

	private void display() {
		for(int i=0; i<sudoku.length; i++)
		{
			for(int j=0; j<sudoku[0].length; j++)
			{
				System.out.print(sudoku[i][j] + " |" + " ");
			}
			System.out.println();
			System.out.println("-----------------------------------");
		}
	}
}
