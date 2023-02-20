package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력 받아 저장(List객체)하고 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		while (true) {

			int input = sc.nextInt();
			list.add(input);
			if (input == -1) {
				break;
			}

		}
		int max = Collections.max(list);
		System.out.println(max);
	}

}
