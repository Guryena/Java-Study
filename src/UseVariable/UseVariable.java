package UseVariable;

public class UseVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; // 변수 num1 선언
		num1 = 10; // 변수 num1에 10을 저장

		int num2 = 20; // 변수 num2를 선언 후 20을 저장
		int num3 = num1 + num2; // 두 변수 값을 대상으로 더한 후 변수 num3에 저장

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
