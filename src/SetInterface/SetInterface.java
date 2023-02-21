package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");

		System.out.println("Acount Instance : " + set.size());

		// Full output using Iterator
		for (Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\n");
		}
		System.out.println();

		// Full output using 'for-each'
		for (String s : set) {
			System.out.print(s + "\n");
		}
		System.out.println();

	}

}
