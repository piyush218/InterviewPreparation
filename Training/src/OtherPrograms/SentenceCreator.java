package OtherPrograms;
/*Given a list of word lists How to print 
 * all sentences possible taking one word from a list at a time via recursion?
 * */
public class SentenceCreator {

	public static void main(String[] args)
	{
		String[][] words = {{"you", "we"},{"have", "are"},
	        {"sleep", "eat", "drink"}};
		creator(words, 0,0,0);
	}

	private static void creator(String[][] words, int first, int second, int third) {
		boolean f;
		if(first >= words[0].length)
		{
			return;
		}
		else if(second >= words[1].length)
		{
			creator(words, first+1, 0, 0);
		}
		else if(third >= words[2].length)
		{
			creator(words, first, second+1, 0);
		}
		if(first < words[0].length && second < words[1].length && third < words[2].length)
		{
			System.out.print(words[0][first] + " ");
			System.out.print(words[1][second] + " ");
			System.out.println(words[2][third]);
			creator(words, first, second, third+1);
		}
		return;
	}
}
