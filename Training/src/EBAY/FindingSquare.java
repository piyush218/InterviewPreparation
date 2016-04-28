package EBAY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class FindingSquare {

	public static void main(String[] args){
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		try{
			StringBuffer sb = new StringBuffer();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//INPUT
			for(byte T = Byte.parseByte(br.readLine()); T > 0; --T){
				String[] input = br.readLine().split(" ");
				int line1 = Integer.parseInt(input[0]);
				int line2 = Integer.parseInt(input[1]);

				//SOLVE
				int solution = (int)(Math.floor(Math.sqrt(line2)) - Math.ceil(Math.sqrt(line1)) + 1);
				sb.append(solution + "\n");
			}

			//OUTPUT
			System.out.print(sb);
		}catch(Exception e){
			System.out.println("Error");
		}
		//return 0;
	}
}
