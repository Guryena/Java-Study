package LamdaEx;

import java.util.Random;

//람다 : -> 파라미터와 함수 본체 사이
//자바에서의 람다는 기본적으로 인터페이스 구현
//람다 구현을 위한 인터페이스는 기본적으로 반드시 추상함수가 한개여야 함

// 4.1) 함수에 람다함수 전달
interface HowLong2 {
	int len(String s);
}

// 4.2 제네릭 기반의 함수형 인터페이
interface Calculate3<T> {
	T cal(T a, T b);
}

public class LamdaExample4 {

	public static void getHowLong(HowLong2 howLong2, String s) {
		System.out.println(howLong2.len(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ex4.1");

		getHowLong(s -> s.length(), "hello");

		System.out.println();
		System.out.println("ex4.1");

		Calculate3<Integer> cal3 = (a, b) -> a + b;
		System.out.println(cal3.cal(4, 3));
		
		cal3 = (a, b) -> a * b;
		System.out.println(cal3.cal(4, 3));

	}

}
