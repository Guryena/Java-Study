package _ThreadDelay;

public class ThreadDelay2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			if (i == 1) {
				break;
			}
			try {
				Thread.sleep(1000); //1초간 시간을 지연한다
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
