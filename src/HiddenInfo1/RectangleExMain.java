package HiddenInfo1;

import HiddenInfo2.*;

public class RectangleExMain {

	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle(10, -20);
//		rectangle.width = 10;//컴파일에러

		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.contains(t);
		r.contains(s);
	}

}
