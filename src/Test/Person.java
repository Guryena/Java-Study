package Test;
//- 클래스 Person
//* 필드 : 이름, 나이, 주소 선언
public class Person {
	protected String name;
	protected int age;
	protected String address;
	
	public void print() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : "+age);
		System.out.println();
		System.out.println("주소 : "+address);
	}
	
	
}
