package _Console;

import java.util.Scanner;

public class ScannerNextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();

		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();
		
		System.out.println(str1);
		System.out.println(str2);
		
		
	}
}
