package _WrapperClass;

public class staticMethod {

	public static void main(String[] args) {
		//Two ways to create an instance with the class method
		Integer n1 = Integer.valueOf(5); //overloading //Create Integer instance to number-based
		Integer n2 = Integer.valueOf("1024");//Create Integer instance to String-based
		
		String str = String.valueOf(n2);
		
		
		//A class method that calculates the sum with the large and small comparisons  
		System.out.println("큰 수 : "+Integer.max(n1, n2));
		System.out.println("작은 수 : "+Integer.min(n1, n2));
		System.out.println("합 : "+Integer.sum(n1, n2));
		System.out.println();
		
		//A class method that return binary, octal, hexadecimal representation results for integers 
		System.out.println("12의 2진 표현 : "+Integer.toBinaryString(12));
		System.out.println("12의 8진 표현 : "+Integer.toOctalString(12));
		System.out.println("12의 16진 표현 : "+Integer.toHexString(12));
	}

}
