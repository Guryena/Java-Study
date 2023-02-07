package Overriding;

public class Triangle extends Shape {
	private double base;
	private double height;
	private double area;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		area = (base * height) / 2;
		return area;
	}

}
