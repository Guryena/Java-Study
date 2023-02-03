package LogicalOp;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;

		// 변수 num1에 저장된 값이 1과 100사이의 수인가?
		result = (1 < num1) && (num1 < 100);
		System.out.println(result);

		// 변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result = (num2 % 2 == 0) || (num2 % 3 == 0);
		System.out.println(result);

		// 변수 num1이 0인가?
		result = !(num1 != 0);
		System.out.println(result);

		// 55가 5의 배수이고, 3의 배수인지를 판별하시오
		int num3 = 55;
		result = num3 % 5 == 0 && num3 % 3 == 0;
		System.out.println(result);

		// 3이 짝수인지 홀수인지 판별하시오
		int num4 = 3;
		result = num4 % 2 == 0;
		System.out.println(num4 + "은 짝수이다 " + result);

		// 77이 11의 배수이자 7의 배수인지 판별하시오
		int num5 = 77;
		result = (num5 % 11 == 0) && (num5 % 7 == 0);
		System.out.println(result);
		
	}

}
