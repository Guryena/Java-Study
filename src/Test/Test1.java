package Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Random lotto = new Random();
		Set<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			set.add((int) (lotto.nextInt(44) + 1));

		}
		System.out.println(set);
	}
}
