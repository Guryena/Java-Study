package IF;

public class IF {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;

		// if
		if (x < y) {
			System.out.println("x > y is true");
		}
		// if~else
		if (x == y) {
			System.out.println("x == y is true");
		} else {
			System.out.println("x == y is false");
		}

		if (y % 2 == 0) {
			System.out.println(y + "��(��) ¦��");
		} else if (y % 2 == 1) {
			System.out.println(y + "��(��) Ȧ��");
		}

		int n2 = 7;
		if (n2 % 3 == 0 && n2 % 2 == 0) {
			System.out.println("3�� ������� 2�� ���");
		} else if (n2 % 3 == 0 && n2 % 2 != 0) {
			System.out.println("�޷�");
		} else {
			System.out.println("����");
		}

		int kor = 70;
		int eng = 65;
		int math = 100;
		// double avg = (double)(kor + eng + math) / 3;
		double avg = (kor + eng + math) / 3.0;
		if (avg >= 90) {
			System.out.println("��");
		} else if (avg >= 80) {
			System.out.println("��");
		} else if (avg >= 70) {
			System.out.println("��");
		} else if (avg >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		System.out.println(avg);

		if (kor > eng && kor > math) {
			System.out.println(kor + " kor");
		} else if (eng > kor && eng > math) {
			System.out.println(eng + " eng");
		} else if (math > kor && math > eng) {
			System.out.println(math + " math");
		}
		
	}
}