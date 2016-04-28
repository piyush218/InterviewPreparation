package OtherPrograms;

public class BinarySrchOnDiagonal {

	public static void main(String[] args)
	{
		int[][] a = {{2,4,6,8},{4,8,9,12},{6,10,12,18},{8,12,18,22}};
		int i =0 ;
		int n =10;
		System.out.println("Welcome");
		boolean f =false;
		search(a, 0, 0, a.length, a.length, n, f);
		
	}

	private static void search(int[][] a, int starti, int startj, int stopi, int stopj, int n, boolean f) 
	{
		System.out.println("Searching");
		//boolean f=false;
		if(starti == stopi || startj == stopj)
		{
			System.out.println("Entred into last recur");
			if(a[starti][startj] == n)
			{
				f=true;
				System.out.println("Found at "+ starti +" "+ startj);
				return;
			}
		}
			else
			{
				System.out.println("Into else");
				int i = starti;
				while(i < stopi && a[i][i] <= n)
				{
					if(a[i][i] == n)
					{
						f=true;
						System.out.println("Found at " + i + "," + i);
						return;
					}
					i++;
				}
				stopi = i;
				stopj = i;
				i=i-1;
				if(!f)
				{
					System.out.println("f is still false ");
					stopi = i;
					stopj = i;
					search(a, starti, startj, stopi, stopj, n, f);
					search(a, 0, i, i, stopj, n, f);
				}
			}
		}
	}

