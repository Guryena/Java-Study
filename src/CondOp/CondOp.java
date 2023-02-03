package CondOp;

public class CondOp {

	public static void main(String[] args) {
		int num1 = 80;
		int num2 = 33;
		int num3 = 55;
		int max;
		int diff;

		max = (num1 > num2) ?(
				(num1 > num3) ? num1 : num3
						) : (
								(num2 > num3) ? num2 : num3);
		System.out.println("최대값 : " + max);

		int num = -10;
		
		if (num >0) {
			System.out.println(num);
		}
		else if (num<0) {
			System.out.println(-num);
		}
		else if(num==0) {
			System.out.println(0);
		}
		
		diff = num1 > num2 ? num1 - num2 : num2 - num1;
		System.out.println("절대값 : " + diff);
	}

}
