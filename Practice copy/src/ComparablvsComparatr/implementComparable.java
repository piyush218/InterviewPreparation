package ComparablvsComparatr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class implementComparable extends Person {

	public static void main(String[] args)
	{
		ArrayList<Person> persons = new ArrayList<Person>();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		p1.setName("B");
		p1.setAge(12);
		p2.setName("A");
		p2.setAge(15);
		p3.setName("D");
		p3.setAge(12);
		p4.setName("C");
		p4.setAge(15);
		
		persons.add(p1);
		persons.add(p4);
		
		persons.add(p3);
		persons.add(p2);
		
		for(Person p: persons)
		{
			System.out.println(p.getName());
		}
		System.out.println("-------------");
		Collections.sort(persons);
		
		for(Person p: persons)
		{
			System.out.println(p.getName());
		}
		//System.out.println(persons);
		
		
		
	}
}
