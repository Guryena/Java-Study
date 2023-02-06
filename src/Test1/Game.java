package Test1;

public class Game extends RandomNumber {
	private int num;
	private String x;
	public Game(int num) {
		this.num = num;
//		matching();
	}

	String matching() {
		if (num == this.value) {
//			System.out.println("일치");
			x = "일치";
		} else if (num > this.value) {
//			System.out.println("Down");
			x = "Down";
		} else if(num < this.value) {
//			System.out.println("Up");
			x = "Up";
		}return x;
	}

}
