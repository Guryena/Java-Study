package Enhanced_for;

import java.util.Random;

public class RspPlayer {
	private int rsp;
	private String result;

	public RspPlayer(int inputRsp) {
		this.rsp = inputRsp;
	}

	public String setResult() {
		RspCom com = new RspCom();
		if (rsp - com.myRSP() == 1 || rsp - com.myRSP() == -2) {
			result = "You Win";
		} else if (rsp == com.myRSP()) {
			result = "Draw";
		} else if (rsp - com.myRSP() == -1 || rsp - com.myRSP() == 2) {
			result = "You Lose";
		}
		return result;
	}

	public String tryM() {
		return "Retry (Y/N)";
	}

}
