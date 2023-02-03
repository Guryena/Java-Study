package This_EX;

public class TV {
	private int size;
	private String color;

	public TV(int size, String color) {
		this.size = size;
		this.color = color;
		this.show();
	}

	int getSize() {
		return size;
	}

	String getColor() {
		return color;
	}

	void compareSize(TV compareTV) {
					//ㄴ엄연한 생성자
		if (this.size > compareTV.size) {
			System.out.println("작은 사이즈");
		}
		else if (this.size < compareTV.size) {
			System.out.println("큰 사이즈");
		}
		else {
			System.out.println("같은 사이즈");
		}
	}
	
	public void show() {
		System.out.println(this.size + "인치 " 
					+ this.color + "색 입니다.");
//		System.out.println(getSize() + "인치 " 
//				+ getColor() + "색 입니다.");
	}

}
