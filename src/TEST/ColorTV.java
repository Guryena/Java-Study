package TEST;

public class ColorTV extends TV {
	private int color;

	public ColorTV(int inch, int color) {
		super(inch);
		this.color = color;

	}

	public void printProperty() {
		System.out.println(this.getSize() + "인치 " + this.color + "컬러");
	}

}
