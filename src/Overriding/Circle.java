package Overriding;

public class Circle extends Shape {
	private double radius;
	private double area;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public double getArea() {
		area = Math.pow(radius, 2) * Math.PI;
		return area;
	}

}
