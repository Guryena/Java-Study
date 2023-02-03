package Double_Loof;

public class Double_loof {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 3; i > 0; i--) {
			System.out.println("----------------------");
			for (int j = 0; j < n; j++) {
				System.out.print("[" + i + ", " + j + "] ");
			}
			System.out.print('\r');
		}
////				if (i % point != 0) {
////					continue;
////				}
		int dan = 9;
		int dan1 = 9;
		int x = 1;
		int y = 1;
		int sum = 0;
		int point = 3;

		for (int i = dan; i >= x; i--) {
//			if (i != point) {
//				continue;
//			}
			System.out.println("-----------" + i + "단---------------");
			for (int j = dan1; j >= y; j--) {
				System.out.println(i + " x " + j + " = " + i * j);
				int mul = i * j;
				sum += mul;
			}
		}
		System.out.println(sum);

	}

}
