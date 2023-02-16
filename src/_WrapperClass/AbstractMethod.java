package _WrapperClass;

public class AbstractMethod {

	public static void main(String[] args) {
//		Integer num1 = new Integer(29);
		Integer num1 = 29; // Auto Boxing
		System.out.println(num1.intValue()); // return with int type value
		System.out.println(num1.doubleValue()); // return with double type value

		// ex
		double d = 3.14;
		Double num2 = new Double(3.14);
		System.out.println(num2.intValue());
		System.out.println((int) d); //change type
		System.out.println(num2.doubleValue());
		
		System.out.println(d);
	}

}
