package Object_andInstance_3;

public class Grade {

	int kor;
	int eng;
	int math;
	double avg;
	char grade = '가';
	void init_grade(int kor, int eng, int math) {
		this.kor +=kor;
		this.eng += eng;
		this.math += math;
	}
	
	double get_Avg() {
		avg = (double)((this.kor+this.eng+this.math)/3);
		return avg;
	}
	char get_Grade() {
//		char grade = '가';
		if (avg >=90) {
			grade = '수';
		}
		else if (avg >=80) {
			grade = '우';
		}
		else if (avg >=70) {
			grade = '미';
		}
		else if (avg >=60) {
			grade = '양';
		}
		return grade;
	}
	
}
