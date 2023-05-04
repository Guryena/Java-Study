package LamdaEx;

@FunctionalInterface  //it's mean abstract function for lamda
interface Printable {
	public abstract void print(String s);
}


//class Printer implements Printable {
//
//	@Override
//	public void print(String s) {
//		// TODO Auto-generated method stub
//		System.out.println(s);
//		
//	}
//	
//}

//람다 : -> 파라미터와 함수 본체 사이
//자바에서의 람다는 기본적으로 인터페이스 구현
//람다 구현을 위한 인터페이스는 기본적으로 반드시 추상함수가 한개여야 함

// 1) 매개변수가 있고 반환하지 않는 람다식 



public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lamda");
		
//		Printable prn = new Printer();
		
		Printable prn =  (s) -> {
			System.out.println(s);
		};
		
		prn = (s) -> { System.out.println(s); };
		prn.print("LamdaEX1-1");
		
		prn = s -> { System.out.println(s); };
		prn.print("LamdaEX1-2");
		
		prn = s -> System.out.println(s);
		prn.print("LandaEX1-3");
		
		
		prn.print("Lamda Printer");
	}
	
}
