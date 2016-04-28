package Generics;

public class Box<T> //generic type T
{
	//So we can replace Object here with T
//	private Object obj;
//
//	public Object getObj() {
//		return obj;
//	}
//
//	public void setObj(Object obj) {
//		this.obj = obj;
//	}
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public <U extends Number> void inspect(U u) //<U> means bounded type parameters
	{
		//inspects the type which we are using
		//U cant be anything other than number type
		System.out.println("T: " + obj.getClass().getName());
		System.out.println(("U: " + u.getClass().getName()));
		
	}
	
}
