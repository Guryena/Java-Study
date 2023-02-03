package infinite_loof;

public class infinite_loof {

	public static void main(String[] args) {
//		for (;;) {
//			System.out.println("01");
//		} 
//		while (true) {
//			System.out.println("01");
//		}
		
		int num=1;
		while (true) {
			if (num%4==0 && num%97==0) {
				break;
			}
		}
		System.out.println(num);
	
	}

}
