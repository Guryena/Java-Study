package Eextends_IS_A_Relation;

public class SmartPhone extends MobilePhone {
	private String androidVer; // Android OS ver

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
