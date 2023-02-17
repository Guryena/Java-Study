package _Generic;

public class _Generic {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.set(new Apple());
		oBox.set(new Orange());

		Apple ap = (Apple) aBox.get();
		Orange og = (Orange) oBox.get();

		System.out.println(ap);
		System.out.println(og);

		
		//It's don't use because direct
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}

}
