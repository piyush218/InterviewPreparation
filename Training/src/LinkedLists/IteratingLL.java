
package LinkedLists;
import java.util.*;
import java.*;

import javax.swing.JApplet;

public class IteratingLL{
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(11);
		Iterator<Integer> itr = list.iterator();
		//creation of iterator and set it to beginning
		//it has methods like hasNext(), next(), remove()
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator<Integer> itrre = list.iterator();
		itrre.next();
		itrre.next();
		itrre.remove();
		System.out.println(list);
	}
}
