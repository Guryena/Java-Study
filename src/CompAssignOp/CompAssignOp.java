package CompAssignOp;

public class CompAssignOp {

	public static void main(String[] args) {
		short num = 10;
		num = (short) (num + 77L); // �� ��ȯ ���ϸ� ������ ����
		int rate = 3;
		rate = (int) (rate * 3.5); // �� ��ȯ ���ϸ� ������ ����

		System.out.println(num);
		System.out.println(rate);

		num = 10; // �� ��ȯ �ʿ����� �ʴ�
		num += 77L;
		rate = 3; // �� ��ȯ �ʿ����� �ʴ�
		rate *= 3.5;

		System.out.println(num);
		System.out.println(rate);

	}

}
