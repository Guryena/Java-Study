package _CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _iterator {
	public static void main(String[] args) {

		List<String> list = new LinkedList();

		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (String word : list) {
			System.out.print(word + "\t");
		}
		
		System.out.println();
		
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() +"\t");
		}
		System.out.println();
		
		String str;
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			str = itr.next();
		}
	}
}