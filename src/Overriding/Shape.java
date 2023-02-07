package Overriding;

public class Shape  {
	public double getArea() {
		return 0;
	}
	
	public static double shapeAllArea(Shape[] shape) {
		double sum=0;
		for (int i = 0; i < shape.length; i++) {
			sum+=shape[i].getArea();
		}
		return sum;
	}
}
