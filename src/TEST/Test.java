package TEST;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);

			String course[] = { "Java", "C++", "HTML5", "Computer Structure", "Android" };
			int score[] = { 95, 88, 76, 62, 55 };

			String name = sc.next();
			for (int i = 0; i < score.length; i++) {
				if (course[i].equals(name)) {
					int n = score[i];
					System.out.println("Class Name >> " + name);
					System.out.println("Score of " + name + " is " + n);
				} else {
					System.out.println("Be not subject");
				}
			}
			if (name.equals("Stop") || name.equals("stop")) {
				System.exit(0);
			} else {
				continue;
			}
		}
	}
}
