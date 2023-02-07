package Test;

public class Employee {
	private String name;
	private int age;
	private String adress;
	private String Dep;

	public Employee(String name, int age, String adress, String Dep) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.Dep = Dep;
	}

	public void printInfo() {
		System.out.println(name +" "+ age +" "+ adress + " "+Dep);
	}
	// - 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
//		- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
//		- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

}
