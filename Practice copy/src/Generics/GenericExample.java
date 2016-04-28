package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;

public class GenericExample {

	public static void main(String[] args)
	{
		GenericExample gen = new GenericExample();
		gen.boxesText();
		
		gen.useWildCard(Arrays.asList(1,2,3));
	}
	public void betterForCasting(){
		List<String> list = new ArrayList<>();//the diamond rule
		//it says that if you have declared generics on the left side <String>,
		//you dont need to specify it again the right side, 
		//you may just have a diamond "<>" instead like above.
		list.add("abc");
		
		String s = list.get(0);
		//without <String> generics we would have to do the foll
		//String s = (String) list.get(0);
	}
	
	public void boxesText(){
		List<Box<String>> boxes = new ArrayList<>();
		Box<String> box1 = new Box<>();
		box1.setObj("String1");
		
		Box<String> box2 = new Box<>();
		box2.setObj("String2");
		
		boxes.add(box1);
		boxes.add(box2);
		
		box1.inspect(123);
		
	}
	
	public void usingPairs(){
		Pair<String, String> p1 = new OrderedPair<>("name", "abc");
	}
	
	
	//using wildcards:adds flexibility.More flexible than bounded type
	//extends keyword makes ? extends Number as an upperbound. So we cant 
	//pass in List containing Object into it. 
	//however, to convert it to lower bound replace extends to super
	public void useWildCard(List<? extends Number> numbers)
	{
		double d = 0.0;
		for(Number n: numbers)
		{
			d += n.doubleValue();
		}
		System.out.println(d);
	}
	
	//? now accept Number or even Object, but wont accept the datatypes of
	//same level like Long or short
	public void useWildCardSuper(List<? super LongAdder> numbers)
	{
//		double d = 0.0;
//		for(Number n: numbers)
//		{
//			d += n.doubleValue();
//		}
//		System.out.println(d);
	}
}
