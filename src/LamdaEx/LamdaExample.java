package LamdaEx;


interface Printable {
	public abstract void print(String s);
}


//class Printer implements Printable {
//
//	@Override
//	public void print(String s) {
//		// TODO Auto-generated method stub
//		System.out.println(s);
//		
//	}
//	
//}


public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lamda");
		
//		Printable prn = new Printer();
		
		Printable prn =  (s) -> {
			System.out.println(s);
		};
		
		prn.print("Lamda Printer");
	}
	
}
