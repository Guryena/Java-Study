package _CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _ArrayList {

	public static void main(String[] args) {
		//Create Collection Instance
		List<String> list = new ArrayList<>();

		//Save String Instance in Collection Instance
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		//Reference that saved String Instance 
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();

		//Delete 1st Instance
		list.remove(0); 

		//Reference remain Instance after delete 1st Instance
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}

}
