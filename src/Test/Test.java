package Test;

public class Test {

	public static void main(String[] args) {

//		- 클래스 Person과 Student 
//		- 프로그램 테스트 프로그램의 결과 : 8개 학기의 평균평점은 표준입력으로 받도록한다.

//		이름 : 김다정
//		나이 : 20
//
//		주소 : 서울시 관악구
//		학교 : 동양서울대학교
//		학과 : 전산정보학과
//		학번 : 20132222
//		----------------------------------------

		int i = 8;

		Student student = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", 20132222);
		student.print();
		System.out.println();
		student.setGrade();

//		8학기 학점을 순서대로 입력하세요
//
//		1학기 학점  → 3.37
//		2학기 학점  → 3.89
//		3학기 학점  → 4.35
//		4학기 학점  → 3.76
//		5학기 학점  → 3.89
//		6학기 학점  → 4.26
//		7학기 학점  → 4.89
//		8학기 학점  → 3.89
//
//		----------------------------------------
//
//		8학기 총 평균 평점은 4.0375점입니다.
	}

}