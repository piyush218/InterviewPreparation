package OtherPrograms;
/*Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string.
Example: find “ball” in [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”] will return 4
Example: find “ballcar” in [“at”, “”, “”, “”, “”, “ball”, “car”, “”, “”, “dad”, “”, “”] will return -1
 * */
public class SortedArraySearch {

	public static void main(String[] args)
	{
		System.out.println("Welcome");
		String[] strArray = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String str = "ball";
		int start = 0;
		int end = strArray.length;
		search(strArray, str, start, end);
		
	}

	private static void search(String[] strArray, String str, int start, int end) {
		//System.out.println("hi");
		int midl  = (start+end)/2;
		int midr = midl;
		
		if(midr>=end || midl<0)
		{
			System.out.println("Not Found");
			return;
		}
		//int midl = midReal;
		
		if(strArray[midr] == "")
		{
			while(midr<end && strArray[midr] == "")
			midr++;
			if(midr >= strArray.length)
			{
				System.out.println("Not Found");
			}
		}
		if(midr<end && strArray[midr].equals(str))
		{
			System.out.println("The string is at: " + midr);
			return;
		}
		else if(midr<strArray.length && strArray[midr].charAt(0) < str.charAt(0))
		{
			//System.out.println("Searching in right...");
			search(strArray, str, midr++, end);
		}
		else if(midr<strArray.length && strArray[midr].charAt(0) > str.charAt(0))
		{
			//System.out.println("midl value is: " + midl);
			//System.out.println("value in array is: " + strArray[midl]);
			//System.out.println("Searching in left");
			
			while(midl>=0 && strArray[midl]=="")
			midl--;
			if(midl<0)
			{
				System.out.println("Not Found");
				return;
			}
			//System.out.println(strArray[midl]);
			if(strArray[midl].equals(str))
			{
				System.out.println("The string is at: " + midl);
				return;
			}
			else
			{
				//System.out.println("Searching again....");
				search(strArray, str, start, midl);
			}
		}
		
		
	}
}
