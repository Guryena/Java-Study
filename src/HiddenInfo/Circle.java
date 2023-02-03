package HiddenInfo;

public class Circle {
	private double rad = 0;
	final double PI = Math.PI;

	public Circle(double r) {
		setRad(r);
	}

	void setRad(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}

	public double getArea() {
		return Math.pow(rad, 2) * PI;
	}
}
