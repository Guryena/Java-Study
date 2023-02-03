package StringGrammar;

public class Substring {

	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		
		System.out.println(str.subSequence(2, 4));
		
	}

}
