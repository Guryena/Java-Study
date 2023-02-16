package _WrapperClass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCuttingEx {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String title = sc.nextLine();
			StringTokenizer st = new StringTokenizer(title);
			int count = 0;
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				count++;
			}
			System.out.println(count + " word");

			System.out.println("Retry (Y/N)");

			String yORn = sc.next();
			if (yORn.equals("y") || yORn.equals("Y")) {
				continue;

			} else if (yORn.equals("n") || yORn.equals("N")) {
				System.out.println("enter exit...");
				String exit = sc.next();
				if (exit.equals("exit") || exit.equals("Exit") ||exit.equals("EXIT")) {
					System.exit(0);
				}
			}
			continue;
		}
	}

}
