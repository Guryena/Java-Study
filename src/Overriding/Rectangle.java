package Overriding;

public class Rectangle extends Shape {
	private double base;
	private double height;
	private double area;

	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		area = base * height;
		return area;
	}

}
