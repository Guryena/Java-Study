package Extends;

public class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		super(name); //super() = 부모클래스의 생성자 호출명령어
//		this.name= name;
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		super.tellYourName();
	}

}
