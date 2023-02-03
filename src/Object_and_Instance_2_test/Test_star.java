package Object_and_Instance_2_test;

public class Test_star {
	void printTriangle(int star) {
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
