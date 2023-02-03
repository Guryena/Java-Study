package Object_and_Instance_2_test;

public class Test_num {
	//-1 부터 num 까지 합을 구하는 class 를 작성하도록 하시오.
	double x;
	double sum;
	
	void set_num(double num) {
		x =num;
	}
	
	double get_sum() {
		for (int i = -1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
	
	
}
