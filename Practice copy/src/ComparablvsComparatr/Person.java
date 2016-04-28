package ComparablvsComparatr;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "    " + person.name);
		//this -> right element or 2nd element
		//person object is the left element or first element
		return this.name.compareTo(person.name) * -1;
	}
	
	
}
