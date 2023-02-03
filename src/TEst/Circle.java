package TEst;

public class Circle {
	private double radius;
	private static double sum;
	private double area;
	
	public Circle(double r) {
		this.radius = r;
	}

	private double area() {
		area = (double)Math.pow(radius, 2) * Math.PI;
		return area;
	}

	public static double getArrArea(Circle[] circle) {
		for (int i = 0; i < circle.length; i++) {
			sum += circle[i].area();
		}
		return sum;
	}
}
