package Method;

public class Method_EX2 {

	public static void main(String[] args) {
		hello();
		hello2(1, 2);

		for (int i = 1; i <= 5; i++) {
			hello2(i, i);
		}

		int result = add(1, 2);
		System.out.println(result);

		int mull = mul(3, 5);
		System.out.println(mull);

		int kor = 75;
		int eng = 10;
		int math = 75;
		double avg = avg(kor, eng, math);
		System.out.println(avg);

		char grade = grade(avg);
		System.out.println(grade + " 입니다.");

		danPrint(3);

		starPrint(5);

		starReversePrint(5);

		System.out.println(oneToHap(10));

		System.out.println(toHap(2, 10));
	}

	public static void hello() {
		System.out.println("hello");
	}

	public static void hello2(int num, int num2) {
		System.out.println("hello" + num);
		System.out.println("ello" + num2);
	}

	public static int add(int num3, int num4) {
		int result = num3 + num4;
		return result;
	}

	public static int sub(int num5, int num6) {
		int result = num5 + num6;
		return result;
	}

	public static int mul(int num7, int num8) {
		int mull = num7 * num8;
		return mull;
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

	public static void danPrint(int dan) {
//		int x = 9;
//		int mul =0;
//		for (int i = dan; i <=dan; i++) {
//			for (int j = 1; j <= x; j++) {
//				mul = i*j;
//				System.out.println(i+" x " + j + " = "+ mul);
//			}
//		}
		for (int i = 0; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + i * dan);
		}

	}

	public static void starPrint(int num9) {
		for (int i = 1; i <= num9; i++) {
			for (int j = 1; j <= i; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}


	public static void starReversePrint(int num10) {
		for (int i = num10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static int oneToHap(int num11) {
		int sum = 0;
		for (int i = 0; i <= num11; i++) {
			sum += i;
		}
		return sum;
	}


	public static int toHap(int num12, int num13) {
		int sum = 0;
		for (int i = num12; i <= num13; i++) {
			sum += i;
		}
		return sum;
	}

}
