package StringSaveReference;

import java.util.Arrays;

public class CircleARR {

	public static void main(String[] args) {
		Circle[] circleArr = new Circle[2];
		circleArr[0] = new Circle(10);
		circleArr[1] = new Circle(10);
		
		
		double areas = Circle.getArrArea(circleArr);
		System.out.println(areas); //넓이
	}

}
