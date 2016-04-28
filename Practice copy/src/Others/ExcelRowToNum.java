package Others;
/*How would you convert a row number on Excel to a label? Rows are labeled alphabetically with letters 
 * added on once the alphabet has been fully used. 
 * (Ex. row # 5 is labeled E, row # 27 is labeled AA, row # 28 is AB, row # 53 is BA and so forth) 
 * What would the row label be for a large number, such as 1500?
 * 
 * */
public class ExcelRowToNum {
	
	public static void main(String[] args)
	{
		int num = 53;
		getRowLabel(num);
	}

	private static void getRowLabel(int num) {
		// TODO Auto-generated method stub
		char[] letters = {' ','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		StringBuilder result = new StringBuilder();

		while(num > 26)
		{
			result.append(letters[num%26]);
			num /= 26;
			
		}
		
		result.append(letters[num%26]);
		result.reverse();
		
		System.out.println("Result is " + result);
	}

	

	
}
