package StringSaveReference;

import java.util.ArrayList;
import java.util.List;

public class ArrayLoopEX {

	public static void main(String[] args) {
		String[] sr = new String[3];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		
		int cnum = 0;
		
		for (int i = 0; i < sr.length; i++) {
			cnum += sr[i].length();
		}
		System.out.println("문자의 수 : "+cnum);
		
		
	}

}
