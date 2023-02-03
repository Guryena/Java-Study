package _Console;

public class Grade {
	private double kor;
	private double eng;
	private double math;
	private double sum;
	private double avg;
	private String gradeChar = "가";

	public Grade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		show();
	}

	double sum() {
		sum = this.kor + this.eng + this.math;
		return sum;
	}

	double avg() {
		avg = sum / 3;
		return avg;
	}

	String grade() {
		if (avg >= 90) {
			gradeChar = "수";
		} else if (avg >= 80) {
			gradeChar = "우";
		} else if (avg >= 70) {
			gradeChar = "미";
		} else if (avg >= 60) {
			gradeChar = "양";
		}
		return gradeChar;
	}
	
	void show() {
		System.out.println("총점 : " + sum());

		System.out.println("평균 : " + avg());

		System.out.println("학점은 " + grade()+ "입니다");
		
		System.out.println("계속 하겠습니까? (Y/N)");
	}
	

}
