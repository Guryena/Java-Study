package PolymorphismEX;

public class CompFriend extends Friend {
	private String department;

	public CompFriend(String name, String department, String phone) {
		super(name, phone);
		this.department = department;
//		showInfo();
//		System.out.println();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Department : " + department);
	}

}
