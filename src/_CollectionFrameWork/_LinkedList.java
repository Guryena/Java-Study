package _CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;


class _LinkedListTest {
	int num;
	_LinkedListTest linked;
}

public class _LinkedList {
	public static void main(String[] args) {

		_LinkedListTest l1 = new _LinkedListTest();
		l1.num = 1;
		_LinkedListTest l2 = new _LinkedListTest();
		l2.num = 2;

		l1.linked = l2;
		
		List<String> list = new LinkedList();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (String word : list) {
			System.out.print(word +"\t");
		}
	}

}
