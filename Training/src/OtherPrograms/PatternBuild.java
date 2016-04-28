package OtherPrograms;

public class PatternBuild {

	public static void main(String[] args)
	{
		pattern1();
		System.out.println();
		pattern2();
		System.out.println();
		pattern3();
		System.out.println();
		pattern4();
		int[] a = {2,3,1,4,9,8};
		selectionSort(a);
		bubbleSort(a);
		insertionSort(a);
		int[] b = {2,3,5,1,3,5,6,3,6,1};
	}

	private static void insertionSort(int[] a) {
		System.out.println("Insertion Sort");
		int value, hole;
		for(int i=0; i<a.length; i++)
		{
			value = a[i];
			hole = i;
			while(hole>0 && a[hole-1]>a[hole])
			{
				a[hole] = a[hole-1];
				hole--;
			}
			a[hole] = value;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void bubbleSort(int[] a) {
		System.out.println("Bubble Sort");
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-i-1;j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void selectionSort(int[] a) {
		System.out.println("Selection Sort");
		int min, temp;
		for(int i=0; i<a.length-1; i++)
		{
			min = i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[min] > a[j])
				{
					temp = a[min];
					a[min] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void pattern4() {
		for(int i=0; i<5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("**");
			}
			System.out.println();
		}
	}

	private static void pattern3() {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("11" + " ");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print("11" + " ");
			}
			System.out.println();
		}
		
	}

	private static void pattern2() {
		for(int i=0; i<5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print("11" + " ");
			}
			System.out.println();
		}
	}

	private static void pattern1() {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("11" + " ");
			}
			System.out.println();
		}
	}
}
