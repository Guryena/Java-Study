package SetInterface;

public class Num {
	private int num;

	public Num(int n) {
		this.num = n;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (num == ((Num) obj).num) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return num % 3;
	}
}