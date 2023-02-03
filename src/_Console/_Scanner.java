package _Console;

import java.util.Scanner;

public class _Scanner {

	public static void main(String[] args) {
		String source = "1 3 5";
		Scanner sc1 = new Scanner(source);
		
		int num1 = sc1.nextInt(); // extract data that type int
		int num2 = sc1.nextInt(); // extract data that type int
		int num3 = sc1.nextInt(); // extract data that type int

		int sum1 = num1 + num2 + num3;
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum1);

		
		
	}
}
