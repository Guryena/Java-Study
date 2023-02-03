package StringSaveReference;

public class StringLengthARR {

	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		
		strArr[0] = "ABCDER";
		strArr[1] = "ABCDER";
		strArr[2] = "ABCDER";
		
		System.out.println(getStrArr(strArr));
		
	}
	
	public static int getStrArr(String[] str) {
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			sum += str[i].length();
		}
		return sum;
	}
	

}
