package OtherPrograms;

public class BinaryManipulations {

	public static void main(String[] args)
	{
		floatToBinary();
		BinaryToFloat();
	}

	private static void BinaryToFloat() {
		String b = "111111001000000000000000000000";
		int n = Integer.parseInt(b);
		float f = Float.intBitsToFloat(n);
		System.out.println(f + "   "+ n + "   " + b);
		
	}

	private static void floatToBinary() {
		float f = 1.2f;
		int n = Float.floatToIntBits(f);
		String b = Integer.toBinaryString(n);
		System.out.println(f + "   "+ n + "   " + b);
		
	}
}
