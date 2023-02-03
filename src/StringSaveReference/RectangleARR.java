package StringSaveReference;

import java.util.Scanner;

public class RectangleARR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base1 = sc.nextDouble();
		double height1 = sc.nextDouble();
		double base2 = sc.nextDouble();
		double height2 = sc.nextDouble();
		
		Rectangle[] recArr = new Rectangle[2];
		recArr[0] = new Rectangle(base1, height1);
		recArr[1] = new Rectangle(base2, height2);
		
		double areas = Rectangle.getArrArea(recArr);
		System.out.println(areas);
	}

}
