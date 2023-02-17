package TEST;

public class Test {

	public static void main(String[] args) {
		Person<String, Integer> p = new Person<String, Integer>();
		   p.set("홍길동", 25);
		   System.out.println(p); //출력 : 홍길동 25 세 입니다. 

	}

}
