package OtherPrograms;
/*Write code/ logic to count number of words in a string delimited by " ". Anything apart form " " 
 * are ignore for the counting.
 * String could be very big as big as 5 GB of data. So add logic to handle such large strings.
ex: aaa b c ddd e = Count (5) 
aaaaaaaaaaa = Count(1) 
a 
b 
c 
d 
Count(1) as there are no spaces rather carriage returns are found. 
 * */
public class CountUniqueLetters {

	public static void main(String[] args)
	{
		String str = "aaa bb cccc eeee    dddd fff \n ggg";
		System.out.println(str);
		countUnique(str);
	}

	private static void countUnique(String str) {
		int i = 0;
		char c = str.charAt(i);
		int count = 1;
		for(int  j = 1; j<str.length(); j++)
		{
			if(str.charAt(j) == '\n')
			{
				//System.out.println("found endl");
				break;
			}
			if(str.charAt(j) != str.charAt(i) && str.charAt(j) != ' ')
			{
				i=j;
				count++;
			}
		}
		System.out.println(count);
	}
}
