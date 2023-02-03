package StringSaveReference;

import java.util.Arrays;

public class Circle {

	private double r;
	private double area;
	private static double areas;

	public Circle(double r) {
		this.r = r;
	}

	private double area() {
		area = Math.pow(this.r, 2) * Math.PI;
		return area;
	}

	static double getArrArea(Circle[] circle) {
		for (int i = 0; i < circle.length; i++) {
			areas += circle[i].area();
		}
		return areas;
	}

}
