package _Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		
		//Save data that type Key-Value
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		//Detected data
		System.out.println("23번 : " + map.get(23));
		System.out.println("37번 : " + map.get(37));
		System.out.println("45번 : " + map.get(45));
		System.out.println();
		//Create Collection Instance on only Key
		Set<Integer> ks = map.keySet();
		
		//Output all Key(for-each)
		for (Integer n : ks) {
			System.out.print(n.toString()+"\t");
		}
		System.out.println();
		
		//Output all Value(for-each)
		for (Integer n : ks) {
			System.out.print(map.get(n).toString()+"\t");
		}
		System.out.println();
		
		//Output all Value(Iterator)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next())+"\t");
			
		}
		System.out.println();
		
		
		//Remove data
		map.remove(37);

		//Check remove data
		System.out.println("37번 : " + map.get(37));
	}

}
