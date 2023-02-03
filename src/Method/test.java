package Method;

public class test {

	public static void main(String[] args) {

		for (char i = 'A'; i <= 'Z'; i++) {
			for (char j = 'A'; j <= 'Z'; j++) {
				if (j>'E' || i > 'E') {
					break;
				}
				if (j <= i ) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			if (i > 'E') {
				break;
			}
			System.out.println();
		}

		System.out.println("===========");
		
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= 5; j++) {
				
				if (j <= i ) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
