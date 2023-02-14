package Exception;

public class Circle {
	private double rad = 0;
	final double PI = Math.PI;

	public Circle(double r) {
		setRad(r);
	}

	private void setRad(double r) {
		if (r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}

	private double getArea() {
		return Math.pow(rad, 2) * PI;
	}

	@Override
	public String toString() {
		String str = "값은 " + String.valueOf(getArea());
		return str;
	}
}
