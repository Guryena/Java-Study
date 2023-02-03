package _String;

class Baby{

	int age;
	String name;
	String adult;
	
	public Baby(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void setAge(int num) {
		age = num;
	}
	
	int getAge() {
		return age;
	}
	
	String showAdult(){
		if (age>=20) {
			adult = "술을 마실 수 있습니다.";
		}
		else {
			adult = "술을 마실 수 없습니다.";
		}
		return adult;
	}
	
	void init_Baby(int num, String name) {
		age = num;
		this.name = name;
	}
	void show() {
		System.out.println(age + "살 "+this.name + "입니다.");
	}
	
	void compareAge(Baby baby) {
		if (this.age > baby.age) {
			System.out.println("형입니다");
		}else if (this.age < baby.age) {
			System.out.println("동생입니다");
		}
	}
	
//	void showAdult() {
//		if (age >=20) {
//			System.out.println("술을 마실 수 있습니다.");
//		}
//		else {
//			System.out.println("술을 마실 수 없습니다.");
//		}
//	}
	
}

class BabyTest {

	public static void main(String[] args) {
		Baby baby = new Baby(5, "아기");
		Baby baby2 = new Baby(6, "홍길동");
		Baby baby3 = new Baby(4, "홍길순");
		
		baby.init_Baby(5, "아기");
		baby2.init_Baby(6, "홍길동");
		baby3.init_Baby(4, "홍길순");
		
		baby.show();
		baby2.show();
		baby3.show();
		
		baby.compareAge(baby2);
		baby.compareAge(baby3);
		
		
		baby.setAge(20);
		System.out.println("입력해준 나이 : "+baby.getAge());
		baby.showAdult();
		System.out.println(baby.showAdult());
		System.out.println(baby);

	}

}
