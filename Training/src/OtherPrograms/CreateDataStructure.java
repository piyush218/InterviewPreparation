package OtherPrograms;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class CreateDataStructure {

	static ArrayList<Integer> myList = new ArrayList<Integer>();
	static Hashtable<Integer, Integer> myTable = new Hashtable<Integer, Integer>();
	public static void main(String[] args)
	{
		//insertion
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(11);
		myList.add(12);
		
		//delete 2 from list
		if(myList.contains(2))
			myList.remove(myList.indexOf(2));
		else
			System.out.println("Sorry, the number is not found!");
		
		//get index of 3
		if(myList.contains(3))
			System.out.println("Element is at: " + myList.indexOf(3));
		else
			System.out.println("Sorry, the number is not found!");
		
		//get Random
		Random random = new Random();
		int index = random.nextInt(myList.size());
		System.out.println(myList.get(index));
	}
	
	public static void add(int value)
	{
		
		
	}
}
