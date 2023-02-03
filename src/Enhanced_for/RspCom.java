package Enhanced_for;

import java.util.Random;

public class RspCom {
	public int myRSP() {
		Random random = new Random();
		int myRsp = (int) (random.nextInt(3) + 1);
		return myRsp;
	}
}
