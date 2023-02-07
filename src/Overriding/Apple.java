package Overriding;

public class Apple extends Fruit {
	private String name;

	public Apple(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
}
