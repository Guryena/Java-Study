package ForInFor;

public class ForInFor {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		System.out.println("===================");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("===================");
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				if (n - i > 0) {
					System.out.print(" ");
				}

			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		

	}

}
