package SCE;

public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;

		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);// java�� &&�� ��� ���� ������ false�� ���
															// ���� ������ �������� ����
		System.out.println(result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);// java�� ||�� ��� ���� ������ true�� ���
															// ���� ������ �������� ����
		System.out.println(result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// ���չ��� <--
		int num3 = 10;
		int num4 = 20;
		int num5 = 30;
		num3 = num4 = num5;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		int x = 33;
		boolean ans;
		ans = 1 <= x && x <= 100;
		System.out.println(ans);
		int y = 22;
		ans = y % 2 == 0 || y % 3 == 0;
		System.out.println(ans);
	}

}
