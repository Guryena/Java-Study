package PolymorphismEX;

public class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String major, String phone) {
		super(name, phone);
		this.major = major;
//		showInfo();
//		System.out.println();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Major : " + major);
	}

}
