package Object_and_Instance_2;

class Baby{

	int age;
	String adult;
	
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
		Baby baby = new Baby();
		baby.setAge(20);
		System.out.println(baby.getAge());
		baby.showAdult();
		System.out.println(baby.showAdult());
		System.out.println(baby);

	}

}
