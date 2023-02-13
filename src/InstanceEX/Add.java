package InstanceEX;

public class Add extends Calc {
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		int add = a+b;
		return add;
	}

}
