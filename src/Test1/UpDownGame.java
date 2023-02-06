package Test1;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		int count = 10;

		Scanner sc = new Scanner(System.in);
		System.out.println("1 게임 시작" + "\t" + "2 게임 종료");
		int play = sc.nextInt();
		if (play == 1) {
			while (count > 0) {
				int num = sc.nextInt();
				Game game = new Game(num);
				System.out.println(game.matching());
				count--;
				System.out.println("남은 횟수 = "+count);
			}
		} else if (play == 2) {
			System.out.println("게임을 종료합니다");
			System.exit(0);
		}
	}
}
