package Arrangement;

public class Java {
	private String[] splitChar1;
	private String[] splitChar2;

	public Java(String j1, String j2) {
		splitChar1 = j1.split("\\.");
		splitChar2 = j2.split("\\.");
		show();
	}

	private void show() {

		for (int i = 0; i < splitChar1.length; i++) {
			System.out.println("파일이름은 " + splitChar1[i] + "이며 확장자는 " + splitChar1[splitChar1.length - 1] + "입니다.");
			if (splitChar1.length == 2) {
				break;
			}

		}
		for (int i = 0; i < splitChar2.length; i++) {
			System.out.println("파일이름은 " + splitChar2[i] + "이며 확장자는 " + splitChar2[splitChar2.length - 1] + "입니다.");
			if (splitChar2.length == 2) {
				break;
			}
		}
		System.out.println("계속 하겠습니까? (Y/N)");
	}

}
