package _Generic;

public class TypeFactor {

	public static void main(String[] args) {
		Box_TypeValuable<String> sBox = new Box_TypeValuable<>();
		sBox.set("I'm so happy");
		
		Box_TypeValuable<Box_TypeValuable<String>> wBox = new Box_TypeValuable<>();
		wBox.set(sBox);
		Box_TypeValuable<Box_TypeValuable<Box_TypeValuable<String>>> zBox = new Box_TypeValuable<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}

}
