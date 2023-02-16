package _WrapperClass;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer iObj = 10; //boxing
		Double dObj = 3.14;

		System.out.println(iObj); //original address
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj.intValue(); //unBoxing
		double num2 = dObj.doubleValue();

		System.out.println(num1); 
		System.out.println(num2);
		
	}

}
