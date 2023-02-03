package Overloading;

public class OverloadingTest {

	public static void main(String[] args) {
		OverLoadEx ex = new OverLoadEx();
		ex.print(100);
		ex.print('A');
		ex.print("Hello");
		
		

		Person jung = new Person(335577, 112233);
		Person hong = new Person(335577);

		jung.showPersonalInfo();
		hong.showPersonalInfo();
		
	}

}
