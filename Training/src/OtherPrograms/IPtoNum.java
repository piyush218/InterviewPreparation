package OtherPrograms;
//convert an ip to number:

public class IPtoNum {

	public static void main(String[] args)
	{
		long IPNumber = convertIPToNum("192.168.134.233");
		System.out.println(IPNumber);
		String IP = convertNumToIP(IPNumber);
		System.out.println(IP);
	}

	private static String convertNumToIP(long iPNumber) {
		return (((iPNumber>>24)& 0xFF) + "." + ((iPNumber>>16)& 0xFF )+ "." +
				((iPNumber>>4)& 0xFF) + "." + (iPNumber & 0xFF));
	}

	private static long convertIPToNum(String str) {
		long num = 0;
		String[] ipInArray = str.split("\\.");
		for(int i=3; i>=0; i--)
		{
			Long ipPart = Long.parseLong(ipInArray[3-i]);
			num |=ipPart << (i*8);
		}
		return num;
	}
}
