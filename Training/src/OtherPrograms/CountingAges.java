package OtherPrograms;
//Sort the ages of a all employees in a company
//Approach: according to Childrens' rights protection law, a child is officially eligible to work in a firm
//only after the age of 18 years. Similarly, every company has a retirement age, lets say it is 60 yrs in this case.

//This Algo is also called Count Sort:

public class CountingAges {

	public static void main(String[] args)
	{
		int[] ages = {20,25,27,40,56,34,20,44,59,23,45,43,24,23,45,45,37,26, 18};
		sortAges(ages);
		for(int i = 0; i<ages.length; i++)
		{
			System.out.print(ages[i] + " ");
		}
		System.out.println();
	}

	private static void sortAges(int[] ages) {
		int minAge = 18;
		int retirementAge = 60;
		int[] ageCounts = new int[retirementAge -minAge + 1];
		for(int i =0; i<ages.length; i++)
		{
			ageCounts[ages[i]-18]++;
		}
		
		//putting all the ages in sorted order using ageCounts:
		for(int i=0, j=0; i<ageCounts.length; i++)
		{
			while(ageCounts[i] != 0)
			{
				ages[j] = i + 18;
				j++;
				ageCounts[i]--;
			}
		}
		
	}
}
