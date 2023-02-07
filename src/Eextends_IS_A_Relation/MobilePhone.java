package Eextends_IS_A_Relation;

public class MobilePhone {
	protected String number; // Phone Number

	public MobilePhone(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi, From " + number);
	}
}
