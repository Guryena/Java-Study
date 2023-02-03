package String;

public class Test {

	public static void main(String[] args) {
		String al = "abcde";
		String reverse = "";

		for (int i = al.length() - 1; i >= 0; i--) {
			reverse = reverse + al.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
