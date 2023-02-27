package _ThreadDelay;

public class ThreadDelay3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 1) {
				break;
			}
			
			try {
				Thread.sleep(3000); //1초간 시간을 지연한다
			} catch (Exception e) {
				// TODO: handle exception
			}
	
		}

	}
}
