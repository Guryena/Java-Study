package LamdaEx;

import java.util.Random;

//람다 : -> 파라미터와 함수 본체 사이
//자바에서의 람다는 기본적으로 인터페이스 구현
//람다 구현을 위한 인터페이스는 기본적으로 반드시 추상함수가 한개여야 함

// 3.1) 매개변수가 없는 method
interface Generator{
	int rand();
}

// 3.2) 함수에 람다함수 전달


public class LamdaExample3 {

	public static void getHowLong(HowLong howLong, String s) {
		System.out.println(howLong.len(s));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ex3.1");
		
		Generator gen = () -> {
			Random random = new Random();
			return random.nextInt(30);
		};
		
		System.out.println(gen.rand());
		
		
		System.out.println();
		System.out.println("ex3.2");
		
		
		
	}
	
}
