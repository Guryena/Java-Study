package Eextends_IS_A_Relation;

public class Relation {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-7777", "Nougat");
		phone.answer();
		phone.playApp();
		System.out.println();
		
		MobilePhone ph2 = new SmartPhone("010-999-3333", "Nougat");
		ph2.answer();
//		ph2.playApp();
		
		
		
	}

}
