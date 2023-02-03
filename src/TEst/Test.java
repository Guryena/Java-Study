package TEst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

//		Circle[] circleArr = new Circle[2];
//		circleArr[0] = new Circle(10);
//		circleArr[1] = new Circle(10);
		
		Circle[] circleArr = {new Circle(10), new Circle(10)};
//		List<Circle> circle = new ArrayList<Circle>();
//		circle.add(new Circle(10));
//		circle.add(new Circle(10));
		
		
		
		
		double areas = Circle.getArrArea(circleArr);
		System.out.println(areas);

//		String[] strArr = new String[3];
//
//		strArr[0] = "ABCDER";
//		strArr[1] = "ABCDER";
//		strArr[2] = "ABCDER";
		String[] strArr = {"ABCDER" , "ABCDER" , "ABCDER"};

		System.out.println(getStrArr(strArr));

		int[] lotto = new int[6];
		int max = 45;
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) - 1;
			lotto[i] = random;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

	public static int getStrArr(String[] str) {
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			sum += str[i].length();
		}
		return sum;
	}
}