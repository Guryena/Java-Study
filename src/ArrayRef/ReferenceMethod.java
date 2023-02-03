package ArrayRef;

public class ReferenceMethod {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = sumOfAry(ar);
		System.out.println(sum);
///////////////////////////////////
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
///////////////////////////////////
	}

	static int sumOfAry(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}

	static int[] makeNewIntAry(int len) {
		int[] ar = new int[len];
		return ar;
	}

}

class A {
	int a; // When create variable, variable is default 0
	char b;
	String c;
	boolean d;
}