package Object_and_Instance_2_test;

public class Test_num_test {

	public static void main(String[] args) {
		//-1 부터 num 까지 합을 구하는 class 를 작성하도록 하시오.
		Test_num num_sum = new Test_num();
		num_sum.set_num(10); //num
		double result = num_sum.get_sum();
		System.out.println(result);
	}

}
