package LinkedLists;
import java.util.*;

public class HashMapTut {

	public static void main(String[] args)
	{
		HashMap<String, Double> myMap = new HashMap<String, Double>();
		//hashmap object created and generics given
		System.out.println("Entering 1st data");
		myMap.put("a", new Double(2.768));
		System.out.println("Entering 2nd data");
		myMap.put("b", 5.768);
		//myMap.put("c", 8.768);
		for(Map.Entry<String, Double> entry:myMap.entrySet())
			System.out.println(entry.getKey() + "-->" + entry.getValue());
			
		System.out.println(myMap.isEmpty());
		//System.out.println(myMap.containsKey("b"));
		System.out.println(myMap.keySet());//entire set printed
		//myMap.remove("a");
		//System.out.println(myMap.keySet());
		//System.out.println(myMap.hashCode());
		System.out.println(myMap.containsValue(2.768));
		
		//***Tree map is more computationally expensive than Hash maps so use hashmaps
	}
}
