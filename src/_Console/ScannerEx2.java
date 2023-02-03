package _Console;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CountChar countChar = new CountChar();
		String str;

		str = sc.nextLine();
		countChar.setStr(str);

		countChar.consonantCount();
		countChar.vowelCount();
	}

}
