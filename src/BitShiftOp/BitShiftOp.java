package BitShiftOp;

public class BitShiftOp {

	public static void main(String[] args) {
		byte num;

		num = 2; // 00000010
		System.out.print((num << 1) + " "); // 00000100 2^1배
		System.out.print((num << 2) + " "); // 00001000 2^2배
		System.out.print((num << 3) + " " + "\n"); // 00010000 2^3배

		num = 8; // 00001000
		System.out.print((num >> 1) + " "); // 00000100 1/2^1배
		System.out.print((num >> 2) + " "); // 00000010 1/2^2배
		System.out.print((num >> 3) + " " + "\n"); // 00000001 1/2^3배

		num = -8; // 11111000
		System.out.print((num >> 1) + " "); // 00000100 1/2^1배
		System.out.print((num >> 2) + " "); // 00001000 1/2^2배
		System.out.print((num >> 3) + " " + "\n"); // 00010000 1/2^3배

	}

}
