package LamdaEx;


//람다 : -> 파라미터와 함수 본체 사이
//자바에서의 람다는 기본적으로 인터페이스 구현
//람다 구현을 위한 인터페이스는 기본적으로 반드시 추상함수가 한개여야 함

// 2.1) 매개변수가 두개인 람다식

@FunctionalInterface
interface Calculate {
	void cal(int a, int b); //매개변수 두개, 반환형 void
}

// 2.2) 매개변수가 존재하며 반환값이 있는 람다식
interface Calculate2 {
	int cal(int a, int b);
}

interface HowLong{
	int len(String s);
}

public class LamdaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ex2-1");
		Calculate cal;
		
		cal = (a, b) -> System.out.println(a + b);
		cal.cal(6, 4);

		cal = (a, b) -> System.out.println(a - b);
		cal.cal(6, 4);

		cal = (a, b) -> System.out.println(a * b);
		cal.cal(6, 4);

		cal = (a, b) -> System.out.println(a / b);
		cal.cal(6, 4);

		cal = (a, b) -> System.out.println(a % b);
		cal.cal(6, 4);
		
		
		System.out.println();
		System.out.println("ex2-2");
		
		
		Calculate2 cal2;
		
		cal2 = (a , b) -> { return a +b; }; //return 문은 {} 생략 불가
		System.out.println(cal2.cal(7, 3));
		
		cal2 = (a, b) -> a - b;
		System.out.println(cal2.cal(7, 3));
		
		
		System.out.println();
		
		
		HowLong howLong;
		howLong = (s) -> s.length();
		System.out.println(howLong.len("abcd"));
		
		
	}
	
}
