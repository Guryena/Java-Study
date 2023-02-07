package Overriding;

public class Grape extends Fruit {
	private String name;

	public Grape(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
