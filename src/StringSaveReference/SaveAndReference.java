package StringSaveReference;

import java.util.Arrays;

public class SaveAndReference {

	public static void main(String[] args) {
		Box[] ar = new Box[3];
		
		// Save instance in Array
		ar[0] = new Box("First");
		ar[1] = new Box("Second");
		ar[2] = new Box("Third");
		
		// Reference instance in Saved Array
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
	}

}
