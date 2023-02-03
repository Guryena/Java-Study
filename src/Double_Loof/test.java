package Double_Loof;

public class test {

	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");
				if (j == y-1) {
					System.out.println(" ");
				}
			}
//			System.out.println("");
		}
		
		
		
	}

}
