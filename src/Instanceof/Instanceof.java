package Instanceof;

public class Instanceof {

	public static void main(String[] args) {
		A a = new B();  //A a = (A) new B();  To be Hidden data type that (A)
		B b = (B) new A(); //Only turn up in the memory
		
	}

}
