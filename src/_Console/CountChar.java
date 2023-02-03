package _Console;

public class CountChar {
	int consonant;
	int vowel;
	String s;

	public void setStr(String str) {
		s = str;
	}

	public String getStr() {
		return s;
	}

	public void vowelCount() {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowel++;
			}
		}
		System.out.println(vowel);
	}

	public void consonantCount() {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o'
					|| s.charAt(i) != 'u') {
				consonant++;
			}
		}
		System.out.println(consonant);
	}

}
