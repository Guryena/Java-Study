package For;

public class For_Grammar {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(" i love java " + i);
		}
		//합계
		int n = 100;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		//9단
		int x = 9;
		int y = 10;
		int mul = 0;
		for (int i = 0; i <= y; i++) {
			mul = x * i;
			System.out.println(x + " x " + i + " = " + mul);
		}
		//감소
		int discount = 0;
		for (int i = 10; i >= discount; i--) {
			System.out.println(i);
		}
		//짝수값 출력
		int x1 = 7;
		int y1 = 10;
		int mul1 = 0;
		for (int i = y1; i > 0; i--) {
			mul1 = x1 * i;
			if (mul1 % 2 == 0) {
				System.out.println(x1 + " x " + i + " = " + mul1);
			}
		}
	}

}