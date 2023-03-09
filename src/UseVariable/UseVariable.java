package UseVariable;

public class UseVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; // ���� num1 ����
		num1 = 10; // ���� num1�� 10�� ����

		int num2 = 20; // ���� num2�� ���� �� 20�� ����
		int num3 = num1 + num2; // �� ���� ���� ������� ���� �� ���� num3�� ����

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num1 + "+" + num2 + "=" + num3);

		long num4;
		num4 = 2000000000L;

		long num5 = 20000000000L;
		long num6 = num4 + num5;
		System.out.println(num4 + "+" + num5 + "=" + num6);

	}
}
