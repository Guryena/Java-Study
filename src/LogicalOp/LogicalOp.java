package LogicalOp;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;

		// ���� num1�� ����� ���� 1�� 100������ ���ΰ�?
		result = (1 < num1) && (num1 < 100);
		System.out.println(result);

		// ���� num2�� ����� ���� 2 �Ǵ� 3�� ����ΰ�?
		result = (num2 % 2 == 0) || (num2 % 3 == 0);
		System.out.println(result);

		// ���� num1�� 0�ΰ�?
		result = !(num1 != 0);
		System.out.println(result);

		// 55�� 5�� ����̰�, 3�� ��������� �Ǻ��Ͻÿ�
		int num3 = 55;
		result = num3 % 5 == 0 && num3 % 3 == 0;
		System.out.println(result);

		// 3�� ¦������ Ȧ������ �Ǻ��Ͻÿ�
		int num4 = 3;
		result = num4 % 2 == 0;
		System.out.println(num4 + "�� ¦���̴� " + result);

		// 77�� 11�� ������� 7�� ������� �Ǻ��Ͻÿ�
		int num5 = 77;
		result = (num5 % 11 == 0) && (num5 % 7 == 0);
		System.out.println(result);
		
	}

}
