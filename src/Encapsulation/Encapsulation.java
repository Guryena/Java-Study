package Encapsulation;

class Rsp {
	void inputRsp(){
			System.out.println("가위바위보 입력받기");
		}
	void randomRsp() {
		System.out.println("컴퓨터 랜덤생성하기");
	}
	void result() {
		System.out.println("승부결정짓기");
	}
	void run() {
		inputRsp();
		randomRsp();
		result();
	}
}
public class Encapsulation {
//1.가위바위보 입력받기
//2.컴퓨터랜덤
//3승부
	//프로그래밍 방법
	//1st = main안에서 전부 구동 ==절차지향언어
	public static void main(String[] args) {
		Rsp rsp = new Rsp();
		rsp.run();
	}

}
