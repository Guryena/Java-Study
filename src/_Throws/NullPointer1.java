package _Throws;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointer1 {

	public static void main(String[] args) {

		try {
			function1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void function1() throws IOException  {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num);
//
//		throw new InputMismatchException();
		
		BufferedWriter writer = null;
		writer.write('a');
		
		
	}

}
