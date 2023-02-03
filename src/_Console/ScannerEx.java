package _Console;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("국어 : ");
			int kor = sc.nextInt();
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			System.out.println("수학 : ");
			int math = sc.nextInt();
			
			Grade grade = new Grade(kor, eng, math);
			
			String yORn = sc.next();
			if (yORn.equals("y")||yORn.equals("Y")) {
				continue;
			}
			else if(yORn.equals("n")||yORn.equals("N")){
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}

	}

}
