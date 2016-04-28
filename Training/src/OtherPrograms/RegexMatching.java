package OtherPrograms;
import java.util.regex.*;

public class RegexMatching {

	public static void main(String[] args)
	{
		String s = "a.b";
		Matcher m = Pattern.compile(s).matcher("aabb");
		System.out.println("Ans: " + m.matches() +"  " + "abb".matches(s));
	}
	
}
