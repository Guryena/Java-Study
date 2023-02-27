package _Thread;

public class MultyTreadTest {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
										//Never direct run in Thread because 'th1.run();' is single thread
										//th1.run();
		th1.run();
		th2.run();
//		th1.start();
//		th2.start();
		
		System.out.println("mian end");
	}

}

class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println(i + "a");
		}
	}
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println(i + "b");
		}
	}
}