package StreamEx;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//스트림의 이해
//1. 입력과 출력 수업에서 살펴본 스트림과는 전혀 다른 개념
//2.자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션을 사용합니다.
//이렇게 저장된 데이터에 접근하기 위해서는 반복문이나 반복자(iterator)를 사용하여 매번 새로운 코드를 작성
//이렇게 작성된 코드는 길이가 너무 길고 가독성도 떨어지며, 코드의 재사용이 거의 불가
//즉, 데이터베이스의 쿼리와 같이 정형화된 처리 패턴을 가지지 못했기에 데이터마다 다른 방법으로 접근
//3. 문제점을 극복하기 위해서 Java SE 8부터 스트림(stream) API를 도입
//4.스트림 API는 데이터를 추상화하여 다루므로, 다양한 방식으로 저장된 데이터를 읽고 쓰기 위한 공통된 방법을 제공
//스트림 API를 이용하면 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방법으로 다룰 수 있게 됨

/*
스트림 API의 동작 흐름
스트림 API는 다음과 같이 세 가지 단계에 걸쳐서 동작합니다.

1. 스트림의 생성
2. 스트림의 중개 연산 (스트림의 변환)
3. 스트림의 최종 연산 (스트림의 사용)
*/


//스트림의 중개 연산 함수

/*
* - filter() / distinct()
* - map() / flatMap()
* - sorted()
* - peek()
* - limit()
* - skip()
*/

/*
* 최종연산함수 종류
* 
* - forEach()
* - match()
* - sum(), count(), average(), max(), min()
* - reduce()
* - collect()
* 
*/

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(i));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//1~10
		Stream<Integer> stream = list.stream();
		stream.forEach(i -> System.out.println(i));
		
		//even number
		IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).forEach(System.out::println);

		//odd number sum
		int odd = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).sum();
		System.out.println(odd);
		
		System.out.println("----------------");
		
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
		
		System.out.println("----------------");
		
		System.out.println(IntStream.rangeClosed(1, 1000).sum());
		
		//if
		sum = IntStream.rangeClosed(1, 100).filter(i -> i % 2 ==0).sum();
		System.out.println(sum);
		
		System.out.println("----------------");
		
		IntStream.rangeClosed(1, 10)
					.filter(i -> i %2 ==0)
					.map(i -> i * 2)
					.forEach(System.out::println);
		
		System.out.println("----------------");
		
		System.out.println(IntStream.rangeClosed(1, 10)
									.filter(i -> i % 2 == 0)
									.map(i -> i * 2)
									.sum());
		
		System.out.println("----------------");
		
		
	}

	
}
