package _ThreadSyncronized;

class PrintThread extends Thread{
	private StringPrint sp;
	private String str;
	
	public PrintThread(String s, StringPrint sp) {
		this.sp = sp;
		this.str = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sp.display(str);
	}
	
}