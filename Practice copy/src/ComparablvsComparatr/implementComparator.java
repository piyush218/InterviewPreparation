package ComparablvsComparatr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class implementComparator {

	public static void main(String[] args)
	{
		String s1 = "a";
		String s2 = "B";
		ArrayList<String> list  =new ArrayList<>();
		list.add(s2);
		list.add(s1);
		System.out.println(list);
//		Collections.sort(list);-> this doesnt sort capiatl and small letters
		//so use comaparator
		Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareToIgnoreCase(o2);
			}
			
		});
		System.out.println(list);
	}
}
