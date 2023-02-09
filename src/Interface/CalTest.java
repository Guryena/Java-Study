package Interface;

public class CalTest {

	public static void main(String[] args) {
		ICalculator calculator = new MyCalculator();
		System.out.println(calculator.add(10, 20)); //30
		System.out.println(calculator.sub(10, 20)); //-10
		System.out.println(calculator.mul(10, 20)); //200
		System.out.println(calculator.div(10, 20)); // 0.5
	}

}
