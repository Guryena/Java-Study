package Break_and_continue;

public class Break_and_continue {

	public static void main(String[] args) {
		// break
		int num = 1;
		boolean search = false;
		// ó�� ������ 5�� ������� 7�� ����� ���� ã�� �ݺ���
		while (num < 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				search = true;
				break; // �ݺ����� Ż��
			}
			num++;

		}
		if (search) {
			System.out.println(num);
		} else {
			System.out.println("not detected");
		}

		// for�� : 7�� ������� 8�� ���
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
		
		// ���ĺ� A=1�� ��� ���ĺ� �߿��� 10���� ���ĺ�
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
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}
			}

		}
	}

}
