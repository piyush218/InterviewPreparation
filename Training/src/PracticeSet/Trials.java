package PracticeSet;

public class Trials {

	public static void main(String[] args)
	{
		int[ ] m = new int[2];
	    m[0] = 0;
	    m[1] = 1;
	    int[ ] p = m;
	    p[0] = 4;
	    p[0] = 5;
	    System.out.println(m[0] + "   " + p[0]);
	}
}
