package Chapter1;

public class Question1 {

	public static void main(String[] args)
	{
		String str = "abcdaefr";
		System.out.println(containsDups(str));
	}

	private static boolean containsDups(String str) {
		// TODO Auto-generated method stub
		boolean contains = false;
		boolean[] container = new boolean[256];
		int i=0, asciiCode = 0;
		
		while(i < str.length()){
			asciiCode = str.charAt(i);
			if(container[asciiCode]){
				contains = true;
				break;
			}
			
			container[asciiCode] = true;
			i++;
		}
		return contains;
	}
}
