package PolymorphismEX;

public class Friend {
	protected String name;
	protected String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);

	}
}
