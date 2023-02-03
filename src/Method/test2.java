package Method;

public class test2 {

	public static void main(String[] args) {
//		"char grade = grade(avg(90, 80, 100))
//		-  System.out.println(grade +  "" 입니다.""); // 수입니다.
//		"
		int kor=90;
		int eng = 80;
		int math = 100;
		System.out.println(avg(kor, eng, math));
		
		char grade = grade(avg(kor, eng, math));
		System.out.println(grade +  " 입니다.");		
		oneToHap(10);
		toHap(2, 10);
	}
//	"oneToHap(10)
//	-1부터 10까지의 합
//	toHap(2,10)
//	-2 부터 10까지의 합"
	public static double avg(int x, int y, int z ) {
		double avge = (double)((x + y+z)/3);
		return avge;
	}
	public static char grade(double x) {
		char _char_grade = '가';
		if (x>=90) {
			_char_grade = '수';
		}
		else if (x>=80) {
			_char_grade = '우';
		}
		else if (x>=70) {
			_char_grade = '미';
		}
		else if (x>=60) {
			_char_grade = '양';
		}
		return _char_grade;
	}
	public static void oneToHap(int x) {
		int sum = 0;
		for (int i = 0; i <= x; i++) {
			sum += i;	
		}
		System.out.println(sum);
	}
	public static void toHap(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}


}
