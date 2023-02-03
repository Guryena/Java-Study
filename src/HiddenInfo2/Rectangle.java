package HiddenInfo2;

import HiddenInfo1.*;

public class Rectangle {
	private double base;
	private double height;
	private double area;

	public Rectangle(double x1, double y1, double x2, double y2) {
		base = Math.abs(x1 - x2); // 절대값
		height = Math.abs(y1 - y2);
		wrongInput();
		show();
	}

	private double wrongInput() {
		if (base == 0 || height == 0) {
			System.out.println("잘못된 입력입니다.");
		}
		return 0;
	}

	private double area() {
		area = (base * height);
		System.out.println("면적은 " + area);
		return area;
	}

	private void show() {
		area();
	}

	public void contains(Rectangle rectangle) {

		if (this.base >= rectangle.base && this.height >= rectangle.base) {
			System.out.println("포함하고 잇습니다.");

		} else if (this.base <= rectangle.base && this.height <= rectangle.base) {
			System.out.println("포함되어 있습니다.");
		} else {
			System.out.println("포함되어있지 않습니다.");
		}
	}

}