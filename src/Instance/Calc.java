package Instance;

public abstract class Calc {
	private int a = 1;
	private int b = 2;

	public int add() {
		return a + b;
	}

	// If abstract function have in class, must class have abstract
	public abstract int sub();

}
