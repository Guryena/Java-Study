package _Console;

import java.util.Scanner;

public class ScannerNextInt  {

	public static void main(String[] args) {

		Scanner sc2 = new Scanner(System.in); //input keybord in console
		
		System.out.print("국어 : ");
		int num4 = sc2.nextInt();
		
		System.out.print("영어 : ");
		int num5 = sc2.nextInt();
		
		System.out.print("수학 : ");
		int num6 = sc2.nextInt();
		
		int sum2 = num4 + num5 + num6;
		System.out.println(num4 + " + " + num5 + " + " + num6 + " = " + sum2);
	}

}
