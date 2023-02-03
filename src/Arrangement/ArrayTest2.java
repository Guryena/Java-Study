package Arrangement;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			sum += arr1[i];
		}

		System.out.println(sum);

		int[] arrLotto = new int[6];
		int max = 45;

		for (int i = 0; i < arrLotto.length; i++) {
			int randomNum = (int) (Math.random() * max) + 1;
			arrLotto[i] = randomNum;

			for (int j = 0; j < i; j++) {
				if (arrLotto[i] == arrLotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arrLotto);
		System.out.println(Arrays.toString(arrLotto));
	}
}
