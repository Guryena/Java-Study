package _ThreadSyncronized;

public class StringPrint{
	synchronized void display(String s) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() +":");
//			System.out.println(s +i+" ");
			
		}
		System.out.println();
	}
}

