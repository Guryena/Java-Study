package Test;

public class Regular extends Employee {
	private int salary;
	
	public Regular(String name, int age, String adress, String Dep, int salary) {
		super(name, age, adress, Dep);
		this.salary = salary;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("정규직 " + salary);
	}
//	클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
//	생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
//	Setter : 월급 정보 필드를 지정
//	메소드 printInfo() : 인자는 없고 "정규직"이라는 정보와 월급을 출력
	
	
}
