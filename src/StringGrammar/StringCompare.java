package StringGrammar;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "Lexicographically";
		String str2 = "lexicographically";
		
		int cmp;
		
		if (str1.equals(str2)) {
			System.out.println("두 문자열은 같습니다");
		}else {
			System.out.println("두 문자열은 다릅니다");
		}
		
		cmp = str1.compareTo(str2);
		//Conversion of other parts to ASCII code in a dictionary sense, then comparison.
		//ex)The ASCII code of upper case letters is smaller than the ASCII code of lower case letters.
		if (cmp==0) {
			System.out.println("두 문자열은 일치합니다");
		}
		else if (cmp<0) {
			System.out.println("사전적으로 앞에 위치하는 문자열 : " + str1);
		}
		else {
			System.out.println("사전적으로 앞에 위치하는 문자열 : " + str2);
		}
		//Case-independent comparison
		if (str1.compareToIgnoreCase(str2)==0) {
			System.out.println("두 문자열은 같습니다");
		}
		else {
			System.out.println("두 문자열은 다릅니다");
		}
	}

}
