package Enhanced_for;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			String Input = sc.next();

			int rsp = 0;
			if (Input.equals("가위")) {
				rsp = 1;
			} else if (Input.equals("바위")) {
				rsp = 2;
			} else if (Input.equals("보")) {
				rsp = 3;
			} else {
				System.out.println("옯바른 값을 입력하세요");
			}

			RspPlayer player = new RspPlayer(rsp);
			System.out.println(player.setResult());

			System.out.println(player.tryM());

			String yORn = sc.next();
			if (yORn.equals("y") || yORn.equals("Y")) {
				continue;
			} else if (yORn.equals("n") || yORn.equals("N")) {
				System.out.println("exit");
				System.exit(0);
			}
		}

	}
}
