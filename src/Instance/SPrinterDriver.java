package Instance;

public class SPrinterDriver implements IPrint {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}

}
