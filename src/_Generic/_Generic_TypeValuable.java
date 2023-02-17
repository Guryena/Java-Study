package _Generic;

public class _Generic_TypeValuable {

	public static void main(String[] args) {
		Box_TypeValuable<Apple> aBox = new Box_TypeValuable<Apple>();
		Box_TypeValuable<Orange> oBox = new Box_TypeValuable<Orange>();
						// <> = type valuable
		
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}

}
