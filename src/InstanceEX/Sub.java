package InstanceEX;

public class Sub extends Calc {
	@Override
	public void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		int sub = a-b;
		return sub;
	}

}
