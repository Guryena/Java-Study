package Arrangement;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		while (true) {

			Scanner sc = new Scanner(System.in);

			String java1 = sc.next();
			String java2 = sc.next();

			Java java = new Java(java1, java2);

			String yORn = sc.next();
			
			if (yORn.equals("y") || yORn.equals("Y")) {
				continue;
			} else if (yORn.equals("n") || yORn.equals("N")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}
}
