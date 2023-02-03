package Arrangement;

public class Grade {
	final private int Sub_Max = 3;
	private double[] arrSubject = new double[Sub_Max];
	private double sum;
	private double avg;
	private String gradeChar = "가";

	public Grade(double kor, double eng, double math) {
		this.arrSubject[0] = kor;
		this.arrSubject[1] = eng;
		this.arrSubject[2] = math;
		show();
	}

	double sum() {
		for (int i = 0; i < arrSubject.length; i++) {
			sum +=arrSubject[i];
		}
		return sum;
	}

	double avg() {
		avg = sum / arrSubject.length;
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
