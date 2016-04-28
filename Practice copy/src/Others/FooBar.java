package Others;
/*Write a function called FooBar that takes input integer n and prints all the numbers from 1 
 * upto n in a new line. If the number is divisible by 3 then print "Foo", 
 * if the number is divisible by 5 then print "Bar" and if the number is 
 * divisible by both 3 and 5, print "FooBar". 
 * Otherwise just print the number. 
 * */
public class FooBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		printRequired(n);
		
	}

	private static void printRequired(int n) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=n; i++)
		{
			if(i%3 == 0 && i%5 != 0)
				System.out.println("Foo");
			else if(i%3 != 0 && i%5 == 0)
				System.out.println("Bar");
			else if(i%15 == 0)
				System.out.println("FooBar");
			else
				System.out.println(i);
		}
		
	}

}
