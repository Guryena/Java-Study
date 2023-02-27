package _Thread;

public class TreadTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.println(i+"a");
		}
		System.out.println("소요시간1 : " + (System.currentTimeMillis()-startTime));
		
		for (int i = 0; i < 300; i++) {
			System.out.println(i+"b");
		}
		System.out.println("소요시간2 : " + (System.currentTimeMillis()-startTime));
	}

}
