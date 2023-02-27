package _ThreadSyncronized;

public class ThreadSynchronization {

	public static void main(String[] args) {

		StringPrint sp = new StringPrint();

		Thread th1 = new PrintThread("a", sp);
		Thread th2 = new PrintThread("b", sp);
		Thread th3 = new PrintThread("c", sp);
		Thread th4 = new PrintThread("d", sp);
		Thread th5 = new PrintThread("f", sp);

		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();

	}

}
