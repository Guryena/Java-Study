package Ref;

public class Ref_Test {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.initTriangle(10, 5);
		
		Triangle triangle2 = new Triangle();
		triangle2.initTriangle(10, 5);
		
		triangle.Compare(triangle2);
		compare(triangle, triangle2);

		triangle2.initTriangle(10, 10);

		triangle.Compare(triangle2);
		compare(triangle, triangle2);
		
		
	}

	private static void compare(Triangle tri1, Triangle tri2) {
		double array[] = { tri1.base, tri2.base, tri1.height, tri2.height };
		if (array[0] == array[1] && array[2] == array[3]) {
			System.out.println("같은 삼각형입니다.");
			if (tri1.get_Area() == tri2.get_Area()) {
				System.out.println("같은 면적입니다");
			}
		} else {
			System.out.println("다른 삼각형입니다.");
			if (tri1.get_Area() == tri2.get_Area()) {
				System.out.println("같은 면적입니다.");
			}
			else {
				System.out.println("다른 면적입니다.");
			}
		}
	}
}