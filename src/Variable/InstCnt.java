package Variable;

class InstCnt {
	static int instNum = 100; //static : 따로 먼저 메모리에 올림
	//	공유변수 = 정적변수 = 클래스 변수
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 : "+instNum);
	}
}
