package MainPosition;

public class A {
	public static void main(String[] args) {
		B b = new B();
		b.print();
		
		C c = new C();
		c.print();
	}
}

class B{
	void print() {
		System.out.println("b입니다");
	}
}

class C{
	void print() {
		System.out.println("c입니다");
	}
}