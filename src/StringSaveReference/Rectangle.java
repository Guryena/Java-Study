package StringSaveReference;

public class Rectangle {
	private double base;
	private double height;
	private double area;
	private static double addRrectangle;
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	private double area() {
		area = base * height;
		return area;
	}
	
	public static double getArrArea(Rectangle[] rectangle) {
		for (int i = 0; i < rectangle.length; i++) {
			addRrectangle += rectangle[i].area();
		}
		return addRrectangle;
	}
}
