package Variable;

public class Circle {
	private static final double PI = Math.PI;
	private double radius;

	Circle(double rad) {
		radius = rad;
		showArea();
		showPerimeter();
	}

	void showPerimeter() {
		double peri = 2 * radius * PI;
		System.out.println("둘레 : " + peri);
	}

	void showArea() {
		double area = Math.pow(radius, 2) * PI;
		System.out.println("넓이 : " + area);
	}

}
