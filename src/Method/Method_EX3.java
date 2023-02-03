package Method;

public class Method_EX3 {

	public static void main(String[] args) {
		divide(4, 2);
		divide(6, 2);
		divide(9, 0);
		
		oneToHap(10);
		toHap(2,10);
	}
	private static void oneToHap(int x) {
		int sum = 0;
		for (int i = 0; i <= x; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	private static void toHap(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	public static void divide(double x, double y) {
		if (y==0) {
			System.out.println("극한값");
			return;
		}
		System.out.println("나눗셈 결과 = " + (x/y));
	}
	
	
//	"oneToHap(10)
//	-1부터 10까지의 합
//	toHap(2,10)
//	-2 부터 10까지의 합"

}
