package Variable;

public class ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

		AccessWay way = new AccessWay();
		way.num++; // 외부에서 인스턴스의 이름을 통한 접근
		AccessWay.num++; // 외부에서 클래스의 이름을 통한 접근
		InstCnt.instNum -= 15;
		System.out.println(InstCnt.instNum);

		System.out.println("num = " + AccessWay.num);

		Circle circle = new Circle(10);

	}

}
