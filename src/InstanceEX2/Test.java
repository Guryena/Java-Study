package InstanceEX2;

public class Test {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
		b.summary();
	}
	//[ ] 실행결과
//	잔액이 부족하여 을 를 살수 없습니다 Computer / .
//	구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
//	사용한 금액:850
//	남은 금액:150
}
