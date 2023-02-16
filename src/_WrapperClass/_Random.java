package _WrapperClass;

import java.util.Random;

public class _Random {

	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 7; i++) {
			System.out.println(random.nextInt(1000));
			
		}
	}

}
