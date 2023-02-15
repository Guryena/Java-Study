package EqualsMethod;

public class EqualsMethod {
	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);
		
		if (num1.equals(num2)) {
			System.out.println(num1+ " " + num2 + " 내용 동일");
		}
		else {
			System.out.println(num1 + " " + num2 + " 내용 상이");
		}
		
		if (num1.equals(num3)) {
			System.out.println(num1 + " " + num3 + " 내용 동일");
		}
		else {
			System.out.println(num1 + " " + num3 + " 내용 상이");
		}
		
		System.out.println();
		
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동"))); //true
		System.out.println(p1.equals(new Person("최명태"))); //false

	}
}

