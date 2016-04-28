package OtherPrograms;
import java.util.*;

public class TowerOfHanoi {
	
	Stack<Integer>[] peg = new Stack[4] ;// This is the base that is going to hold the names of towers or you can say holds the towers themselves.
	int towerNo =0;
	int n = 5;
	
	public void problemCreater()
	{
		System.out.println("Entered prob creater");
		int i=1;
		while(i<4)
		{
			System.out.println("Making towers stand");
			peg[i] = new Stack<Integer>();// Made the towers stand
			i++;
		}
		for(int j = n; j>0; j--)
		{
			peg[1].push(j);
			//peg[2].push(0);
			//peg[3].push(0);
		}
		display();
		move(n, 1, 2, 3);
	}
	
	public void move(int n, int s, int a, int d)// s-source a-auxiliary d-destination
	{
		if(n>0)
		{
		move(n-1, s, d, a);
		int last = peg[s].pop();
		peg[d].push(last);
		display();
		move(n-1, a, s, d);
	}
	}

	private void display() {
		
		//System.out.println(peg[1].);
		for(int i=n-1; i>=0; i--)
		{	
			String a, b, c;
			try{
				a = peg[1].get(i).toString();
			}
			catch(Exception e)
			{
				a = " "; 
			}
			try{
				b = peg[2].get(i).toString();
			}
			catch(Exception e)
			{
				b = " "; 
			}
			try{
				c = peg[3].get(i).toString();
			}
			catch(Exception e)
			{
				c = " "; 
			}
			
			System.out.println(a + "   " + b + "   " + c);
		}
		System.out.println("-----------");
		
		System.out.println("A | B | C");
		
		return;
	}
	public static void main(String[] args)
	{
		TowerOfHanoi toh = new TowerOfHanoi();
		System.out.println("Hii");
		toh.problemCreater();
	}
}
