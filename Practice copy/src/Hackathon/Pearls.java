package Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pearls {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> costs = new ArrayList<>();
		while(n!=0)
		{
			costs.add(sc.nextInt());
			n--;
		}
		//System.out.println(costs);
		//findFinalCost(costs);
		System.out.println(findFinalCost(costs));
	}

	private static int findFinalCost(List<Integer> costs) {
		// TODO Auto-generated method stub
		Integer r = new Integer(2);
		List<Integer> addedPrices = new ArrayList<>();
		while(costs.size() !=1)
		{
			Integer min1 = new Integer(Collections.min(costs));
			costs.remove(min1);
			Integer min2 = new Integer(Collections.min(costs));
			costs.remove(min2);
			//System.out.println("Adding: " + min1 + " + " + min2);
			costs.add(min1 + min2);
			addedPrices.add(min1 + min2);
			//System.out.println("Set is: " + costs);
		}
		//System.out.println(costs.get(0));
		//return null;
		int sum =0;
		for(Integer e: addedPrices)
			sum += e;
		return sum;
	}
}
