package ClassMethod;
//메모리에 올라가는 순서가 다르기 때문
//인스턴스 변수 = new 했을 때
//static 변수 선언할 때
public class NumberPrinter {
	private int myNum=0;
	
	static void showInt(int n) {
		System.out.println(n);
	}
	static void showDouble(double n) {
		System.out.println(n);
	}
	void setMyNumber(int n) {
		myNum = n;
	}
	void showMyNumber() {
		showInt(myNum);
	}
}
