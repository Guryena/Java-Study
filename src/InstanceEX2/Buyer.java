package InstanceEX2;

import java.util.Arrays;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("You can't buy it because don't have enough balance");
			return;
		}
		else if (money>=p.price) {
			money = money - p.price;
			cart[i++] = p;
		}
		/*
		 * (1) . 아래의 로직에 맞게 코드를 작성하시오 1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다 1.2 ,
		 * 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고 1.3 .(add ) 장바구니에 구입한 물건을 담는다 메서드 호출 Java 3 - 의
		 * 정석 판 연습문제 풀이 定石 57
		 */
	}

	void add(Product p) {
		if (i>=cart.length) {
			cart = Arrays.copyOf(cart, cart.length*2);
//			if (money>=p.price) {
//				cart[i++] = p;
//			}
		}
		/*
		 * (2) . 아래의 로직에 맞게 코드를 작성하시오 1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.1 2 . 기존의 장바구니보다 배
		 * 큰 새로운 배열을 생성한다 1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다 1.1.3 . 새로운 장바구니와 기존의 장바구니를
		 * 바꾼다 1.2 (cart) . i 1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
		 */
	} // add(Product p)

	void summary() {
		System.out.println(Arrays.toString(cart));
		int sum=0;
		for (int i = 0; i < cart.length; i++) {
			sum += cart[i].price;
		}
		System.out.println("Total Price : "+sum);
		System.out.println("Balance : "+money);
		
		/*
		 * (3) . 아래의 로직에 맞게 코드를 작성하시오 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다 1.2 . 장바구니에 담긴
		 * 물건들의 가격을 모두 더해서 출력한다 1.3 (돈) . 물건을 사고 남은 금액 를 출력한다
		 */
	} // summary()
}
