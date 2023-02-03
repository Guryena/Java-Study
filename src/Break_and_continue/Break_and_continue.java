package Break_and_continue;

public class Break_and_continue {

	public static void main(String[] args) {
		// break
		int num = 1;
		boolean search = false;
		// 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
		while (num < 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				search = true;
				break; // 반복문을 탈출
			}
			num++;

		}
		if (search) {
			System.out.println(num);
		} else {
			System.out.println("not detected");
		}

		// for문 : 7의 배수이자 8의 배수
		int x = 100;
		int result = 0;
		boolean search1 = false;
		for (int i = 1; i <= x; i++) {
			if (i % 7 == 0 && i % 8 == 0) {
				search1 = true;
				result = i;
				break;
			}
		}
		if (search1) {
			System.out.println(result);
		} else {
			System.out.println("not detected");
		}
		
		// 알파벳 A=1일 경우 알파벳 중에서 10번쨰 알파벳
		int n = 10;
		int al = 26;
		for (int i = 1; i <= al; i++) {
			if (i == n) {
				switch (i) {
				case 1:
					System.out.println("A");
					break;

				case 2:
					System.out.println("B");
					break;

				case 3:
					System.out.println("C");
					break;

				case 4:
					System.out.println("D");
					break;

				case 5:
					System.out.println("E");
					break;

				case 6:
					System.out.println("F");
					break;

				case 7:
					System.out.println("G");
					break;

				case 8:
					System.out.println("H");
					break;

				case 9:
					System.out.println("I");
					break;

				case 10:
					System.out.println("J");
					break;

				case 11:
					System.out.println("K");
					break;

				case 12:
					System.out.println("L");
					break;

				case 13:
					System.out.println("M");
					break;

				case 14:
					System.out.println("N");
					break;

				case 15:
					System.out.println("O");
					break;

				case 16:
					System.out.println("P");
					break;

				case 17:
					System.out.println("Q");
					break;

				case 18:
					System.out.println("R");
					break;

				case 19:
					System.out.println("S");
					break;

				case 20:
					System.out.println("T");
					break;

				case 21:
					System.out.println("U");
					break;

				case 22:
					System.out.println("V");
					break;

				case 23:
					System.out.println("W");
					break;

				case 24:
					System.out.println("X");
					break;

				case 25:
					System.out.println("Y");
					break;

				case 26:
					System.out.println("Z");
					break;

				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}
			}

		}
	}

}
