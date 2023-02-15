package EqualsMethod;

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.num == ((INum) obj).num) {
			return true;
		} else {
			return false;
		}
	}

}
