package Interface;

interface Printable {
	public void print(String doc);
//	public abstract void print(String doc);
	// constant + abstract function(no body)
}

class Printer implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class Interface {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("Hello Java");
	}
}
