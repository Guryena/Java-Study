package _WrapperClass;

import java.math.BigInteger;

public class Java_Math_BigInteger {

	public static void main(String[] args) {

		System.out.println("최대 정수 :  " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);
		System.out.println();
		
		
		BigInteger big1 = new BigInteger("100000000000");
		BigInteger big2 = new BigInteger("-99991999990");
		
		
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈 결과 : " +r1);
		
		BigInteger r2 = big1.multiply(big2);
		System.out.println("곱셈 결과 : " + r2);
		System.out.println();
		
		//Returns the value stored in the instance as an type-int integer
		int num = r1.intValueExact();
		System.out.println("From BigInteger : " +num);
		
		
	}

}
