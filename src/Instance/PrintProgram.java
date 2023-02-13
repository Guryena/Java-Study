package Instance;

public class PrintProgram {

	public static void main(String[] args) {

		SamsungPrint sprint = new SamsungPrint();
		sprint.samsungPrint("SAMSUNG");

		LGPrint lprint = new LGPrint();
		lprint.lgPrint("LG");

		
		System.out.println();

		
		String myDoc = "This is a report about...";

		// print "Samsung Printer
		IPrint print = new SPrinterDriver();
		print.print(myDoc);
		System.out.println();

		// print LG Printer
		print = new LPrinterDriver();
		print.print(myDoc);
		
		
		System.out.println();
		
		
		Calc calc = new MyCalc();
		System.out.println(calc.add());
		System.out.println(calc.sub());
		
	}

}
