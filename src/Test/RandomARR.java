package Test;

import java.util.Random;

public class RandomARR {

	public static void main(String[] args) {
//		4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 
//		랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
		int[][] arr = new int[4][4];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(11);
				System.out.print(arr[i][j]+ " ");
			}System.out.println();
		}
	}

}
