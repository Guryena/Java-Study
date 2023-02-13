package InstanceEX;

public class Mul extends Calc {
	@Override
	public void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		int mul = a*b;
		return mul;
	}

}
