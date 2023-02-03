package This_EX;

public class TV_Main {

	public static void main(String[] args) {
		TV tvBlue = new TV(10, "용달블루");
		TV tvRed = new TV(70, "다라이레드");
		tvBlue.compareSize(tvRed);
		TV tvGreen = new TV(100, "옥상그린");
		tvGreen.compareSize(tvRed);
		
		System.out.println("============");
		TV tv = new TV(10, "용달블루");
		tv = new TV(70, "다라이레드");
		tvBlue.compareSize(tvRed);
		tv = new TV(100, "옥상그린");
		tvGreen.compareSize(tvBlue);
		System.out.println(tv.getSize() + "인치입니다.");
		System.out.println(tv.getColor() + "색 입니다.");
		
	}

}