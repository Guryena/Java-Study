package Enhanced_for;

import java.util.Arrays;
import java.util.stream.Stream;

public class for_each {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
//////////////////////////////////////////		
		for (int i : ar) {
			System.out.print(i + " ");
		}

		System.out.println();
////////////////////////////////////////
		int sum = 0;
		for (int i : ar) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println(Arrays.stream(ar).sum());
////////////////////////////////////////		
		String[] ar1 = { "AASDFDSAF", "ASDFASF", new String("ABD") };
		for (String str : ar1) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.println(Arrays.toString(ar1));

		Stream<String> strStream = Arrays.stream(ar1);
		strStream.forEach(i -> {
			System.out.print(i + " ");
		});
////////////////////////////////////////		
		
	}

}
