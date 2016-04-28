package Hash;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashInternal {

	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();
		String s1 = "abcdef";
		String s2 = "abcdfg";
		String s3 = "abcdfG";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		map.put("abcdef", 1);
		map.put("abcdfg", 2);
		map.put("c", 3);
		map.put("a", 1);
		System.out.println(map);
		map.entrySet();
		System.out.println(Collections.min(map.values()));
		
		
		map.replace("a", 5);
		System.out.println(map);
		
	}
	@Override
	
	public int hashCode(){
		int hash = 5;
		return hash;
		
	}
}
