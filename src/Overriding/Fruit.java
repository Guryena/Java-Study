package Overriding;

public class Fruit {
	public String getName() {
		return null;
	}
	
	public static void getFruit(Fruit[] fruit) {
		String str=null;
		for (int i = 0; i < fruit.length; i++) {
			str=fruit[i].getName();
			System.out.println("나는 " + str+"입니다.");
		}
	}
}
