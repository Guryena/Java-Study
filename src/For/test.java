package For;

public class test {

	public static void main(String[] args) {
		int money = 126500;
		final int _50000won = 50000;
		final int _10000won = 10000;
		final int _5000won = 5000;
		final int _1000won = 1000;
		final int _500won = 500;
		final int _100won = 100;
		int balance = money;

//		int m50000 = 0; //2
//		int m10000 = 0; //2
//		int m5000 = 0; //1
//		int m1000 = 0; //1
//		int m500 = 0; //1
//		int m100 = 0; //0
		System.out.println("원금 " + money +"원");
		for (int i = 1; i <= 6; i++) {

			if (balance / _50000won > 0) {
				int m50000 = balance / _50000won;
				balance = (balance % _50000won);
				System.out.println("5만원 " + m50000 + "장");
				//System.out.println(balance);
				continue;
			} else if (balance / _10000won > 0) {
				int m10000 = balance / _10000won;
				balance = balance % _10000won;
				System.out.println("1만원 " + m10000 + "장");
				//System.out.println(balance);
				continue;
			} else if (balance / _5000won > 0) {
				int m5000 = balance / _5000won;
				balance = balance % _5000won;
				System.out.println("5천원 " + m5000 + "장");
				//System.out.println(balance);
				continue;
			} else if (balance / _1000won > 0) {
				int m1000 = balance / _1000won;
				balance = balance % _1000won;
				System.out.println("1천원 " + m1000 + "장");
				//System.out.println(balance);
				continue;
			} else if (balance / _500won > 0) {
				int m500 = balance / _500won;
				balance = balance % _500won;
				System.out.println("500원 " + m500 + "개");
				//System.out.println(balance);
				continue;
			} else if (balance / _100won > 0) {
				int m100 = balance / _100won;
				balance = balance % _100won;
				System.out.println("100원 " + m100 + "개");
				//System.out.println(balance);
				continue;
			} else {
				continue;
			}


		}
	}
}
