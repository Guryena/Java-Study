package Instance;

public class LPrinterDriver implements IPrint {

	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}

}
