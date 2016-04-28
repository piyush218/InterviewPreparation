package OtherPrograms;
//if pattern = a.b string=ayb return true
//if patter=a*b string=ayhgdfsudhfelifhjb return true

public class RegexMatchingManual {
	public boolean match(String pattern,int startP,String str,int startS)
	{
		if(startP<pattern.length() && startS<str.length())
		{
			//Checking for special characters here....?/*
			
			if(pattern.charAt(startP)=='?' || pattern.charAt(startP)==str.charAt(startS))
			{
				//System.out.println(a.charAt(i));
				return match(pattern, startP+1, str, startS+1); // increment both the pointers
			}
			else if(pattern.charAt(startP)=='*')
			{
				//System.out.println(a.charAt(i));
                return (match(pattern,startP+1,str,startS) || match(pattern, startP, str, startS+1) || match(pattern,startP+1,str,startS+1));
                //first increment pointer in the pattern 
                //or increment the pointer in string
                // or increment both the pointers
                //If any of them throws true, then the string matches.
			}
			else
			{
				return false;
			}
		}
		else
		{
			//Simply checking if both the strings have been traversed completely
			
			if(startP==pattern.length() && startS==str.length())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void main(String args[])
	{
		RegexMatchingManual wcsm = new RegexMatchingManual();
		String pattern="a?b*cd";
		String str="abbccdcd";
		System.out.println(wcsm.match(pattern,0,str,0));
	}
}
