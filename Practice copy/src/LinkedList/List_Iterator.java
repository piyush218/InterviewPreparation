package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args)
	{
		ArrayList<Integer> myList  = new ArrayList<Integer>();
		myList.add(200);
		myList.add(400);
		myList.add(600);
		 ListIterator<Integer> litr = myList.listIterator();
	      while(litr.hasNext()) {
	         Object element = litr.next();
	         System.out.println(element.toString());
	      }
	      System.out.println(litr.hasNext());
	      System.out.println(litr.hasPrevious());
	      System.out.println(litr.previous());
	      System.out.println(litr.previous());
	      
		
	}
}
