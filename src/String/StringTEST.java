package String;

public class StringTEST {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		}
		else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		}
		else {
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		}
		
//		int sum=0;
//		for (int i = 1; i < 11; i++) {
//			sum+=0.1;
//		}
//		System.out.println(sum ==1);
//		int sum1=0;
//		for (int i = 1; i < 11; i++) {
//			sum1=sum1+0.1;
//		}
//		System.out.println(sum1 ==1);
		
	}

}
