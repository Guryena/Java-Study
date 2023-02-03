package Method;

public class test {
	public static void main(String[] args) {
		int kor = 75;
		int eng = 10;
		int math = 75;
		System.out.println(avg(kor, eng, math));
		
		char grade = grade(avg(kor, eng, math));
		System.out.println(grade + " 입니다.");
	}

	public static double avg(int kor, int eng, int math) {
		return (double) ((kor + eng + math) / 3);

	}
	
	public static char grade(double avg) {
		char grade = '가';

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else if (avg < 60) {
			grade = '가';
		}
		return grade;
	}
}
