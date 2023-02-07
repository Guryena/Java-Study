package Overriding;

public class Ship extends Fruit {
	private String name;

	public Ship(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
