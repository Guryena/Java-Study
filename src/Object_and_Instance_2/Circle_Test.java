package Object_and_Instance_2;

class Circle {
	final double PI = 3.14;
	double Radius;
	double area;

	void setRadius(double num) {
		Radius = num;
	}

	double getRadius() {
		return Radius;
	}

	double getArea() {
		area = PI * Math.pow(Radius, 2);
		return area;
	}
}

class Rectangle{
	double Width;
	double Height;
	double area;
	void setWidth(double x) {
		Width = x;
	}
	double getWidth() {
		return Width;
	}
	
	void setHeight(double y) {
		Height = y;
	}
	double getHeight() {
		return Height;
	}
	
	double get_rectangle_Area() {
		area = Width*Height;
		return area;
	}
}

public class Circle_Test {

	public static void main(String[] args) {
		Circle circle = new Circle();
//반지름 10의 원의 넓이
		circle.setRadius(10);
		double area = circle.getArea();
		System.out.println(area);
		
	//--------------------------------------------	
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setWidth(10);
		double rectangle_area = rectangle.get_rectangle_Area();
		System.out.println(rectangle_area);
		
	}
}
