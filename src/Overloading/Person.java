package Overloading;

public class Person {
	private int regiNum; // 주민등록번호
	private int passNum; // 여권번호

	Person(int rNum, int pNum) {
		this.regiNum = rNum;
		this.passNum = pNum;
	}

	Person(int rNum) {
		this.regiNum = rNum;
		this.passNum = 0;
	}

	Person() {
		this.regiNum = 0;
		this.passNum = 0;
	}

	void showPersonalInfo() {
		System.out.println("주민등록번호 : " + this.regiNum + ", " + "여권번호 : " + this.passNum);
	}

}
