package Test1;

import java.util.Random;

public class RandomNumber {
	int value;
	public RandomNumber() {
		Random random = new Random();
		value = (int) (random.nextInt(100) + 1);
	}
}
