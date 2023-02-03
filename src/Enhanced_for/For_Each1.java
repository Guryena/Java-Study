package Enhanced_for;

import java.util.Arrays;
import java.util.stream.Stream;

public class For_Each1 {

	public static void main(String[] args) {
		Box[] ar = { new Box(101, "Coffee"), 
				new Box(202, "Computer"), 
				new Box(303, "Apple"), 
				new Box(404, "Dress"),
				new Box(505, "Fairy-tale book") };

		for (Box i : ar) {
			if (i.getBoxNum() == 505) {
				System.out.println(i);
			}
		}

		Stream<Box> str = Arrays.stream(ar);
		str.forEach(i -> {
			if (i.getBoxNum() == 505) {
				System.out.println(i);
			}
		});
	}

}
