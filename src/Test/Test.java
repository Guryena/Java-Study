package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		ArrayList<Student> arrSt = new ArrayList<>();
		try {
			while (true) {
				if (name.equals("그만")) {
					break;
				}
				String dpe = sc.nextLine();
				int id = sc.nextInt();
				double grade = sc.nextDouble();
				sc.nextLine();

				Student student = new Student(name, dpe, id, grade);
				arrSt.add(student);
				student.showInfo();
			}
			
			for (Student student : arrSt) {
				System.out.println(student.toString());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
