package Strings;

import java.util.HashMap;

public class StringToNumber {

	public static void main(String[] args)
	{
		String alphaNum = "One Million Thirty Two Thousand Thirty Two";
		int result = getNum(alphaNum);
		System.out.println("Result is " + result);
	}

	private static int getNum(String alphaNum) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> converter = new HashMap<>();
		
		//adding the String to numbers conversions into hashmap
		
		converter.put("One", 1);
		converter.put("Two", 2);
		converter.put("Three", 3);
		converter.put("Four", 4);
		converter.put("Five", 5);
		converter.put("Six", 6);
		converter.put("Seven", 7);
		converter.put("Eight", 8);
		converter.put("Nine", 9);
		converter.put("Ten", 10);
		converter.put("Eleven", 11);
		converter.put("Twelve", 12);
		converter.put("Thirteen", 13);
		converter.put("Fourteen", 14);
		converter.put("Fifteen", 15);
		converter.put("Sixteen", 16);
		converter.put("Seventeen", 17);
		converter.put("Eighteen", 18);
		converter.put("Ninteen", 19);
		converter.put("Twenty", 20);
		converter.put("Thirty", 30);
		converter.put("Fourty", 40);
		converter.put("Fifty", 50);
		converter.put("Sixty", 60);
		converter.put("Seventy", 70);
		converter.put("Eighty", 80);
		converter.put("Ninety", 90);
		
		converter.put("Billion", 1000000000);
		converter.put("Million", 1000000);
		converter.put("Thousand", 1000);
		converter.put("Hundred", 100);
		
		//split the input string and read it from left to right and keep adding 
		String[] words = alphaNum.split(" ");
		int i=0;
		int result = 0, Num1=0, Num2=0, Num3=0;
		String word1="", word2="", word3 ="";
		while(i<words.length)
		{
			Num1 = 0;
			Num2 = 0;
			Num3 = 0;
			word1 = "";
			word2 = "";
			word3 = "";
			
			word1 = words[i++];
			Num1 = converter.get(word1);
			
			if(i<words.length)
			{
				word2 = words[i++];
				Num2 = converter.get(word2);
				
			}
			
			//System.out.println(result);
			if(Num2==100 || Num2==1000 || Num2==1000000 || Num2==1000000000)
			{
				System.out.println(result);
				
				result += Num1 * Num2;
				System.out.println("if" + result);
				
			}
			else
			{
				if(i<words.length)
				{
					word3 = words[i++];
					System.out.println("word3 " + word3);
					Num3  = converter.get(word3);
					result += (Num1 + Num2) * Num3;
				}
				else
				{
					result += Num1 + Num2;
				}
				
				System.out.println("else" + result);
				
			}
			
		}
		
		
		return result;
	}
}
